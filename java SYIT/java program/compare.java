import java.util.Scanner;
public class compare{
public static void main(String[] args) {
int a, b, c;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the three NO.\na\nb\nc\n");
a =sc.nextInt();
b =sc.nextInt();
c =sc.nextInt();
if(a>b && a>c)
{
System.out.println("a is greter");
}
else if(b>c && b>a)
{
System.out.println("b is greter");
}
else{
System.out.println("c is greter");
}
}
}