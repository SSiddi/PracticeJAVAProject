package practice.test.program;

public class MoveALLZeros {

	public static void main(String args[]) {
		int a[] = { 4, 0, -10, 5, 2, 0, 99, 0, 1 };
		int b[] = new int[a.length];

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[k] = a[i];
				k++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[k] = a[i];
				k++;
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}