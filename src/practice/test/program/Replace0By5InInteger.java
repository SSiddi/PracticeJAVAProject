package practice.test.program;

public class Replace0By5InInteger {

	public static void main(String args[]) {
		int number = 109056;

		String str = String.valueOf(number);
		String replaceStr = str.replace('0', '5');
		int replaceNumber = Integer.parseInt(replaceStr);
		System.out.println("replaced number is : " + replaceNumber);
	}
}
