import java.util.*;
public class Sum{
public static void main(String[] args){
int n, sumE = 0, sumO = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter the NO.");
for(int i = 0; i<n; i++)
{
a[i] = sc.nextInt();
}
for(int i = 0; i<n; i++)
{
if(a[i]%2 == 0)
{
sumE = sumE + a[i];
}
else{
sumO = sumO + a[i];
}
}
System.out.println("Sum of even is:"+sumE);
System.out.println("Sum of odd is:"+sumO);

}
}