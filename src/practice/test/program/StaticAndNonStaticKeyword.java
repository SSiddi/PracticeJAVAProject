package practice.test.program;


public class StaticAndNonStaticKeyword {

	static int ab =10;
	int b=20;
	
	public static void displayName()
	{
		System.out.println("Hi I am static method");
	}
	
	public void displayNS()
	{
		System.out.println("Hi I am non static method");
		displayName();
	}
	
	public void iAmNonStaticMethod()
	{
		displayName();
		System.out.println(ab);
		System.out.println(b);
		displayNS();
		
	}
	
	
	public static void main(String[] args) {
		
		displayName();
		// displayNS(); //  cannot call a non static method in static directly
		
		System.out.println(ab);
	//	System.out.println(b); // Error Cannot make a static reference to the non-static field b, use obj to call
		
		StaticAndNonStaticKeyword s = new StaticAndNonStaticKeyword();
		s.displayNS();
		System.out.println(s.b);
		s.iAmNonStaticMethod();
	}
}

/*
Static methods can be accessed without having to create a new object. 
A static method can only use and call other static methods or static data members. 
To call non static method in static method use object as non static method belongs to an obj.
*/