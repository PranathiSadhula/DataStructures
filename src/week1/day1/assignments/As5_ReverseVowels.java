package week1.day1.assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class As5_ReverseVowels {
	/**
	 * Given a string s, reverse only all the vowels in the string and return it.The
	 * vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
	 * Example 1: Input: s = "hello" Output: "holle" Example 2: Input: s =
	 * "leetcode" Output: "leotcede
	 * 
	 */

	// testdata
	@Test
	public void testPos() {
		String input = "leetcode";
		String output = "leotcede";
		System.out.println(reverseVowels(input));
	}

	@Test
	public void testEdge() {
		String input = "reverse";
		String output = "reverse";
	}

	@Test
	public void testNeg() {
		String input = "cry";
		String output = "cry";
	}
	
	@Test
	public void test1() {
		String input = "world";
		String output = "world";
	}

	@Test
	public void testEmpty() {
		String input = "";
		// expected 's' to have 1 <= size <= 300000 but got 0
	}

	// pseudo code
	/*
	 * 1.accept string as input & return string with vowels reversed. 2.check if
	 * input length is less than 1, if yes return "error msg" 3.store all vowels of
	 * given input string in a list or array. 4.reverse the stored array. 5.insert
	 * reversed array into string. 6.return final string.
	 */

	// actual code
	private String reverseVowels(String s) {
		if (s.length() == 0)
			return "expected 's' to have 1 <= size <= 300000 but got 0";

		char[] vowels = s.replaceAll("[^aeiouAEIOU]", "").toCharArray();
		char[] allChars = s.toCharArray();
		int vIndx = vowels.length-1;
		for (int i = 0; i < allChars.length && vIndx >= 0; i++) {
			System.out.println("in str : char at ["+i+"] is "+allChars[i]);
			if (isVowel(allChars[i])) {
				System.out.println("char at ["+vIndx+"] is "+vowels[vIndx]);
			//	s = s.replaceFirst(s.charAt(i)+"", vowels[vIndx--]+"");
				allChars[i] = vowels[vIndx--];
			}
		}
		s = new String(allChars);
		return s;
	}

	private boolean isVowel(char c) {
		Pattern pVowels = Pattern.compile("[aeiouAEIOU]");
		Matcher vowelMatcher = pVowels.matcher(c + "");
		return vowelMatcher.find() ? true : false;
	}

}
