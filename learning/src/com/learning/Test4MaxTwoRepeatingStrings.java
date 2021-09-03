package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test4MaxTwoRepeatingStrings {

	public static void main(String[] args) {
		Test4MaxTwoRepeatingStrings obj = new Test4MaxTwoRepeatingStrings();
		List<String> names = new ArrayList<String>();
		names.add("Shalini");
		names.add("Mahav");
		names.add("Pavithra");
		names.add("Shibin");
		names.add("Shalini");
		names.add("Maav");
		names.add("Madhav");
		Collections.sort(names);
		obj.maxTwo(names);

	}

	private void maxTwo(List<String> names) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int ctr = 1;
		for (int i = 0; i < names.size() - 1; i++) {
			if (i == 0) {
				map.put(names.get(0), ctr);
			}

			if (names.get(i).equals(names.get(i + 1))) {
				ctr++;
			} else {

				for (Entry<String, Integer> set : map.entrySet()) {
					int mapCtr = set.getValue();
					if (ctr > mapCtr) {
						map.remove(names.get(0));
						map.put(names.get(i), ctr);
						ctr = 1;
					}
				}

			}
		}
		for (Entry<String, Integer> set : map.entrySet()) {
			System.out.println(set.getKey());
		}
	}

}
