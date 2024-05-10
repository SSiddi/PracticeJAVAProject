package practice.test.program;

public class WrapperClassDemo {

	public static void main(String[] args) {
	
		int a =100;
		Integer b = 200;
		
		System.out.println("Primitive  :" + a);
		System.out.println("Wrapper class :  " + b);
		//b is object of type integer
		
		
		//Example 2
		String str1 = "450";
		String str2 = "500";
		
		System.out.println(str1 +str2); // 450500 , this is not added as int so use wrapper class to convert it to in
		
		int n1 =  Integer.parseInt(str1);
		int n2 =  Integer.parseInt(str1);
		System.out.println(n1 +n2); //900
		
		//boxing - conversion of primitive type to object of wrapper class
		
		//auto boxing
		int num1 = 134;
		Integer num2 = num1;
		System.out.println(num2); //134
		
		//manually doing boxing
		int num3 = 234;
		Integer num4 = Integer.valueOf(num3);
		System.out.println(num4);  //234
		
		//unboxing - conversion of wrapper class obj to its primitive type
		
		//auto unboxing
		Integer num5 = 500;
		int num6= num5;
		System.out.println(num6); //500
		
		//manually doing the unboxing
		Integer num7 = 1500;
		int num8 = num7.intValue();
		System.out.println(num8); //1500
	}

}
