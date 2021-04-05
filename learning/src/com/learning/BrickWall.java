package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BrickWall {
	
	public int leastBricks(List<ArrayList<Integer>> wall) {
		int result = 0;
		int maxValue = 0;
		HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
		
		for(ArrayList<Integer> row : wall) {
			int sum =0;
			for(int i=0;i<row.size() -1;i++) {
				sum += row.get(i);
				if(map.containsKey(sum)) {
					map.put(sum, map.get(sum) +1);
				}else {
					map.put(sum, 1);
				}
			}
			
		}
		for(int j : map.keySet()) {
			if(map.get(j) > maxValue) {
				maxValue = map.get(j);
			}
		}
		result = wall.size() - maxValue;
		return result;
        
    }

	public static void main(String[] args) {
		
		BrickWall bw = new BrickWall();
		List<ArrayList<Integer>> wall = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);a1.add(2);a1.add(2);a1.add(1);
		wall.add(a1);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(3);a2.add(1);a2.add(2);
		wall.add(a2);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(1);a3.add(3);a3.add(2);
		wall.add(a3);
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(2);a4.add(4);
		wall.add(a4);
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(3);a5.add(1);a5.add(2);
		wall.add(a5);
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		a6.add(1);a6.add(3);a6.add(1);a6.add(1);
		wall.add(a6);
		int res = bw.leastBricks(wall);
		System.out.println("The least number of bricks crossed to draw line is :" +res);
	}

}
