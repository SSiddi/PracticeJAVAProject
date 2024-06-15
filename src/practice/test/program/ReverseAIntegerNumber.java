package practice.test.program;

public class ReverseAIntegerNumber {

	public static void main(String[] args) {

		int n = 8651;

		int reverse = 0;
		int q = n;

		while (q > 0) {
			int r = q % 10;
			reverse = reverse * 10 + r;
			q = q / 10;
			System.out.println("r is  : " + r);
			System.out.println("q is :  "+ q);

		}
		System.out.println(reverse);
	}
}
