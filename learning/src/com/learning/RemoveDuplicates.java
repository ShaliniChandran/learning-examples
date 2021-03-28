package com.learning;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String [] arr = {"One","One","two","three","four","five","five"};
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String str : arr) {
			if(map.containsKey(str)) {
				int val = map.get(str);
				map.put(str, val+1);
			}else {
				int val =0;
				map.put(str, val+1);
			}
		}
		for(String str:map.keySet()) {
			System.out.println(str + ":" +map.get(str));
		}
	}

}
