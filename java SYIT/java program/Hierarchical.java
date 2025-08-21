class Employee{
	int salary = 50000;
	void pf(){
		System.out.println("Pf facility");
	}
}
class Programmer extends Employee{
	int bouns = 100000;
	void hi(){
		System.out.println("Health Insurance");
	}
}
class Tester extends Employee{
	void ti(){
		System.out.println("term Insurence");
	}
}
public class Hierarchical{
	public static void main(String[] args){
		Tester t = new Tester(); 
		Programmer p = new Programmer();
		int Psalary = p.salary + p.bouns;
		int Tsalary = t.salary = p.bouns;
		System.out.println("Gross salary of Programmer is :"+Psalary);
		System.out.println("Gross salary of Tester is :"+Tsalary);
		p.hi();
		p.pf();
		t.ti();
		
}
}