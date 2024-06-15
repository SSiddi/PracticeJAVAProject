package practice.test.program;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		int n = 5;
		int temp=0;
		
		for(int i = 2;i <=n-1;i++)
		{
			if(n%i == 0)
			{
				temp= temp+1; // its not a prime
			}
		}
		if(temp<1)
		{
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
}

