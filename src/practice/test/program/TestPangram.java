package practice.test.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestPangram {

	// Pangram is string which have all the alphabet from a to z ex-
	// Aabcdefghijklmnopqrstuvwxyzz
	public static boolean checkPangram(String inputString) {
		String str1 = inputString.toLowerCase();
		System.out.println("The string is : " + str1);

		Set<Character> alphabetset = new HashSet<Character>();
		{
			for (int i = 'a'; i <= 'z'; i++)
				alphabetset.add((char) i);

		}
		System.out.println(alphabetset);

		for (int i = 0; i < str1.length(); i++) {
			alphabetset.remove(str1.charAt(i));

			if (alphabetset.isEmpty())
				return true;
		}
		System.out.println("alphabset set remaining chars are : " + alphabetset);
		return false;
	}

	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the string");

		String userInput = scr.nextLine();

		System.out.println("You enetered  : " + userInput);

		if (checkPangram(userInput)) {
			System.out.println("String is pangram");
		} else {
			System.out.println("String is non pangram");
		}
	}
}
