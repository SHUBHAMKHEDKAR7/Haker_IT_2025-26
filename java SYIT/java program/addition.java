import java.util.Scanner;
public class addition {
public static void main(String[] args) {
int size, sum = 0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size:");
size = sc.nextInt();
int a[] = new int[size];
System.out.println("Enter the element:");
for(int i=0; i<size; i++)
{
a[i]=sc.nextInt();
sum = sum + a[i];
}
System.out.println("sum is:"+sum);
}
}
