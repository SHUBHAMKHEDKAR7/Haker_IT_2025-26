import java.util.*;
public class Swap{
public static void main(String[] args){
int a, b;
int swap;
Scanner sc = new Scanner("System.in");
System.out.println("Enter the NO A:");
System.out.println("Enter the NO B:");
a = sc.nextInt();
b = sc.nextInt();

System.out.println("Before swaping A is:"+a);
System.out.println("Before swaping B is:"+b);

swap = a;
a = b;
b = swap;

System.out.println("After swaping A is:"+a);
System.out.println("After swaping B is:"+b);
}

}