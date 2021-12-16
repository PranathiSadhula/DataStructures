package week1.day1.assignments;

import org.junit.Assert;
import org.junit.Test;

public class As1_MoveZeroesEnd {
	/**
	 * Arrays and String Problem
1.	283. Move Zeroes
Link: https://leetcode.com/problems/move-zeroes/
Problem Statement:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
	 */
	
	//testdata
	@Test
	public void testPos() {
		int[] nums = {0,1,0,2,12};
		moveZeroesEnd(nums);
		Assert.assertArrayEquals(nums, new int[] {1,2,12,0,0});
	}
	
	
	public void testEdge() {
		int[] nums = {0,0,0};
		//Assert.assertArrayEquals(moveZeroesEnd(nums), new int[] {0,0,0});
	}
	
	public void testNeg() {
		int[] nums = {};
		//Assert.assertArrayEquals(moveZeroesEnd(nums), new int[] {});
	}
	

	private void moveZeroesEnd(int[] nums) {
		int zeroCount = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] != 0) {
				nums[zeroCount++] = nums[i];
			}
		}
				
		while(zeroCount < nums.length) {
			nums[zeroCount++] = 0;
		}
		//return nums;
	}

}
