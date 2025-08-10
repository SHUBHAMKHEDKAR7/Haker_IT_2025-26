public class Student5{
int roll;
String name;
int mark;
public Student5(){
roll = 5;
name = "Shubham";
mark = 50;
System.out.println("Roll NO is: "+roll+" Name is: "+name+ " Mark is: "+mark);

}
public Student5(int r){
roll = r;
System.out.println("Roll NO is: "+roll);
}
public Student5(int r, String n){
roll = r;
name = n;
System.out.println("Roll NO is: "+roll+ " Name is:"+name);
}
public Student5(int r, String n, int m){
roll = r;
name = n;
mark = m;
System.out.println("Roll NO is: "+roll+" Name is: "+name+ " Mark is: "+mark);
}
public static void main(String[] args){
Student5 s1 = new Student5();
Student5 s2 = new Student5(51);
Student5 s3 = new Student5(60 , "Kshitij");
Student5 s4 = new Student5(85 , "abc" , 75);

}
}