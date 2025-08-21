class Parents{
	void name(){
		System.out.println("parent");
	}
}
public class Son extends Parents{
	void name(){
		super.name();
		System.out.println("Child");
	}
	public static void main(String[] args){
		Son c = new Son();
		c.name();
	}
}