package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 3, 4 };
		obj.findDifference(arr1, arr2);
	}

	void findDifference(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			int ctr1 = 1;
			if (!map1.containsKey(arr1[i])) {
				map1.put(arr1[i], ctr1++);
			} else {
				map1.put(arr1[i], ctr1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			int ctr2 = 1;
			if (!map2.containsKey(arr2[i])) {
				map2.put(arr2[i], ctr2++);
			} else {
				map2.put(arr2[i], ctr2);
			}
		}
		for (Entry<Integer, Integer> set : map1.entrySet()) {
			if (!map2.containsKey(set.getKey())) {
				System.out.println(set.getKey());
			} else {
				continue;
			}
		}
		for (Entry<Integer, Integer> set : map2.entrySet()) {
			if (!map1.containsKey(set.getKey())) {
				System.out.println(set.getKey());
			} else {
				continue;
			}
		}

	}

}

/*
 * {1,2,3} {2,3,4}
 * 
 * difference = {1,4}
 */