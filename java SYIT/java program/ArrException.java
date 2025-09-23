public class ArrException
{
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4};
		try{
			System.out.println(arr[5]);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Array is out of index");
		}
		System.out.println(arr[2]);
	}
}