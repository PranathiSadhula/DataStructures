package week2.day1;

import org.junit.Test;

public class TP_3_ReverseVowels {
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
		reverseVowels(input);
	}

	//pseudo code
	/*
	 * 1.accept string as input.
	 * 2.start left from 0 and rt from input.length-1
	 * 3.loop until left < rt.
	 * 4.check if both chars At at left and rt are vowels
	 * 		a) if both vowels --> swap chars and move left by increasing and move rt by decreasing.
	 * 		b) if only char at left is vowel --> move rt by decreasing.
	 * 		c) if only char at rt is vowel --> move left by increasing.
	 * 5.return final string.
	 */
	private void reverseVowels(String input) {

		int left = 0;
		int rt = input.length()-1;
		char[] chars = input.toCharArray();
		while(left < rt) {
			if(isVowel(input.charAt(left)) && isVowel(input.charAt(rt))) {
				char temp = chars[left];
				chars[left++] = chars[rt];
				chars[rt--] = temp;
			}
			else if(isVowel(input.charAt(left)) )
				rt--;
			else
				left++;
		}
		System.out.println(new String(chars));
	}
	
	private boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'e'  
			||	c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		else return false;
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

}
