import java.util.Scanner;
public class fact{
public static void main(String args[])
{
int fact = 1, a;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the NO:");
a = sc.nextInt();
for(int i = 1; i<=a; i++)
{
fact = fact*i;
}
System.out.println("factorial is:"+fact);
}
}