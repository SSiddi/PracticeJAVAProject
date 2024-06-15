package practice.test.program;

public class FindSmallestMissingInteger {
	//print smallest missing integer
		public static void main(String args[])
		{
			int[] arr  = {-10, -2, 0, 2, 3, 4};
			
			for (int i = 0; i < arr.length; i++)
			{
				if(arr[i+1] < arr[i])
				{
					arr[i] = arr[i+1];
				}
			}
	
	}

}
