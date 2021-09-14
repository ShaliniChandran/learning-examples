package com.learning;

import java.util.Arrays;
import java.util.Comparator;

public class NoOverlap {

	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0)
			return 0;
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int prevEnd = intervals[0][1];
		int result = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (prevEnd <= intervals[i][0]) {
				prevEnd = intervals[i][1];
			} else if (prevEnd > intervals[i][0] && prevEnd >= intervals[i][1]) {
				result++;
				prevEnd = intervals[i][1];
			} else {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		NoOverlap obj = new NoOverlap();

		int[][] intervals = new int[][] { { 1, 2 }, 
										{ 3, 5 }, 
										{ 4, 7 }, 
										{ 6, 8 }, 
										{ 9, 10 } };
		int res = obj.eraseOverlapIntervals(intervals);
		System.out.println("Result is :" +res);
	}

}
