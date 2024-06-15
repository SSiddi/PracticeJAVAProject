package practice.test.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoreSameKeyWithMultipleValues {

	public static void main(String args[])
	{
		Map<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
		multiMap.put("Mohan" ,new ArrayList<String>());
		multiMap.get("Mohan").add("QA");
		multiMap.get("Mohan").add("LEAD");
		
		multiMap.put("Preeti" ,new ArrayList<String>());
		multiMap.get("Preeti").add("QA");
		multiMap.get("Preeti").add("MANAGER");
		multiMap.get("Preeti").add("EMPLOYEE");
		
		System.out.println(multiMap);
		
		String str = "Preeti";
		
		//fetch values of only one key 
		System.out.println(multiMap.get(str));

	}
}
