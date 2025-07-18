import java.util.Scanner;
public class Factorial1{
	public int fact(int n){
		int total = 1;
		if(n>=1){
			total = n*fact(n-1);
		}
		return total;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num = in.nextInt();
		Factorial1 f = new Factorial1();
		System.out.println("Factorial of"+num+":"+f.fact(num));
	}
}
