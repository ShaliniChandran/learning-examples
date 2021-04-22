package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int l = nums.length;
		int res[] = new int[2];
		for (int i = 0; i < l; i++) {
			map.put(nums[i], i);

		}
		for (int i = 0; i < l; i++) {
			int complement = target - nums[i];
			
			if (map.containsKey(complement) && map.get(complement) != i) {
				System.out.println("complement:" + complement);
				res[0] = i;
				res[1] = map.get(complement);
				break;
			}
		}

		return res;
	}

	public static void main(String args[]) {
		int n, target;
		TwoSum sol = new TwoSum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array :");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the target :");
		target = s.nextInt();
		int resArr[] = new int[2];
		resArr = sol.twoSum(a, target);
		System.out.println("Output :");
		System.out.println("[" + "" + resArr[0] + "," + resArr[1] + "]");
	}

}
