package practice.test.program;

public class ChangeCharacterCase {

	public static void main(String args[])
	{
		   String str ="Great Power";  
		   StringBuffer str2 = new StringBuffer(str);
		   
		   for(int i=0; i< str.length();i++)
		   {
			   if(Character.isLowerCase(str.charAt(i)))
			   {
				   str2.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			   }
			   else
			   {
				   str2.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			   }
		   }
		System.out.println("The change charater for str is: " + str2);
	}
	
}
