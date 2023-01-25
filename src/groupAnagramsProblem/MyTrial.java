package groupAnagramsProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTrial {

	public static List<List<String>> sortAnagrams(String[] words){
		
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, List<String>> resultMap = new HashMap<>();
		
		for(String str: words) {
			char strArray[] = str.toCharArray();
			Arrays.sort(strArray);
			String sortedStr = String.valueOf(strArray);
			System.out.println(sortedStr);
			
			if(resultMap.containsKey(sortedStr)) {
				List<String> anagrams = resultMap.get(sortedStr);
				anagrams.add(str);
				resultMap.put(sortedStr, anagrams);
			} else {
				List<String> anagrams = new ArrayList<>();
				anagrams.add(str);
				resultMap.put(sortedStr, anagrams);
			}
		}
		
		Collection<List<String>> preResult = resultMap.values();
		result = new ArrayList<>(preResult);
		
//		for(Map.Entry<String, List<String>> map: resultMap.entrySet()) {
//			result.add(map.getValue());
//		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] words = {"pop","bat","tab","opp"};
        List<List<String>> res = sortAnagrams(words);
        System.out.println(res);
	}

}
