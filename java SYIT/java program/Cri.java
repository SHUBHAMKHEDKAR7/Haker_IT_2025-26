class Cricket{
	public void Virat(){
		System.out.println("I Would Like To Play Cricket");
	}
}
public class Cri extends Cricket{
	public void Rohit(){
		System.out.println("Rohit And Virat Play World Cup In 2027");

	}
	public static void main(String[] args){
		Cri c = new Cri();
		c.Virat();
		c.Rohit();
	}
}