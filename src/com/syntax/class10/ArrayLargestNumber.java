package com.syntax.class10;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		//find the lagest elemtn from the array
		int [] nums= {200,30,-1,900,5600,787};
		/*if (nums[0]>nums[1]) {
			System.out.println(nums[0]);
		}else if (nums[0]<nums[1] || nums[1]>nums[2]) {
			System.out.println(nums[1]);
		}else if (nums[0]<nums[1]) || nums[0]>nums[2] {
			System.out.println(nums[0]);
		*/
		int largest=nums[0];// we assign any number assuming that is the largest
		for (int i=0; i<nums.length; i++) {// nums.length represents the number of integers we have
		if (nums[i]>largest) {
			largest=nums[i];
			System.out.println("Largest num is "+largest);
		}
		System.out.println();
		}
		
	}

}