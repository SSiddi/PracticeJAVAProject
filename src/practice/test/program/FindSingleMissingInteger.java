package practice.test.program;

public class FindSingleMissingInteger {

	public static void main(String[] args) {
		
	
	int n[] = {4,3,6,2,1};
	int length = n.length;
	int exp_length = length + 1;
	

	int num = exp_length * (exp_length + 1) / 2;
	System.out.println (num);
	
	int total =0;
	for(int i =0; i<n.length;i++)
	{
		total+= n[i];
	}

	System.out.println(total);
	int mis = num- total;
	System.out.println("Missing integer is  : "  + mis);
}

}