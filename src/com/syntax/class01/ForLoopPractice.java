package com.syntax.class01;

public class ForLoopPractice {

	public static void main(String[] args) {
		int array[]= {204,250,205,45,100,25};
		int num=0;
		int sum=0;
		int largist=0;
		int largist2=0;
		
		for (int i=0; i<array.length; i++) {
			num=array[i];
			System.out.println(num);
			sum=sum+num;
			if (num>largist) {
				largist=num;
			}
			if (num>largist2 && num<largist) {
				largist2=num;
			}
		
		}
		System.out.println("The largist number of the array is "+largist);
		System.out.println("The largist number of the array is "+largist2);
		
		System.out.println("and the sum of the array equals "+sum);
		int reverse;
		System.out.print("The reverse form of the array is :");
		for (int x=array.length-1;x>=0;x--) {
			reverse=array[x];
			
			System.out.print(reverse+" ");
		}
		
		
	}

}
