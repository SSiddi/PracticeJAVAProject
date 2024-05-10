package practice.test.program;

public class StringLiteralObject {
	
	public static void main(String args[])
	{
	//below are called string literals, they will be saved in constant pool and both s1 ,s2 will point to one object of JAVA	
	String s1 ="JAVA";
	String s2 ="JAVA";
	
	//Below are string objects even if data is same they will point to two different JAVA objects in heap memory
	String s3= new String("JAVA");
	String s4 = new String("JAVA");
	
	
	//true as both are referring to same JAVA object
	System.out.println(s1==s2); 
	
	//false as both are referring to different object
	System.out.println(s1==s3); 
	
	//false as both are having same value but pointing to two different object
	System.out.println(s3==s4); 
	
	//true as it is comparing he string value and both are JAVA
	 
	System.out.println(s1.equals(s3));
	
	s1 = s1 + "  Tutorial";	
	System.out.println(s1);
	
	s3 = s3 + "  Testing";
	System.out.println(s3);
	
} 
}
