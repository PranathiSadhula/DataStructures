package week2.day2.assignments;

import org.junit.Test;

public class As2_LongestNiceSubString {
	/*
	 * A string s is nice if, for every letter of the alphabet that s contains, it
	 * appears both in uppercase and lowercase. For example, "abABB" is nice because
	 * 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b'
	 * appears, but 'B' does not.
	 * 
	 * Given a string s, return the longest substring of s that is nice. If there
	 * are multiple, return the substring of the earliest occurrence. If there are
	 * none, return an empty string.
	 * 
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 100 s consists of uppercase and lowercase English letters.
	 */

	// pseudo code
	/*
	 * 1.accept sting as input with size > 1 and < 100.
	 * 
	 * 2.start index with 0 and subIndex with 0.
	 * 
	 * 3.use outer for loop starting with index 0 to s.length
	 * 
	 * 4.inside the above for loop, start subIndex at index+1(i.e., 1 at starting)
	 * till s.length.
	 * 
	 * 5.for these each sub str check if its niceSubString. if yes, check for length
	 * and hold the longest subStr.
	 * 
	 * 6.Method to check if given subStr is nice :
	 * 
	 * a) accept subStr as input.
	 * 
	 * b) check if each char is appeared in its lower and upper case.
	 * 
	 * c) if yes, return subStr. else return empty str.
	 * 
	 * 7. finally return the longesth nice subStr.
	 * 
	 */

	private String getLongesthNiceString(String s) {
		if (s.length() < 1 || s.length() > 100)
			throw new RuntimeException("");

		if (s.length() == 1)
			return "";
		if (s.length() == 2) {
			return getNiceStrng(s);
		}
		String longestNiceSubStr = "";
		for (int sIndex = 0; sIndex < s.length(); sIndex++) {
			if (sIndex == 3)
				System.out.println("i need this subStr");
			for (int subIndex = sIndex + 1; subIndex <= s.length(); subIndex++) {
				String subStr = getNiceStrng(s.substring(sIndex, subIndex));
				if (longestNiceSubStr.length() < subStr.length())
					longestNiceSubStr = subStr;
			}
		}

		return longestNiceSubStr;
	}

	/*
	 * 1.accept sting as input with size > 1 and < 100.
	 * 
	 * 2.if s.length is 1 return empty string.
	 * 
	 * 3.if s.length is 2 then check if s is niceString and return s if yes, else
	 * return empty str.
	 * 
	 * 4.start index with 0 and subIndex with index+2.
	 * 
	 * 5.repeat checking if each subStr is nice or not until s.length.
	 * 
	 * 6.Method to check if given subStr is nice :
	 * 
	 * a) accept subStr as input.
	 * 
	 * b) check if each char is appeared in its lower and upper case.
	 * 
	 * c) if yes, return subStr. else return empty str.
	 * 
	 * 7. finally return the longesth nice subStr.
	 * 
	 */
	private String getLongesthNiceStringSW(String s) {
		if (s.length() < 1 || s.length() > 100)
			throw new RuntimeException("");

		if (s.length() == 1)
			return "";
		if (s.length() == 2) {
			return getNiceStrng(s);
		}
		String longestNiceSubStr = "";
		int index = 0;
		int subIndex = index+1;
		while(index < s.length() && subIndex <= s.length()) {
			if(index == 6)
				System.out.println("debug here");
			String subStr = getNiceStrng(s.substring(index, subIndex));
			if (longestNiceSubStr.length() < subStr.length()) {
				longestNiceSubStr = subStr;
			}
			if(subIndex == s.length())
			{
				index++;
				subIndex =index+1;
			}
			subIndex++;
		}

		return longestNiceSubStr;
	}

	private String getNiceStrng(String s) {
		boolean isNiceSubStr = false;
		if (s.length() <= 1)
			return "";
		for (int i = 0; i < s.length(); i++) {
			char curChar = s.charAt(i);
			if (Character.isLowerCase(curChar) && s.indexOf(Character.toUpperCase(curChar)) == -1) {
				return "";
			} else if (Character.isUpperCase(curChar) && s.indexOf(Character.toLowerCase(curChar)) == -1) {
				return "";
			} else
				isNiceSubStr = true;
		}

		if (isNiceSubStr)
			return s;
		return "";
	}

	// test data

	// @Test
	public void test() {
		String input = "YazabAcaBZCy";
		String output = "YazabAcaBZCy";
		System.out.println(getLongestNiceSubStr(input));
	}

	// @Test
	public void test1() {
		String input = "YazabAaBZCy";
		String output = "azabAaBZ";
		// System.out.println( getLongestNiceSubStr(input));
		getLongesthNiceString(input);

	}

	// @Test
	public void test2() {
		String input = "BsQSbWKRqwruU";
		getLngestNiceSubStr(input);
	}

	// @Test
	public void test3() {
		String input = "Bb";
		getLongesthNiceString(input);

	}

	@Test
	public void test4() {
		String input = "FeOZJEnNfjz";
		getLongesthNiceStringSW(input);
	}
	
	//@Test
	public void test5() {
		String input = "YazaAay";
		getLongesthNiceStringSW(input);
	}
	

//pseudo code
	/*
	 * 
	 */
	private String getLongestNiceSubStr(String s) {

		return "";

	}

	// pseudo code
	/*
	 * 1.accept String as input whose length is always >= 1 and <= 100. 2.initialze
	 * an empty string variable --> longestNiceSubStr 3.get charAt ith index and
	 * check if this is lower or upper case. 4.get index of upper or lower case of
	 * the above char. 5.within this subString check for each char for both upper
	 * and lower. 6.if index got in step 4 is less than string length, repeat step 5
	 * for each char by adding single char at a time after above subStr till reach
	 * length.
	 */
	private String getLongestNiceSubStrng(String input) {
		if (input.length() < 1 || input.length() > 100)
			throw new RuntimeException("invalid input String");
		String longestNiceSubStr = "";
		int index = 0;
		while (index < input.length()) {
			char cAtIndx = input.charAt(index);
			int endIndx = Character.isLowerCase(cAtIndx) ? input.indexOf(Character.toUpperCase(cAtIndx))
					: input.indexOf(Character.toLowerCase(cAtIndx));
			String subStr = input.substring(index, endIndx + 1);

			int startIndx = index + 1;
			int nextCharIndx = startIndx;
			while (nextCharIndx < subStr.length()) {
				char curChar = input.charAt(nextCharIndx);
				int upLoIndx = Character.isLowerCase(curChar) ? input.indexOf(Character.toUpperCase(curChar))
						: input.indexOf(Character.toLowerCase(curChar));
				if (upLoIndx != -1) {
					String curSubStr = input.substring(startIndx, upLoIndx + 1);
					if (longestNiceSubStr.length() < curSubStr.length())
						longestNiceSubStr = curSubStr;
					nextCharIndx++;
				} else {
					index++;
					break;
				}
			}
		}
		return longestNiceSubStr;
	}

	private String getLngestNiceSubStr(String input) {
		if (input.length() < 1 || input.length() > 100)
			throw new RuntimeException("invalid input String");
		if (input.length() == 1)
			return "";
		int[] lowerArr = new int[26];
		int[] upperArr = new int[26];

		String lowerStr = input.replaceAll("[\\p{Upper}]", "");
		String upperStr = input.replaceAll("[\\p{Lower}]", "");
		String longestNiceSubStr = input;
		for (int i = 0; i <= lowerStr.length() - 1; i++) {
			lowerArr[lowerStr.charAt(i) - 'a']++;
		}

		for (int i = 0; i <= upperStr.length() - 1; i++) {
			upperArr[upperStr.charAt(i) - 'A']++;
		}

		for (int i = 0; i < 26; i++) {
			char c = 0;
			if (lowerArr[i] != 0 && upperArr[i] == 0) {
				c = (char) (i + 97);
			} else if (lowerArr[i] == 0 && upperArr[i] != 0) {
				c = (char) (i + 97);
			}
			if (c != 0) {
				int indexOfC = (input.indexOf(c) != -1) ? input.indexOf(c) : input.indexOf(Character.toUpperCase(c));
				String subStr1 = input.substring(0, indexOfC);
				String subStr2 = input.substring(indexOfC + 1);

				if (subStr1.length() < subStr2.length()) {
					longestNiceSubStr = getLngestNiceSubStr(subStr2);
				} else if (subStr1.length() > subStr2.length()) {
					longestNiceSubStr = getLngestNiceSubStr(subStr1);
				} else {
					String niceSubStr1 = getLngestNiceSubStr(subStr1);
					String niceSubStr2 = getLngestNiceSubStr(subStr2);
					if (niceSubStr1.length() < niceSubStr2.length())
						longestNiceSubStr = niceSubStr2;
					else
						longestNiceSubStr = niceSubStr1;
				}

			}

		}
		return longestNiceSubStr;
	}

}
