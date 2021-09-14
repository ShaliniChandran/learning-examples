package com.learning;

public class SubSeq {

	public static void main(String[] args) {
		SubSeq Obj = new SubSeq();
		//int [] arr = {0,2,3,4,5,6,8,10,11};
		//int [] arr = {1,4,5,6,9};
		int [] arr = {1, 2, 3, 4, 5};
		int k =4;
		Obj.findSubSeq(arr,k);

	}

	private void findSubSeq(int[] arr, int k) {	
		int result = 0;
		int min =0;int max =0;int temp =0;
		for(int i=0;i<arr.length -1;i++) {
			for(int j=i+1;j<= arr.length -1;j++) {
				min = arr[i];
				max = arr[j];
				if((max - min) <= k) {
					temp = j-i +1;
					if(temp > result) result = temp;
				}else break;
			}
		}
		System.out.println("Length of longest subseq:" +result);
	}

}

