package week2.day1;

import org.junit.Test;

public class TP_5_IntersectionOf2Arrays {
/**
 * GIven 2 integer sorted arrays, print intersection of 2arrays.
 * Ex:
 * int[] a1 = {2,3,4,9,18,21};
 * int[] a2 ={9,21,48}
 * o/p = {9,21}
 */
@Test
public void test() {
	int[] a1 = {2,3,4,9,18,21,50,51,86};
	 int[] a2 ={9,21,48,51,68,86};
	 printIntersection(a1,a2);
}
	//pseudo code
	/*
	 * 1. accept 2 integer sorted arrays as input.
	 * 2. start leftPointer from elt at 0th index in array1.
	 * 3. start rtPointer from elt at 0th index in array2.
	 * 4.compare both left and rt
	 * 		a) if both matches --> print leftPointer and move left and rt by increasing 
	 * 		b) if left < rt --> move left by increasing.
	 * 		c) if left > rt --> mover rt by inreaseign.
	 */

	//actual code
private void printIntersection(int[] a1, int[] a2) {
	int left = 0;
	int rt = 0;
	while(left < a1.length && rt < a2.length) {
		if(a1[left] == a2[rt])
		{
			System.out.print(a1[left]+",");
			left++;
			rt++;
		}
		else if(a1[left] < a2[rt])
			left++;
		else
			rt++;
	}
}
	
}
