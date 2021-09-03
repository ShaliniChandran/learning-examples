package com.learning;

import java.util.Arrays;

public class MergeSort {

	
	public static void main(String[] args) {
		MergeSort mS = new MergeSort();
		int [] array = {8,5,2,9,5,6,3};
		int [] res = mS.mergeSort(array);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

	private int[] mergeSort(int[] array) {
		int len = array.length;
		if(len == 1)
			return array;
		int midIndex = len/2;
		int[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
		int [] rightHalf = Arrays.copyOfRange(array, midIndex, len);
		return mergeSortedArrays(mergeSort(leftHalf),mergeSort(rightHalf));
	}

	private static int[] mergeSortedArrays(int[] leftHalf, int[] rightHalf) {
		int[] sortedArray = new int[leftHalf.length + rightHalf.length];
		int i=0;int j=0;int k=0;
		while(i < leftHalf.length && j < rightHalf.length) {
			if(leftHalf[i] <= rightHalf[j]) {
				sortedArray[k] = leftHalf[i];
				i++;
			}else {
				sortedArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while(i < leftHalf.length) {
			sortedArray[k] = leftHalf[i];
			i++;
			k++;
		}
		while(j < rightHalf.length) {
			sortedArray[k] = rightHalf[j];
			j++;
			k++;
		}
		return sortedArray;
	}

}
