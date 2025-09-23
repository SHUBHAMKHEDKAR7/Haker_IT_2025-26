public class Nullexception
{
	public static void main(String[] args)
	{
		try{
			String n = null;
			System.out.println(n.length());
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
	}
}