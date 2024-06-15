package practice.test.program;

public class CheckArrayisSortedOrNOT {

	static boolean arraySortedOrNot(int[] arr,int n)
	{
		
		if(n==0||n==1)
			return true;
		for(int i = 1;i<n;i++)
		{
			if(arr[i-1] > arr[i])
				return false;
		}
	
		return true;
		
	}
	
	public static void main (String arge[])
	{
		int[] arr = {10, 2, 9, 20, 20 , 23, 40};
		int n = arr.length;
		
		if(arraySortedOrNot(arr,n))
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}
}
