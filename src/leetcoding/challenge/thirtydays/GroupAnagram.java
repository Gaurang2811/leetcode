package leetcoding.challenge.thirtydays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagram {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();
		Map<String, List<String>> existStringAnagrams = new HashMap<String, List<String>>();
		char tempArray[] = null;
		for (String str : strs) {
			tempArray = str.toCharArray();
			Arrays.sort(tempArray);
			String sorted = new String(tempArray);
			if (existStringAnagrams.containsKey(sorted)) {
				existStringAnagrams.get(sorted).add(str);
			} else {
				existStringAnagrams.put(sorted, new ArrayList<String>(Arrays.asList(str)));
			}
		}
		for (Entry<String, List<String>> entry : existStringAnagrams.entrySet()) {
			result.add(entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagram anagram = new GroupAnagram();
		anagram.groupAnagrams(str);
	}
}
