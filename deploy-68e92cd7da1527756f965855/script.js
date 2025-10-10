// Static data - Products and Reviews
const PRODUCTS_DATA = [
    {
        id: 1,
        name: "OW-100 Openwell Pump",
        category: "openwell-pumpset",
        description: "High-efficiency openwell pump suitable for irrigation and domestic use",
        specifications: [
            { key: "Power", value: "1 HP" },
            { key: "Head", value: "30-50 meters" },
            { key: "Discharge", value: "100-150 LPM" },
            { key: "Material", value: "Cast Iron" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: true
    },
    {
        id: 2,
        name: "OW-200 Heavy Duty Openwell Pump",
        category: "openwell-pumpset",
        description: "Heavy-duty openwell pump for industrial applications",
        specifications: [
            { key: "Power", value: "2 HP" },
            { key: "Head", value: "40-70 meters" },
            { key: "Discharge", value: "200-300 LPM" },
            { key: "Material", value: "Stainless Steel" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: false
    },
    {
        id: 3,
        name: "V3-75 Submersible Pump",
        category: "v3-submersible-pumpset",
        description: "Compact V3 submersible pump for residential water supply",
        specifications: [
            { key: "Power", value: "0.75 HP" },
            { key: "Head", value: "25-40 meters" },
            { key: "Discharge", value: "80-120 LPM" },
            { key: "Bore Size", value: "3 inch" }
        ],
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop",
        featured: true
    },
    {
        id: 4,
        name: "V3-100 Submersible Pump",
        category: "v3-submersible-pumpset",
        description: "Reliable V3 submersible pump with enhanced performance",
        specifications: [
            { key: "Power", value: "1 HP" },
            { key: "Head", value: "30-50 meters" },
            { key: "Discharge", value: "100-150 LPM" },
            { key: "Bore Size", value: "3 inch" }
        ],
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop",
        featured: false
    },
    {
        id: 5,
        name: "V4-150 Submersible Pump",
        category: "v4-submersible-pumpset",
        description: "High-performance V4 submersible pump for commercial use",
        specifications: [
            { key: "Power", value: "1.5 HP" },
            { key: "Head", value: "35-60 meters" },
            { key: "Discharge", value: "150-250 LPM" },
            { key: "Bore Size", value: "4 inch" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: true
    },
    {
        id: 6,
        name: "DS-50 Domestic Pump",
        category: "domestic-series",
        description: "Compact domestic pump for household water supply",
        specifications: [
            { key: "Power", value: "0.5 HP" },
            { key: "Head", value: "20-35 meters" },
            { key: "Discharge", value: "60-100 LPM" },
            { key: "Type", value: "Self Priming" }
        ],
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop",
        featured: true
    },
    {
        id: 7,
        name: "PVC Tape - Premium Quality",
        category: "pvc-insulation-tape",
        description: "High-quality PVC insulation tape for electrical applications",
        specifications: [
            { key: "Width", value: "19mm" },
            { key: "Length", value: "20 meters" },
            { key: "Thickness", value: "0.13mm" },
            { key: "Color", value: "Multiple Colors" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: false
    },
    {
        id: 8,
        name: "Copper Cable - 2.5 sq mm",
        category: "cable",
        description: "High-grade copper cable for electrical installations",
        specifications: [
            { key: "Size", value: "2.5 sq mm" },
            { key: "Material", value: "Pure Copper" },
            { key: "Insulation", value: "PVC" },
            { key: "Length", value: "90 meters" }
        ],
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop",
        featured: true
    }
];

const REVIEWS_DATA = [
    {
        id: 1,
        customerName: "Rajesh Patil",
        rating: 5,
        review: "Excellent quality pumps! Been using for 3 years without any issues.",
        product: "V3 Submersible Pump"
    },
    {
        id: 2,
        customerName: "Sunita Sharma",
        rating: 5,
        review: "Great service and reliable products. Highly recommended!",
        product: "Domestic Series"
    },
    {
        id: 3,
        customerName: "Amit Kumar",
        rating: 4,
        review: "Good quality products at reasonable prices. Quick delivery.",
        product: "Openwell Pump"
    },
    {
        id: 4,
        customerName: "Priya Desai",
        rating: 5,
        review: "Professional service and excellent after-sales support.",
        product: "V4 Submersible"
    },
    {
        id: 5,
        customerName: "Mahesh Joshi",
        rating: 5,
        review: "Best electrical hardware shop in the area. Trusted quality."
    }
];

// Global state
let currentSection = 'home';
let currentCategory = 'all';

// DOM Elements
const sections = document.querySelectorAll('.section');
const navButtons = document.querySelectorAll('.nav-btn');
const mobileMenuBtn = document.getElementById('mobileMenuBtn');
const mobileNav = document.getElementById('mobileNav');
const signInBtn = document.getElementById('signInBtn');
const signInModal = document.getElementById('signInModal');
const closeModal = document.getElementById('closeModal');
const continueWithoutAccount = document.getElementById('continueWithoutAccount');
const contactForm = document.getElementById('contactForm');
const toast = document.getElementById('toast');
const toastMessage = document.getElementById('toastMessage');
const filterButtons = document.querySelectorAll('.filter-btn');
const featuredProductsContainer = document.getElementById('featuredProducts');
const productsGrid = document.getElementById('productsGrid');
const reviewsGrid = document.getElementById('reviewsGrid');

// Initialize the application
document.addEventListener('DOMContentLoaded', function() {
    initializeNavigation();
    initializeMobileMenu();
    initializeModal();
    initializeContactForm();
    initializeProductFilter();
    loadFeaturedProducts();
    loadAllProducts();
    loadReviews();
    initializeAuthToggle();
    
    // Set initial section
    showSection('home');
});

// Navigation Functions
function initializeNavigation() {
    navButtons.forEach(button => {
        button.addEventListener('click', function() {
            const section = this.getAttribute('data-section');
            showSection(section);
            
            // Close mobile menu if open
            mobileNav.classList.remove('active');
        });
    });

    // Handle footer links
    document.querySelectorAll('footer a[data-section]').forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            const section = this.getAttribute('data-section');
            showSection(section);
        });
    });

    // Handle hero buttons
    document.querySelectorAll('.hero-buttons .btn').forEach(button => {
        button.addEventListener('click', function() {
            const section = this.getAttribute('data-section');
            showSection(section);
        });
    });
}

function showSection(sectionName) {
    // Hide all sections
    sections.forEach(section => {
        section.classList.remove('active');
    });

    // Show selected section
    const targetSection = document.getElementById(sectionName);
    if (targetSection) {
        targetSection.classList.add('active');
    }

    // Update navigation buttons
    navButtons.forEach(button => {
        button.classList.remove('active');
        if (button.getAttribute('data-section') === sectionName) {
            button.classList.add('active');
        }
    });

    // Update current section
    currentSection = sectionName;

    // Scroll to top
    window.scrollTo({ top: 0, behavior: 'smooth' });
}

// Mobile Menu Functions
function initializeMobileMenu() {
    mobileMenuBtn.addEventListener('click', function() {
        mobileNav.classList.toggle('active');
        
        // Toggle hamburger animation
        this.classList.toggle('active');
    });

    // Close mobile menu when clicking outside
    document.addEventListener('click', function(e) {
        if (!mobileMenuBtn.contains(e.target) && !mobileNav.contains(e.target)) {
            mobileNav.classList.remove('active');
            mobileMenuBtn.classList.remove('active');
        }
    });
}

// Modal Functions
function initializeModal() {
    signInBtn.addEventListener('click', function() {
        signInModal.classList.add('active');
    });

    closeModal.addEventListener('click', function() {
        signInModal.classList.remove('active');
    });

    continueWithoutAccount.addEventListener('click', function() {
        signInModal.classList.remove('active');
    });

    // Close modal when clicking outside
    signInModal.addEventListener('click', function(e) {
        if (e.target === signInModal) {
            signInModal.classList.remove('active');
        }
    });

    // Handle anonymous sign in
    document.getElementById('anonymousSignIn').addEventListener('click', function() {
        showToast('Signed in anonymously', 'success');
        signInModal.classList.remove('active');
        
        // Update sign in button to show user is logged in
        signInBtn.textContent = 'My Account';
        signInBtn.onclick = function() {
            showSection('profile');
        };
    });
}

// Contact Form Functions
function initializeContactForm() {
    contactForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        // Get form data
        const formData = new FormData(contactForm);
        const data = {
            name: formData.get('name'),
            phone: formData.get('phone'),
            email: formData.get('email'),
            product: formData.get('product'),
            message: formData.get('message')
        };

        // Basic validation
        if (!data.name || !data.phone || !data.email || !data.message) {
            showToast('Please fill in all required fields', 'error');
            return;
        }

        // Email validation
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(data.email)) {
            showToast('Please enter a valid email address', 'error');
            return;
        }

        // Phone validation
        const phoneRegex = /^[0-9]{10}$/;
        if (!phoneRegex.test(data.phone.replace(/\D/g, ''))) {
            showToast('Please enter a valid 10-digit phone number', 'error');
            return;
        }

        // Simulate form submission
        showToast('Your query has been submitted successfully! We\'ll get back to you soon.', 'success');
        
        // Reset form
        contactForm.reset();
    });
}

// Product Filter Functions
function initializeProductFilter() {
    filterButtons.forEach(button => {
        button.addEventListener('click', function() {
            const category = this.getAttribute('data-category');
            
            // Update active button
            filterButtons.forEach(btn => btn.classList.remove('active'));
            this.classList.add('active');
            
            // Filter products
            currentCategory = category;
            loadAllProducts();
        });
    });
}

// Data Loading Functions
function loadFeaturedProducts() {
    const featuredProducts = PRODUCTS_DATA.filter(product => product.featured);
    featuredProductsContainer.innerHTML = '';

    featuredProducts.forEach(product => {
        const productCard = createProductCard(product);
        featuredProductsContainer.appendChild(productCard);
    });
}

function loadAllProducts() {
    let filteredProducts = PRODUCTS_DATA;
    
    if (currentCategory !== 'all') {
        filteredProducts = PRODUCTS_DATA.filter(product => product.category === currentCategory);
    }

    productsGrid.innerHTML = '';

    filteredProducts.forEach(product => {
        const productCard = createProductCard(product);
        productsGrid.appendChild(productCard);
    });
}

function loadReviews() {
    reviewsGrid.innerHTML = '';

    REVIEWS_DATA.forEach(review => {
        const reviewCard = document.createElement('div');
        reviewCard.className = 'review-card';
        
        const stars = '★'.repeat(review.rating) + '☆'.repeat(5 - review.rating);
        
        reviewCard.innerHTML = `
            <div class="review-rating">
                <div class="stars">${stars}</div>
                <span>(${review.rating}/5)</span>
            </div>
            <p class="review-text">"${review.review}"</p>
            <div class="review-author">
                <h4>${review.customerName}</h4>
                ${review.product ? `<p class="review-product">${review.product}</p>` : ''}
            </div>
        `;
        
        reviewsGrid.appendChild(reviewCard);
    });
}

function createProductCard(product) {
    const productCard = document.createElement('div');
    productCard.className = 'product-card';
    
    const specsHtml = product.specifications.slice(0, 2).map(spec => 
        `<div class="product-spec">
            <span class="spec-key">${spec.key}:</span>
            <span class="spec-value">${spec.value}</span>
        </div>`
    ).join('');
    
    productCard.innerHTML = `
        <img src="${product.image}" alt="${product.name}">
        <div class="product-card-content">
            <h3>${product.name}</h3>
            <p>${product.description}</p>
            <div class="product-specs">
                ${specsHtml}
            </div>
            <button class="product-btn" onclick="showQuoteForm('${product.name}')">Get Quote</button>
        </div>
    `;
    
    return productCard;
}

// Auth Toggle Functions
function initializeAuthToggle() {
    const authToggleBtn = document.getElementById('authToggleBtn');
    const authToggleText = document.getElementById('authToggleText');
    const signInForm = document.getElementById('signInForm');
    let isSignUp = false;

    authToggleBtn.addEventListener('click', function() {
        isSignUp = !isSignUp;
        
        if (isSignUp) {
            authToggleText.textContent = 'Already have an account? ';
            authToggleBtn.textContent = 'Sign in instead';
            signInForm.querySelector('button[type="submit"]').textContent = 'Sign Up';
        } else {
            authToggleText.textContent = 'Don\'t have an account? ';
            authToggleBtn.textContent = 'Sign up instead';
            signInForm.querySelector('button[type="submit"]').textContent = 'Sign In';
        }
    });

    signInForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        const formData = new FormData(signInForm);
        const email = formData.get('email');
        const password = formData.get('password');
        
        if (!email || !password) {
            showToast('Please fill in all fields', 'error');
            return;
        }
        
        if (isSignUp) {
            showToast('Account created successfully! You are now signed in.', 'success');
        } else {
            showToast('Signed in successfully!', 'success');
        }
        
        signInModal.classList.remove('active');
        signInBtn.textContent = 'My Account';
        signInBtn.onclick = function() {
            showSection('profile');
        };
    });
}

// Utility Functions
function showToast(message, type = 'success') {
    toastMessage.textContent = message;
    toast.className = `toast ${type} show`;
    
    setTimeout(() => {
        toast.classList.remove('show');
    }, 4000);
}

function showQuoteForm(productName) {
    // Pre-fill the contact form with the product name
    const productSelect = document.getElementById('product');
    if (productSelect) {
        productSelect.value = productName;
    }
    
    // Navigate to contact section
    showSection('contact');
    
    // Scroll to form
    setTimeout(() => {
        const form = document.getElementById('contactForm');
        if (form) {
            form.scrollIntoView({ behavior: 'smooth', block: 'start' });
        }
    }, 100);
}

// Smooth scrolling for anchor links
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute('href'));
        if (target) {
            target.scrollIntoView({
                behavior: 'smooth',
                block: 'start'
            });
        }
    });
});

// Add loading animation for images
document.addEventListener('DOMContentLoaded', function() {
    const images = document.querySelectorAll('img');
    images.forEach(img => {
        img.addEventListener('load', function() {
            this.style.opacity = '1';
        });
        
        // Set initial opacity for smooth loading
        img.style.opacity = '0';
        img.style.transition = 'opacity 0.3s ease';
    });
});

// Handle form validation styling
document.addEventListener('DOMContentLoaded', function() {
    const inputs = document.querySelectorAll('input, select, textarea');
    
    inputs.forEach(input => {
        input.addEventListener('blur', function() {
            if (this.hasAttribute('required') && !this.value.trim()) {
                this.style.borderColor = '#ef4444';
            } else {
                this.style.borderColor = '#cbd5e1';
            }
        });
        
        input.addEventListener('focus', function() {
            this.style.borderColor = '#2563eb';
        });
    });
});

// Add intersection observer for animations
const observerOptions = {
    threshold: 0.1,
    rootMargin: '0px 0px -50px 0px'
};

const observer = new IntersectionObserver(function(entries) {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.style.opacity = '1';
            entry.target.style.transform = 'translateY(0)';
        }
    });
}, observerOptions);

// Observe elements for animation
document.addEventListener('DOMContentLoaded', function() {
    const animatedElements = document.querySelectorAll('.product-card, .feature, .review-card, .stat-card');
    
    animatedElements.forEach(el => {
        el.style.opacity = '0';
        el.style.transform = 'translateY(20px)';
        el.style.transition = 'opacity 0.6s ease, transform 0.6s ease';
        observer.observe(el);
    });
});

// Handle window resize for mobile menu
window.addEventListener('resize', function() {
    if (window.innerWidth > 768) {
        mobileNav.classList.remove('active');
        mobileMenuBtn.classList.remove('active');
    }
});

// Add keyboard navigation support
document.addEventListener('keydown', function(e) {
    // Close modal with Escape key
    if (e.key === 'Escape') {
        signInModal.classList.remove('active');
        mobileNav.classList.remove('active');
        mobileMenuBtn.classList.remove('active');
    }
    
    // Navigate sections with arrow keys (when no input is focused)
    if (!['INPUT', 'TEXTAREA', 'SELECT'].includes(document.activeElement.tagName)) {
        if (e.key === 'ArrowLeft' || e.key === 'ArrowRight') {
            const sections = ['home', 'products', 'about', 'contact'];
            const currentIndex = sections.indexOf(currentSection);
            
            if (e.key === 'ArrowLeft' && currentIndex > 0) {
                showSection(sections[currentIndex - 1]);
            } else if (e.key === 'ArrowRight' && currentIndex < sections.length - 1) {
                showSection(sections[currentIndex + 1]);
            }
        }
    }
});
