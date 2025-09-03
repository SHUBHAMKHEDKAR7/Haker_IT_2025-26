interface Parent1
{
	public  void display();

}
interface Parent2
{
	public  void display();
}
public class Child1 implements Parent1 , Parent2
{
	public void display()
	{
		System.out.println("father and mother");
	}

	public static void main (String args[]){
		Child1 c = new Child1();
		c.display();
	}
}