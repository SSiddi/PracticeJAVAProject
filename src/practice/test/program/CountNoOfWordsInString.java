package practice.test.program;

public class CountNoOfWordsInString {

	public static void main(String args[])
		{
			String str = "This is a new string to count number of characters";
			int count=0;
			
			String strWords[] = str.split(" ");
			System.out.println("No of words are :  " + strWords.length);
			
			//Method 2
			int word =0;
			for(int i=0 ;i < str.length();i++)
			{
				if(str.charAt(i)==' ' && Character.isLetter(str.charAt(i+1)) && i>0)
				{
					word++;
				}
			}
			word++; // to count the last word increment count by 1
			System.out.println("No of words are :  " + word);
	}
}
