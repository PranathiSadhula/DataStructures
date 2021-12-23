package week2.day1;

import org.junit.Assert;
import org.junit.Test;

public class TP_4_MoveZeroes {
	/**
	 * Arrays and String Problem 1. 283. Move Zeroes Link:
	 * https://leetcode.com/problems/move-zeroes/ Problem Statement: Given an
	 * integer array nums, move all 0's to the end of it while maintaining the
	 * relative order of the non-zero elements. Example 1: Input: nums =
	 * [0,1,0,3,12] Output: [1,3,12,0,0] Example 2: Input: nums = [0] Output: [0]
	 */

	// testdata
//	@Test
	public void testPos() {
		int[] nums = { 0, 1, 0,2,0, 12, 0, 0, 10 };
		moveZeroesEnd(nums);
		Assert.assertArrayEquals(nums, new int[] { 1,2,12,10,0,0,0,0,0 });
	}
	
			
			@Test
			public void testPos1() {
				int[] nums = { 4,2,4,0,0,3,0,5,1,0};
				moveZeroesEnd(nums);
				Assert.assertArrayEquals(nums, new int[] { 4,2,4,3,5,1,0,0,0,0 });
			}
	// pseudo code
	/*
	 * 1.start left from 0 and rt from 0.
	 * 2.loop until left<rt 
	 * 3.if nums[rt] matches with 0 ==> swap both. and increae left. 
	 * 4.irrespective of matching with 0, increment right.
	 * 
	 */
	private void moveZeroesEnd(int[] nums) {
		int left = 0;
		int rt = 0;
		while ( rt < nums.length) {
			if (nums[rt] != 0) { //10,1,2,12,0,2,0,0
				nums[left++] = nums[rt];
				nums[rt] = 0;
			}
			rt++;
		}

	}

	public void testEdge() {
		int[] nums = { 0, 0, 0 };
		// Assert.assertArrayEquals(moveZeroesEnd(nums), new int[] {0,0,0});
	}

	public void testNeg() {
		int[] nums = {};
		// Assert.assertArrayEquals(moveZeroesEnd(nums), new int[] {});
	}

}
