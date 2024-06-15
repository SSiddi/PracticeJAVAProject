package practice.test.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestDemo {

	
	public static void main(String args[])
	{
		String str = "My name is Shabnam";
		String[] arrStr = str.split(" ");
		
		for(int i = arrStr.length-1; i>=0; i--)
		{
			System.out.println(arrStr[i]);
		}
		
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(String ar: arrStr)
		{
		String lowerCase = ar.toLowerCase();
		for(int i =0; i<lowerCase.length();i++)
		{
			if(map.containsKey(lowerCase.charAt(i)))
			{
				map.put(lowerCase.charAt(i), map.get(lowerCase.charAt(i))+1);
			}
			else 
			{
				map.put(lowerCase.charAt(i),1);
			}
		}
		}
		  for (Map.Entry<Character,Integer> details : map.entrySet())
		
		System.out.println(details.getKey() + " " + details.getValue());
	}
}


