package practice.test.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MultiMapImplemetation<K,V>{ 
	
	
	private Map<K,Collection<V>> mymap = new HashMap<>();
	
	public void put(K mykey, V myvalue)

	{
		if(mymap.get(mykey) == null)
		{
			mymap.put(mykey, new ArrayList<V>());
			
		}
		mymap.get(mykey).add(myvalue);
	}
}