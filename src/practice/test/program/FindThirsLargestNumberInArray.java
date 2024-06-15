package practice.test.program;

public class FindThirsLargestNumberInArray {

	public static int findThirdLrgest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < total; i++) {
			System.out.println(a[i]);
		}
		return a[total - 3];
	}

	public static void main(String[] args) {

		int a[] = { 44, 66, 66 , 99, 77, 33, 22, 55 }; // 22 33 44 55 66 66 77 99
		System.out.println("Third largest number is : " + findThirdLrgest(a, 7));

	}
}
