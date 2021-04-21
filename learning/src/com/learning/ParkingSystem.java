package com.learning;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
	int bigCtr = 0;
	int medCtr = 0;
	int smallCtr = 0;

	public ParkingSystem(int big, int medium, int small) {
		bigCtr = big;
		medCtr = medium;
		smallCtr = small;
	}

	public static void main(String[] args) {
		ParkingSystem ps = new ParkingSystem(1, 1, 0);
		boolean result = ps.addCar(1);
		System.out.println("The result is :" +result);
	}

	public boolean addCar(int type) {
		Map<Integer, String> carType = new HashMap<Integer, String>();
		boolean res = false;
		carType.put(1, "big");
		carType.put(2, "medium");
		carType.put(3, "small");
		if (carType.get(type) == "big") {
			if (bigCtr == 0)
				res = false;
			else {
				bigCtr--;
				res = true;
			}
		}
		if (carType.get(type) == "medium") {
			if (medCtr == 0)
				res = false;
			else {
				medCtr--;
				res = true;
			}
		}
		if (carType.get(type) == "small") {
			if (smallCtr == 0)
				res = false;
			else {
				smallCtr--;
				res = true;
			}
		}
		return res;

	}

}
