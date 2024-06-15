package practice.test.program;

import java.util.HashMap;
import java.util.Map;

public class RemoveCHarMatchingTheCountFromString {

	public static void main(String[] args) {
		
		String str = "sHHhabbbNam";
		String lowerStr = str.toLowerCase();
		char ch[] = lowerStr.toCharArray();
		int count = 3;
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0 ;i <ch.length; i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i]) +1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " +entry.getValue());
		}
		
		StringBuilder newStr = new StringBuilder();
		for(char ch1 : ch)
		{
			if(map.get(ch1) <count)
			{
				newStr.append(ch1);
			}
		}
			
		System.out.println("String after remving char is  : " + newStr);
		
	}
}
