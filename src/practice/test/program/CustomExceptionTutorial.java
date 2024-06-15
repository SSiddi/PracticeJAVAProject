package practice.test.program;

public class CustomExceptionTutorial {

	
	public static void main(String[] args) throws AgeLessThanZeroException {
		valdiateAge(-3);
		
	}
	
	public static void valdiateAge(int age) throws AgeLessThanZeroException
	{
		if(age<0)
		{
			//	throw new AgeLessThanZeroException();
			
			// to add a message also like below create a constructor in AgeLessThanZeroException class 
			throw new AgeLessThanZeroException("Oh Age is less than 0");
		}
	}
}
