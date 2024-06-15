package practice.test.program;

public class MethodOverloadingExample {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b);
	}

	public void sum(float a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, float b) {
		System.out.println(a + b);
	}

	public float sum(float a, float b) {
		System.out.println(a + b);
		return a + b;
	}

	public int division(int a, int b) {
		int result = a / b;
		return result;
	}

	// below just changing the return type will throw error
	/*
	 * public double division(int a, int b) 
	 * { 
	 * double result = a / b; return result;
	 * }
	 */

}

/*
 * For method overloading Parameter type should be different 
 * No of arguments can be different 
 * position of argument can be different
 */

