package practice.test.program;

public class checkStringIsRotationOrNot {

	public static void main(String[] args) {
		
		String str1 = "mypencil";
		String str2 =  "encilmyp";
		if(str1.length()!=str2.length())
		{
			System.out.println("Not a rotation");
			System.exit(0);
		}
		else
		{
			String str3= str1+str1;
			if(str3.indexOf(str2)!=-1)
			{
				System.out.println("String 2 is rotation of string 1");
				System.out.println("No of rotations are : " + str3.indexOf(str2));
			}
		}
	}
}
