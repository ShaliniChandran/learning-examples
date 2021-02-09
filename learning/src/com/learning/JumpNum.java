package com.learning;

public class JumpNum {

	public static void main(String[] args) {
		int array[] = {1,3,5,8,9,2,6,7,6,8,9};
		int jnum = jump(array);
		System.out.println("Number of jumps required ::" +jnum);

	}

	private static int jump(int[] nums) {
		int a = nums[0];
		int b = nums[0];
		int jumps = 1;
		for(int i=1;i<nums.length -1;i++) {
			if(i == nums.length -1) {
				return jumps;
			}
			a --;
			b --;
			if(nums[0]>b)
			{
				b = nums[i];
			}
			if(a == 0) {
				jumps ++;
				a=b;
			}
		}
		
		return jumps;
	}

}
