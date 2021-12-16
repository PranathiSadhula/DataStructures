package week1.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfElements {
	/*
	 * Given sorted integer array in non-decreasing order, return the 
	 * array of the squares of each number sorted in non-decreasing order
	 * 
	 * diff btw non-decreasing order and increasing order : 
	 * non-decreasing order means not strict order i.e, elts can repeat next to next. ex : 2,3,4,4,5
	 * increasing order means strict order i.e, no elts repeat next to next. exg: 2,3,4,5
	 */

	//test data
	@Test
	public void testEdgeCase() {
		int[] nums = {-7,-5,1,4,7};
		int[] output = {1,16,25,49,49};
		Assert.assertArrayEquals(output, squareAndSort(nums));
	}
	
	@Test
	public void testNegative() {
		int[] nums = {};
		int[] output = {};
		Assert.assertArrayEquals(output, squareAndSort(nums));
	}
	
	@Test
	public void testPositive() {
		int[] nums = {2,3,4,4,5};
		int[] output = {4,9,16,16,25};
		Assert.assertArrayEquals(output, squareAndSort(nums));
	}
	
	//Pseudo code
	/*
	 * 1. accept i/p array
	 * 2.traverse each elt using for loop
	 * 3.multiply each elt with it and assign product value into same ith index in input array itself
	 * 4.at the end of for loop, sort the final array using Arrays.sort.
	 * 5.return the final sorted array.
	 * 6.on testcase, assert expected output and input array after above operations performed.
	 */
	
	//actual code
	
	private int[] squareAndSort(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] *nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}
