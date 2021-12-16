package week1.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElt {
	/*
	 * Given an int array & target, remove elt from array matching with given target
	 * 
	 * static array and dynamic array !!
	 * 
	 * static array --> Length fixed --> number of elements is declared at the
	 * begining you cannot resize them --> resize?? --> create another array
	 * (Arrays.copyOf)
	 * 
	 * Dynamic array --> Array size that can change (grow or shrink) List / Set /
	 * Map
	 * 
	 */

	// test data
	@Test
	public void testPos() {
		int[] arr = { 5, 6, 9, 8 };
		int t = 9;
		int[] output = { 5, 6, 8 };
		Assert.assertArrayEquals(output, removeElt(arr, t));
	}

	@Test
	public void testEdge1() {
		int[] arr = { 5, 6, 9, 9, 8 };
		int t = 9;
		int[] output = { 5, 6, 8 };
		Assert.assertArrayEquals(output, removeElt(arr, t));
	}

	@Test
	public void testEdge2() {
		int[] arr = { 9, 9, 9, 9 };
		int t = 9;
		int[] output = {};
		Assert.assertArrayEquals(output, removeElt(arr, t));
	}

	@Test
	public void testNeg() {
		int[] arr = { 5, 6, 9, 8 };
		int t = 10;
		int[] output = { 5, 6, 9, 8 };
		Assert.assertArrayEquals(output, removeElt(arr, t));
	}

	// pseduo code
	/*
	 * 1.accept intput array and target. 
	 * 2.check if array is empty -> if empty return {}
	 * 3.create additional list --> using list bcz of its dynamic size as output is not of fixed size. 
	 * 4.traverse each elt on input array using for loop.
	 * 5.check if each elt not matches given target. a) if true -> add to
	 * list. b) else -> do nothing. 6.at end of for loop, convert list to array and
	 * return the array. 7. on testcase, assert expected output and this returned
	 * output.
	 * 
	 */

	private int[] removeElt(int[] nums, int target) {
		if (nums.length == 0)
			return new int[] {};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target)
				list.add(nums[i]);
		}
		int[] output = new int[list.size()];
		for(int i =0; i < list.size(); i++)
			output[i] = list.get(i);
		return output;
	}

}
