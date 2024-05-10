package practice.test.program;

public class CountNoOfCharsOnlyInString {

	public static void main(String args[])
	{
		String str = "This is a new string to count number of characters";
		int count=0;
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("No of chars is:  " + count);
	}
}
