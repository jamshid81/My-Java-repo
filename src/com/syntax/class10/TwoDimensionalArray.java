package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [][]numbers=new int [3][4];// ([3])the fist dimention is for row 
										// [4]and the secound is for colum
		//row
		numbers [0][0]=10;
		numbers [0][1]=20;
		numbers [0][2]=30;
		numbers [0][3]=40;
		//row2
		numbers [1][0]=5;
		numbers [1][1]=10;
		numbers [1][2]=15;
		numbers [1][3]=20;
		//row3
		numbers [2][0]=1;
		numbers [2][1]=2;
		numbers [2][2]=3;
		numbers [2][3]=4;
		//print value 15
		System.out.println(numbers[1][2]);
		// another way of writting two dimentional arrays is as bellow
		
		int[][] nums= {
				{10,20,30,40},
				{5,10,15,20},
				{1,2,3,4}
		};//printing and 30
		System.out.println(nums[2][3]);
		System.out.println(nums[0][2]);
		}
	}

