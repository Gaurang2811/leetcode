package leetcoding.challenge.topinterviewquestionsmedium.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ga.omar
 *
 * @see <a href=
 *      "https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/">Question
 *      Link</a>
 */
public class GroupAnagram {

	public static void main(String[] args) {

		String[] st = { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagram groupAnagram = new GroupAnagram();
		List<List<String>> r = groupAnagram.groupAnagrams(st);
		for (List<String> list : r) {
			for (String list2 : list) {
				System.out.print(list2);
			}
			System.out.println();
		}
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String string : strs) {
			char[] charArr = string.toCharArray();
			Arrays.sort(charArr);
			String s = new String(charArr);
			if (map.containsKey(s)) {
				map.get(s).add(string);
			} else {
				List<String> lst = new ArrayList<>();
				lst.add(string);
				map.put(s, lst);
			}
		}

//		return map.values().stream().map(el -> new ArrayList<>(el)).collect(Collectors.toList());
		List<List<String>> result = new ArrayList<List<String>>();
		for (List<String> lsts : map.values()) {
			result.add(lsts);
		}

		return result;
	}

//	public List<List<String>> groupAnagrams(String[] strs) {
//
//		Map<HashMap<Character, Integer>, List<String>> map = new HashMap<HashMap<Character, Integer>, List<String>>();
//		HashMap<Character, Integer> charMap = null;
//		for (String string : strs) {
//			charMap = new HashMap<Character, Integer>();
//			char[] charArr = string.toCharArray();
//			for (Character character : charArr) {
//				charMap.put(character, null == charMap.get(character) ? 1 : charMap.get(character) + 1);
//			}
//			if (map.containsKey(charMap)) {
//				map.get(charMap).add(string);
//			} else {
//				List<String> lst = new ArrayList<>();
//				lst.add(string);
//				map.put(charMap, lst);
//			}
//		}
//
//		List<List<String>> result = new ArrayList<List<String>>();
//		for (Entry<HashMap<Character, Integer>, List<String>> lsts : map.entrySet()) {
//			result.add(lsts.getValue());
//		}
//
//		return result;
//	}

//	public List<List<String>> groupAnagrams(String[] strs) {
//
//		Map<TreeSet<Character>, List<String>> map = new HashMap<TreeSet<Character>, List<String>>();
//		TreeSet<Character> charSet = null;
//		for (String string : strs) {
//			charSet = new TreeSet<Character>();
//			char[] charArr = string.toCharArray();
//			for (Character character : charArr) {
//				charSet.add(character);
//			}
//			if (map.containsKey(charSet)) {
//				map.get(charSet).add(string);
//			} else {
//				List<String> lst = new ArrayList<>();
//				lst.add(string);
//				map.put(charSet, lst);
//			}
//		}
//
//		List<List<String>> result = new ArrayList<List<String>>();
//		for (Entry<TreeSet<Character>, List<String>> lsts : map.entrySet()) {
//			result.add(lsts.getValue());
//		}
//
//		return result;
//	}

}
