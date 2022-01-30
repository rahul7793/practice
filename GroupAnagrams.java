// 49. Group Anagrams

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }).forEach((list) -> {
			list.forEach((word) -> System.out.print(word + " "));
		});
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		List<List<String>> grouped = new ArrayList<>();

		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String sortedStr = new String(ch);
			if (map.containsKey(sortedStr)) {
				map.get(sortedStr).add(str);
				map.put(sortedStr, map.get(sortedStr));
			} else {
				map.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
			}
		}
		return new ArrayList(map.values());
//		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//			grouped.add(entry.getValue());
//		}
//
//		return grouped;
	}
}
