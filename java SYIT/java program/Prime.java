import java.util.*;
public class Prime{
public static void main(String[] args){
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the NO:");
num = sc.nextInt();
for(int i = 2; i<=num; i++){
if(i%2 == 0){
System.out.println("is not prime NO:");
break;
}
else{
System.out.println("is a prime NO");
break;
}
}
}
}