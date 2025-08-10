import java.util.*;
public class Swap1{
public static void main(String[] args){
int a, b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the NO A:");
System.out.println("Enter the NO B:");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Before swaping A is:"+a);
System.out.println("Before swaping B is:"+b);
a = a + b;
b = a - b; 
a = a - b;

System.out.println("After swaping A is:"+a);
System.out.println("After swaping B is:"+b);

}
}