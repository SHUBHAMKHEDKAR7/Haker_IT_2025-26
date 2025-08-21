class Employee{
	public Employee(String name){
		System.out.println("Employee name is: "+name);
	}
}
public class Javadeveloper extends Employee{
	public Javadeveloper(){
		super("Shubham");
		System.out.println("Javadeveloper");
	}
	public static void main(String args[]){
		Javadeveloper j = new Javadeveloper();
	}
}
