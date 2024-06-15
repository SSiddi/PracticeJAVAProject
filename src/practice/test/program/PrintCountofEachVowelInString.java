package practice.test.program;

import java.util.HashMap;
import java.util.Map;

public class PrintCountofEachVowelInString {

	public static void main(String[] args) {

		String str = "Count vowel in this string";
		String lowerCase = str.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < lowerCase.length(); i++)

		{
			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i'
					|| lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
				if (map.containsKey(lowerCase.charAt(i))) {
					map.put(lowerCase.charAt(i), map.get(lowerCase.charAt(i)) + 1);

				} else {
					map.put(lowerCase.charAt(i), 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
