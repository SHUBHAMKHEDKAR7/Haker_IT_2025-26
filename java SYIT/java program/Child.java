//write a program to demonstrate inheritance and method overloading 
class Parents
{
String Surname  = "Khedkar";
int Balance = 100000;
public void Display()
{
System.out.println("Surname is :"+Surname+" Balance is :"+Balance);
}
public void NAME(){
System.out.println("...END...");
}
}

public class Child extends Parents
{
public static void main(String[] args)
{
Child c = new Child();
c.Display();
c.NAME();
}
}
