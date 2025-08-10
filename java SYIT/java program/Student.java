public class Student{
int roll ;
String name ;
int marks;
public Student(int r, String n, int m){
roll = r;
name = n;
marks = m;
System.out.println(roll+" "+name+ " "+ marks);
}
public Student(Student inf)
{
roll = inf.roll;
name = inf.name;
marks = inf.marks;
System.out.println(roll+" "+name +" " +marks);

}
public static void main(String args[]){
Student s = new Student(52 , "shubham", 50);
Student s1 = new Student(s);
}
}