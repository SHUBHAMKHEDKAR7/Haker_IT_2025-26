public class Demo{
int roll = 0;
String name = null;
public Demo(int roll, String name){
this.roll = roll;
this.name = name;
System.out.println(roll+" "+name);
}
public static void main(String args[]){
Demo d = new Demo(52 , "shubham");
}
}