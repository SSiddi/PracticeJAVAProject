package practice.test.program;

public class InterviewAsked {
	static int a = 10;
	static int b = 20;
	static
	{
	    b = a * 4;
	}
	public static void main(String[] args)
	{
	    System.out.println("Value of a : "+ ++a);// 11
	    System.out.println("Value of b : "+ b);// 40
	    
	    String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        System.out.println(s1==s2); 
        System.out.println(s1==s3); 
        System.out.println(s2.equals(s3)); 
        
        String s ="hello";
        s.concat("world"); 
        System.out.println(s);
        
//        String s = "hello";: Declares a string variable s and assigns it the value "hello".
//        s.concat("world");: Concatenates "world" to the string "hello", but the result is not assigned to any variable. Instead, it creates a new string "helloworld".
//        System.out.println(s);: Prints the original string s, which is still "hello" because the concat() method doesn't modify 
//    Assign back to s if wanted to concatenate like below
//    String s ="hello";
//    s= s.concat("world"); 
//    System.out.println(s); // Output will be "helloworld"
//        
        String s4 = new String("Shabnam");
        s4.concat("siddiqui");
        System.out.println(s4);
        
        StringBuilder s5 = new StringBuilder("MH");
        s5.append("Pune");
        System.out.println(s5);
	}
}

/*
The expressions ++a and a++ are both increment operators in Java, but they behave differently:

++a (pre-increment): This operator increments the value of a by 1 and then returns the incremented value. That means if you use ++a in an expression, it will use the updated value of a.

a++ (post-increment): This operator also increments the value of a by 1, but it returns the original value of a, and then increments it. 
That means if you use a++ in an expression, it will use the original value of a, and then update a after the expression is evaluated.

int a = 5;
int b = ++a; // Now, a = 6, b = 6 (because ++a returns the updated value)
int c = a++; // Now, a = 7, c = 6 (because a++ returns the original value, then increments a)
*/