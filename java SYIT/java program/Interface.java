interface Father
{
	public abstract void m1();
}
interface Mother
{
	public abstract void m1();
}
interface Child extends Father , Mother
{
	public abstract void m1();
}
public class Interface implements Child
{
	public void m1()
	{
		System.out.println("___program of interface___");
	}
	public static void main(String[] args)
	{
		Interface i = new Interface();
		i.m1();
	}
}