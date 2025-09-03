interface Parent1
{
	public  void display();

}
interface Parent2
{
	public  void display();
}
class Child3 implements Parent1 , Parent2
{
	public void display()
	{
		System.out.println("father and mother");
	}
}
public class Child4 extends Child3
{
	public static void main (String args[]){
		Child4 c = new Child4();
		c.display();
	}
}