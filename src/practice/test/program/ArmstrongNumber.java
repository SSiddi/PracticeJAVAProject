package practice.test.program;

public class ArmstrongNumber {

	/*
	 * 153 -> 1 5 3
	 * 		1*1*1 + 5*5*5 + 3*3*3  = 153
	 */
	public static void main(String[] args) {
		  int n =153;
		  int temp =n;
		  int r, sum =0;
		  
		  while(n>0)
		  {
		  r = n%10;
		  n = n/10;
		  sum = sum + r*r*r;
		  
		  System.out.println("r is : " + r);
		  System.out.println("n is : " + n);
		  System.out.println("sum is :  " + sum);
		 
		  }
		  if(temp == sum)
		  {
			  System.out.println("Its an armstrong number");
		  }
		  else
		  {
			  System.out.println("Not an armstrong number");
		  }
	}
}
