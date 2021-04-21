package com.learning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateNames {

	public static void main(String args[]) {
		RemoveDuplicateNames rD = new RemoveDuplicateNames();
		System.out.println("Enter the no of names: ");
		Scanner sc = new Scanner(System.in);
		String[] names = new String[sc.nextInt()];
		sc.nextLine();
		System.out.println("Enter the names: ");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		rD.removeDuplicates(names);

	}

	private void removeDuplicates(String[] names) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : names) {
			int ctr = 1;
			if (map.containsKey(str)) {
				// do nothing
			} else {
				map.put(str, ctr);
				ctr++;
			}
		}
		for (String str : map.keySet()) {
			System.out.println(str);
		}
	}
	/*
	void test() {
		()(8 + 12) * (2/4);
		{} [] ();
		{]};
	}
	*/
	
}




