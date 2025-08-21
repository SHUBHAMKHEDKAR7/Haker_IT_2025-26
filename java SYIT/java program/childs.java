class Parents{
	void name(){
		System.out.println("parent");
	}
}
public class Childs extends Parents{
	void name(){
		System.out.println("Child");
	}
	public static void main(String[] args){
		Childs c = new Childs();
		c.name();
	}
}