package probSolving;

import java.util.HashMap;
import java.util.Map;

public class StringOperation {

	
	public void getDuplicateWords(String str){
		
		System.out.println(str);
		
		//replacing all punctuation marks with " ", converting all upper case letters to 
		//lower case and trimming spaces at start and end
		str = str.replaceAll("[^\\p{L}\\p{N}]", " ").trim().toLowerCase();
		
		//splitting with respect to spaces
		String[] words = str.split("\\s+");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String word : words){
			if(map.containsKey(word)){
				map.put(word, map.get(word)+ 1);
			} else {
				map.put(word, 1);
			}
		}
		
		int duplicateCount = 0;
		for(String word : map.keySet()){
			int count = map.get(word);
			if(count> 1){
				System.out.println("word '"+word+"' appeared "+count+" times.");
				duplicateCount += 1;
			}
		}
		System.out.println("No. of duplicate words ="+duplicateCount);
		
	}
	
}
