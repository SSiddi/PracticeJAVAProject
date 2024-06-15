package practice.test.program;

// Java program to demonstrate the calling of
// Static block in java
import java.util.*;

class HashMapIteratingAndNullKey {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mukesh");
		map.put(2, null);
		map.put(3, "Test");
		map.put(4, "Chabra");
		map.put(4, "Override");
		map.put(null, "Sohan");
		map.put(null, "Rohan");
		map.put(5, null);
		map.put(6, "Test");

		//Method 1 to iterate over hasmap
		System.out.println("Iterating using entry : ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key=" + key + ", Value=" + value);
		}

		// method to iterate on hasmap
		System.out.println("Iterating using set iterator : ");
		Set s = map.entrySet();
		Iterator r = s.iterator();
		while (r.hasNext()) {
			System.out.println(r.next());
		}
		
		// method to iterate on hasmap using JAVA 8
		System.out.println("Iterating using JAVA 8 : ");
		map.forEach((K,V)-> System.out.println(K +  " : " + V));;
	}
}
//
//Iterating using entry : 
//Key=null, Value=Rohan
//Key=1, Value=Mukesh
//Key=2, Value=null
//Key=3, Value=Test
//Key=4, Value=Override
//Key=5, Value=null
//Key=6, Value=Test
//Iterating using set iterator : 
//null=Rohan
//1=Mukesh
//2=null
//3=Test
//4=Override
//5=null
//6=Test
//Iterating using JAVA 8 : 
//null : Rohan
//1 : Mukesh
//2 : null
//3 : Test
//4 : Override
//5 : null
//6 : Test

// As seen above the null key value will be overridden every time and it will store the last value.
// IN case of duplicate key the value will get override
// map can have duplicate values