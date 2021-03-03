/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 **/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder prefix = null;
		String first = new String();
		int len = strs.length;
		if (len > 1)
			first = strs[0];
		else if (len == 1)
			return strs[0];
		for (int i = 0; i < (len - 1); ++i) {
			String second = strs[i + 1];
			String tmp = (first.length() > second.length()) ? second : first;
			prefix = new StringBuilder();
			for (int j = 0; j < tmp.length(); j++) {
				if (first.charAt(j) == second.charAt(j))
					prefix.append(first.charAt(j));
				else
					break;
			}
			first = prefix.toString();
		}
		return prefix.toString();
	}

}
