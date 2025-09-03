abstract class Bank_Account
{
		public void getDetail(){
		}
		public abstract void deposite();
		public abstract void withdrawl();
		public abstract void cheack_balance();

}
class Saving extends Bank_Account
{
	public void getDetail()
	{
		System.out.println("Personal Details");
	}
	public void deposite(){
		System.out.println("RS 10000 is deposite");
	}
	public void withdrawl(){
		System.out.println("RS 5000 is Withdraw");
	}
	public void cheack_balance(){
		System.out.println("Avalable balance is RS 5000");
	}
}
class Current extends Bank_Account
{
	public void getDetail()
	{
		System.out.println("Personal Details");
	}
	public void deposite(){
		System.out.println("RS 10000 is deposite");
	}
	public void withdrawl(){
		System.out.println("RS 5000 is Withdraw");
	}
	public void cheack_balance(){
		System.out.println("Avalable balance is RS 5000");
	}
}
public class Sample
{
	public static void main(String[] args){
		Bank_Account s = new Saving();
		s.getDetail();
		s.deposite();
		s.withdrawl();
		s.cheack_balance();
		Bank_Account s1 = new Current();
		s1.getDetail();
		s1.deposite();
		s1.withdrawl();
		s1.cheack_balance();
		
	}
} 