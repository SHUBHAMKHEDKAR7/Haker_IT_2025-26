import java.util.*;
class Star{
public static void main(String[] args){
char ch;
int i , j;
Scanner sc = new Scanner(System.in);
System.out.print("Enter data to print:");
ch = sc.next().charAt(0);
for(i = ch; i >= 1 ; i--){
for(j = 1; j <= i; j++){
System.out.print(j+" ");
}
System.out.println("");
}
}
}