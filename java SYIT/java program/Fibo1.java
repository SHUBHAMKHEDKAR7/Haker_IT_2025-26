import java.util.*;
public class Fibo1{
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
for(int i = 2; i<n; i++){
System.out.println(fibo(i)+ " ");

}
}
}
public static void fibo(int n){
if(n <= 1) return n;
return fibo(n - 1) + fibo(n - 2);
}

}