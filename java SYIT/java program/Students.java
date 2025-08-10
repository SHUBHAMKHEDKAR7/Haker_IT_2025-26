public class Students
{
int roll;
String name;
int marks;
public Students(int roll, String name, int marks){
this.roll = roll;
this.name = name; 
this.marks = marks;
}
void Display()
{
System.out.println("Roll NO is:"+roll+"\nName is: "+name+"\nMarks is: "+marks);
}
public static void main(String args[])
{
Students s = new Students(52 , "Shubham" , 100);
s.Display();
}
}