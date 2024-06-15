package practice.test.program;

public class AgeLessThanZeroException extends Exception{

	AgeLessThanZeroException(String msg)
	{
		super(msg); //as it is extending Exception class
	}
	
	
}

/*
 * Made a class AgeLessThanZeroException and extends to Exception , and it is
 * used in class CustomExceptionTutorial
 */