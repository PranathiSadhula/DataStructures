package week1.day1.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.Test;

public class As3_MajorityElement {

	/*
	 * 3.	169. Majority Element
Link: https://leetcode.com/problems/majority-element/
Problem Statement:
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
	 */
	
	//testdata
	@Test
	public void test1() {
	int[]	input = {2,2,3,3,1,3};
	//System.out.println(findMajorityEltBf(input));
	}
	
	@Test
	public void test2() {
		int[] input = {2,4,4};
		System.out.println(findMajorityEltBf(input));
	}
	
	//pseudo code
	/*
	 * 1.accept input array as nums of size n.
	 * 2.sort the given array.
	 * 3.check if more than 2 elts occured max no.of times --> return "there is no majority elt"
	 * 4.fnally return max no.of times of a elt.
	 */
	
	//actual code
	private int findMajorityEltBf(int[] nums) {
		if(1 > nums.length || nums.length > 5*10*10*10*10)
			throw new RuntimeException("invalid array");
		int majorityEltCount = nums.length/2;		
		
		for(int i =0; i <= nums.length -1; i++) {
			int count = 1;
			for(int j = i+1; j <= nums.length -1; j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
				if(count > majorityEltCount)
					return nums[i];
			}
		}
		
		throw new RuntimeException("No major elt found");
	}
	
	
	
	private int findMajorityElt(int[] nums) {
		if(1 > nums.length || nums.length > 5*10*10*10*10)
			throw new RuntimeException("invalid array");
		int majorityEltCount = nums.length/2;		
		int count = 0;
		for(int i =0; i <= nums.length -1; i++) {
			count = Collections.frequency(Arrays.stream(nums).boxed().collect(Collectors.toList()), nums[i]);
			if(count > majorityEltCount)
				return nums[i];
		}
		
		throw new RuntimeException("No major elt found");
	}
}
