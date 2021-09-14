package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimeOverlap {
	static boolean isOverlap = false;
    public static class Interval{
    	int start;
    	int end;
    	public Interval(int start , int end) {
    		this.start = start;
    		this.end = end;
    	}
    	
    }
	public static void main(String[] args) {
		TimeOverlap obj = new TimeOverlap();
		List<Interval>  arr = new ArrayList<Interval>();

		/*
		arr.add(new Interval(1,2));
		arr.add(new Interval(2,3));
		arr.add(new Interval(3,4));
		arr.add(new Interval(4,5));
		arr.add(new Interval(0,1));
		*/
		arr.add(new Interval(3,4));
		arr.add(new Interval(2,3));
		arr.add(new Interval(2,4));
		arr.add(new Interval(4,5));
		arr.add(new Interval(1,2));


	
		int minNumber = obj.isOverlap(arr);
		System.out.println("min no of overlaps to be removed :" +minNumber);
	}
	private int isOverlap(List<Interval> arr) {
		int minNum = 0;
		int m = arr.size();
		Collections.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval t1, Interval t2) {
                return t1.start - t2.start;
            }
        });

		for(int i=0;i<m -1;i++) {
			if(arr.get(i).end > arr.get(i+1).start) {
				arr.remove(i);
				minNum++;
				m--;
				i--;
			}
			}
		return minNum;
		}
	

}
