package practice.test.program;

public class PalindromeCheck {
	
	public static void main(String args[])
	{
		String str1 ="Reviver";
		String str =str1.toLowerCase();
		
		boolean flag= true;
		
		for(int i=0; i< str.length()/2; i++)	
		{
			System.out.println(i);
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				flag=false;
			break;		
		}
		
		if(flag)
		
			System.out.println("Yes it is palindrome");
		
		else
		
			System.out.println("Not a palindrome");
		
		
		//Method 2
		String str2 ="Reviver";
		String str3 =str2.toLowerCase();
		String reverse= " ";
		
		System.out.println("Length of strig is " + str3.length());
		
		for(int i=str3.length()-1; i>=0; i--)	
		{
			
			reverse = reverse + str3.charAt(i);
		}
		System.out.println("Reverse is  " + reverse);
		System.out.println("Original is  " + str3);
		
		if(str3.equals(reverse)) {
		{
			System.out.println("Yes it is palindrome");
		}

	}
	}
	}

