import java.util.*;
public class Fibo{
public static void main(String[] args){
int a = 0, b = 1, n, c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the series Number:");
n = sc.nextInt();
if(n<=0){
System.out.println("Please Enter the Positive NO: ");
}
else if (n == 1){
System.out.println(a);
}
else{
System.out.println(a);
System.out.println(b);
for(int i = 2; i<n; i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
}