class StringIndexoutofbound_
{
	public static void main(String args[])
	{
		try
		{
			String a = "Shubham";
			char c = a.charAt(52);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception");
		}
	}
}