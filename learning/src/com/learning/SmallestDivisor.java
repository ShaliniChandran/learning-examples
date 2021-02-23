package com.learning;

public class SmallestDivisor {
	 public static int smallestDivisor(int[] A, int threshold) {
	        int left = 1, right = (int)1e6;
	        while (left < right) {
	            int m = (left + right) / 2, sum = 0;
	            for (int i : A)
	                sum += (i + m - 1) / m;
	            if (sum > threshold)
	                left = m + 1;
	            else
	                right = m;
	        }
	        return left;
	    }
	public static void main(String[] args) {
		
		int [] arr = {1,2,5,9};
		int threshold = 6;
		int div = smallestDivisor(arr,threshold);
		System.out.println("smallest divisor is :" +div);
	}

}
