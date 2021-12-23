package week2.day1;

import org.junit.Test;

public class TP_1_ReverseString {
	/**
	 * Reverse given string using two pointer.
	 */
	//pseudo code
	/*
	 * 1.accept string as input.
	 * 2.convert given string to charArray.
	 * 3.start left from 0 and rt from length-1.
	 * 4.while until left < rt
	 * 5.swap chars using temp variable and decrement rt, increase left.
	 * 
	 */
@Test
public void test() {
	String s = "gige";
	reverseStrng(s);
}
	private void reverseStrng(String s) {
		char[] ch = s.toCharArray();
		int left = 0;
		int rt = s.length()-1;
		while(left <rt) {
			char temp = ch[left];
			ch[left++] = ch[rt];
			ch[rt--] = temp;
		}
		
		System.out.println(new String(ch));
	}
}
