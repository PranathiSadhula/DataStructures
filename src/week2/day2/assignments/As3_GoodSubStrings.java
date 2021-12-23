package week2.day2.assignments;

import java.util.HashMap;

import org.junit.Test;

public class As3_GoodSubStrings {
	/*
	 * 1876. Substrings of Size Three with Distinct Characters A string is good if
	 * there are no repeated characters.
	 * 
	 * Given a string s​​​​​, return the number of good substrings of length three
	 * in s​​​​​​.
	 * 
	 * Note that if there are multiple occurrences of the same substring, every
	 * occurrence should be counted.
	 * 
	 * A substring is a contiguous sequence of characters in a string.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "xyzzaz" Output: 1 Explanation: There are 4 substrings of size 3:
	 * "xyz", "yzz", "zza", and "zaz". The only good substring of length 3 is "xyz".
	 * Example 2:
	 * 
	 * Input: s = "aababcabc" Output: 4 Explanation: There are 7 substrings of size
	 * 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc". The good substrings
	 * are "abc", "bca", "cab", and "abc".
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 100 s​​​​​​ consists of lowercase English letters.
	 */

	// test data
	public void test1() {
		String s = "";
		String output = "expected 's' to have 1 <= size <= 100 but got 0";
	}

	public void test2() {
		String s = "s";
		String output = "expected 's' to have 1 <= size <= 100 but got 0";
	}

	@Test
	public void test3() {
		String s = "aababcabc";
		System.out.println(getGoodSubStrCount(s));
	}

	// pseudo code
	/*
	 * 1.accept string as input whose size is always >= 1 and <= 100.
	 * 
	 * 2.initialize startIndex with 0 and endIndx with 0.
	 * 
	 * 3.starting with endIndx with 0 till given k (here 3), take a subStrng.
	 * 
	 * 4.write a method to check if this subString is good. If yes increase count.
	 * else ==> dont increase count.
	 * 
	 * 
	 * 5.Method to check if given subStrng is good :
	 * 
	 * a)accept substring as input.
	 * 
	 * b)check for any duplicate chars. if any --> return false. else return true.
	 * 
	 * 6.finally return the count.
	 * 
	 */

	private int isGoodSubString(String subStr) {
		HashMap<Character, Integer> occurances = new HashMap<>();
		for (int i = 0; i < subStr.length(); i++) {
			if (occurances.containsKey(subStr.charAt(i)))
				return 0;
			else
				occurances.put(subStr.charAt(i), 1);
		}
		System.out.println(subStr);
		return 1;
	}

	private int getGoodSubStrCount(String s) {
		if (s.length() <= 1)
			return 0;
		int startIndx = 0;
		int endIndx = 3;
		int count = 0;

		while (endIndx <= s.length()) {
			String subStr = s.substring(startIndx++, endIndx++);
			System.out.println(subStr);
			count += isGoodSubString(subStr);
		}
		return count;
	}
}
