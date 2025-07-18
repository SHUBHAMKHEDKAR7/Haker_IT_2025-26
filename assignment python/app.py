from flask import Flask, render_template, request, redirect, url_for, flash, session
from flask_sqlalchemy import SQLAlchemy
from datetime import datetime
import random
import os

app = Flask(__name__)
app.config['SECRET_KEY'] = 'your-secret-key'
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///fitness_tracker.db'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db = SQLAlchemy(app)

# Make user available to all templates
@app.context_processor
def inject_user():
    if 'user_id' in session:
        user = User.query.get(session['user_id'])
        return dict(user=user)
    return dict(user=None)

# Database Models
class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(80), unique=True, nullable=False)
    password = db.Column(db.String(120), nullable=False)
    name = db.Column(db.String(100))
    age = db.Column(db.Integer)
    gender = db.Column(db.String(10))
    is_admin = db.Column(db.Boolean, default=False)
    registration_date = db.Column(db.DateTime, default=datetime.utcnow)
    goals = db.relationship('Goal', backref='user', lazy=True)
    progress = db.relationship('Progress', backref='user', lazy=True)

class Goal(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)
    target_weight = db.Column(db.Float)
    daily_steps = db.Column(db.Integer)
    workout_minutes = db.Column(db.Integer)
    calories_burn = db.Column(db.Integer)
    created_at = db.Column(db.DateTime, default=datetime.utcnow)

class Progress(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)
    current_weight = db.Column(db.Float)
    steps_today = db.Column(db.Integer)
    workout_minutes = db.Column(db.Integer)
    calories_burned = db.Column(db.Integer)
    date = db.Column(db.DateTime, default=datetime.utcnow)

# Exercise recommendations
EXERCISE_RECOMMENDATIONS = {
    'beginner': [
        {'name': 'Walking', 'duration': '30 minutes', 'calories': '150-200'},
        {'name': 'Yoga', 'duration': '20 minutes', 'calories': '100-150'},
        {'name': 'Light Cycling', 'duration': '20 minutes', 'calories': '150-200'}
    ],
    'intermediate': [
        {'name': 'Running', 'duration': '20 minutes', 'calories': '200-300'},
        {'name': 'Swimming', 'duration': '30 minutes', 'calories': '250-350'},
        {'name': 'Cycling', 'duration': '30 minutes', 'calories': '200-300'}
    ],
    'advanced': [
        {'name': 'HIIT', 'duration': '20 minutes', 'calories': '300-400'},
        {'name': 'Running (Fast Pace)', 'duration': '30 minutes', 'calories': '400-500'},
        {'name': 'CrossFit', 'duration': '30 minutes', 'calories': '350-450'}
    ]
}

# Routes
@app.route('/')
def index():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    user = User.query.get(session['user_id'])
    if not user:
        session.pop('user_id', None)
        return redirect(url_for('login'))
    
    goal = Goal.query.filter_by(user_id=session['user_id']).order_by(Goal.created_at.desc()).first()
    
    today = datetime.utcnow().date()
    progress = Progress.query.filter(
        Progress.user_id == session['user_id'],
        db.func.date(Progress.date) == today
    ).first()
    
    return render_template('dashboard.html', user=user, goal=goal, progress=progress)

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        user = User.query.filter_by(username=username, password=password).first()
        if user:
            session['user_id'] = user.id
            return redirect(url_for('index'))
        flash('Invalid credentials')
    return render_template('login.html')

@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        name = request.form['name']
        age = request.form['age']
        gender = request.form['gender']
        
        if User.query.filter_by(username=username).first():
            flash('Username already exists')
            return redirect(url_for('register'))
        
        user = User(username=username, password=password, name=name, age=age, gender=gender)
        db.session.add(user)
        db.session.commit()
        return redirect(url_for('login'))
    return render_template('register.html')

@app.route('/set_goals', methods=['GET', 'POST'])
def set_goals():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    if request.method == 'POST':
        goal = Goal(
            user_id=session['user_id'],
            target_weight=float(request.form['target_weight']),
            daily_steps=int(request.form['daily_steps']),
            workout_minutes=int(request.form['workout_minutes']),
            calories_burn=int(request.form['calories_burn'])
        )
        db.session.add(goal)
        db.session.commit()
        return redirect(url_for('index'))
    return render_template('set_goals.html')

@app.route('/track_progress', methods=['GET', 'POST'])
def track_progress():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    if request.method == 'POST':
        progress = Progress(
            user_id=session['user_id'],
            current_weight=float(request.form['current_weight']),
            steps_today=int(request.form['steps_today']),
            workout_minutes=int(request.form['workout_minutes']),
            calories_burned=int(request.form['calories_burned'])
        )
        db.session.add(progress)
        db.session.commit()
        return redirect(url_for('index'))
    return render_template('track_progress.html')

@app.route('/recommendations')
def recommendations():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    user = User.query.get(session['user_id'])
    level = 'beginner'  # Default level
    if user.age < 30:
        level = 'advanced'
    elif user.age < 50:
        level = 'intermediate'
    
    return render_template('recommendations.html', 
                         exercises=EXERCISE_RECOMMENDATIONS[level],
                         level=level)

@app.route('/logout')
def logout():
    session.pop('user_id', None)
    return redirect(url_for('login'))

@app.route('/admin/dashboard')
def admin_dashboard():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    user = User.query.get(session['user_id'])
    if not user or not user.is_admin:
        flash('Access denied. Admin privileges required.')
        return redirect(url_for('index'))
    
    users = User.query.all()
    return render_template('admin_dashboard.html', users=users)

if __name__ == '__main__':
    with app.app_context():
        # Create tables if they don't exist
        db.create_all()
        
        # Create admin user only if it doesn't exist
        admin = User.query.filter_by(username='admin').first()
        if not admin:
            admin = User(
                username='admin',
                password='admin123',  # You should change this password
                name='Administrator',
                is_admin=True,
                registration_date=datetime.utcnow()
            )
            db.session.add(admin)
            db.session.commit()
        
    app.run(debug=True) 