package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinMax {
	
		List<Map<String, Integer>> minMaxMapList = new ArrayList<Map<String, Integer>>();
		List<Integer> stack = new ArrayList<Integer>();

		public void push(int number) {
			Map<String, Integer> newMinMax = new HashMap<String, Integer>();
			newMinMax.put("min", number);
			newMinMax.put("max", number);
			if (minMaxMapList.size() > 0) {
				Map<String, Integer> lastMinMax = new HashMap<String, Integer>(
						minMaxMapList.get(minMaxMapList.size() - 1));
				newMinMax.replace("min", Math.min(lastMinMax.get("min"), number));
				newMinMax.replace("max", Math.max(lastMinMax.get("max"), number));
			}
			minMaxMapList.add(newMinMax);
			stack.add(number);
		}

		public int getMin() {
			return minMaxMapList.get(minMaxMapList.size() - 1).get("min");
		}

		public int getMax() {
			return minMaxMapList.get(minMaxMapList.size() - 1).get("max");
		}

		public int peek() {
			return stack.get(stack.size() - 1);
		}

		public int pop() {
			minMaxMapList.remove(minMaxMapList.size() - 1);
			return stack.remove(stack.size() - 1);
		}

	

	public static void main(String[] args) {
		MinMax mN = new MinMax();
		mN.push(5);
		mN.push(4);
		System.out.println(mN.getMin());
		System.out.println(mN.getMax());
        System.out.println(mN.peek());
        System.out.println(mN.pop());
        System.out.println(mN.getMin());
        System.out.println(mN.peek());
	}

}
