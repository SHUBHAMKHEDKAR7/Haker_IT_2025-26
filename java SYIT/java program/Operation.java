public class Operation
{
	public static void main(String args[])
	{
		int a = 52;
		int b = 0;
		int d = a - b;
		System.out.println("Substraction is : "+d);
		try{
			int c = a/b;
			System.out.println("Division is:"+c);	
		}
		catch(Exception e) // e is instance of class
		{
			System.err.println("Error: cannot divide by zero");
		}
		int e = a + b;
		System.out.println("Addition is: "+e);
	}
}