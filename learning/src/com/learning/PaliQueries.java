package com.learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PaliQueries {

	public static void main(String[] args) {
		String s = "abcda";
		int[][] queries = { { 3, 3, 0 }, { 1, 2, 0 }, { 0, 3, 1 }, { 0, 3, 2 }, { 0, 4, 1 } };
		List<Boolean> res = new ArrayList();
		for (int[] query : queries) {
			res.add(canMakePalindrome(s, query[0], query[1], query[2]));
		}
		for(int i=0;i< res.size();i++)
			System.out.println(res.get(i));
	}

	private static Boolean canMakePalindrome(String s, int start, int end, int max) {
		Set<Character> set = new HashSet();
		for (int i = start; i <= end; i++) {
			if (!set.add(s.charAt(i))) {
				set.remove(s.charAt(i));
			}

		}
		return (max >= (set.size() / 2));
	}

}
