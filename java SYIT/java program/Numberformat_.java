class Numberformat_
{
	public static void main(String args[])
	{
		try{
			int num = Integer.parseInt("Shubham");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("It give Number Format Exception");
		}
	}
}