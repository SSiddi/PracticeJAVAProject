package practice.test.program;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWordsInString {

	public static void main(String args[]) {
		
		String str = "Find duplicate words in Duplicate String Find";
		String newstr= str.toLowerCase(); // otherwise duplicate and Duplicate will be read as different words
		
		String words[] = newstr.split(" ");
		for(String ar: words) 
		{
		System.out.println(ar);
		}
		
		//using Map		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		 
		 for(String word : words ) 
		 { 
			 if(map.containsKey(word)) 
			 {
				 map.put(word,map.get(word) + 1);
			 }
			 else
			 {
				map.put(word, 1);
			 }
		 
		 }
		 System.out.println(map);

		// without using collection
		
		 String string = "Big black bug bit a big black dog on his big black nose";  
		 string= string.toLowerCase();
		 int count=1;
		 String wordsInString[] = string.split(" ");
		
		 System.out.println("Duplicate words in a given string : ");   
	       for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < wordsInString.length; j++) 
	            {  
	                if(wordsInString[i].equals(wordsInString[j])) {  
	                    count++;  
	                    //Set words[j] to 0 to avoid printing visited word  
	                    wordsInString[j] = "0";  
	                }  
	            }  
	              
	            //Displays the duplicate word if count is greater than 1  
	            if(count > 1 && wordsInString[i] != "0")  
	                System.out.println(wordsInString[i]);  
	        }  
	    }  
}
