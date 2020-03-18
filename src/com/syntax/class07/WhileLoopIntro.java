package com.syntax.class07;

public class WhileLoopIntro {
public static void main(String[] args) {
	// in while loop, we have to assigne the integer first, then creat a condition then execute
	//look at the example;
	int num=1 ;
	
	while (num<=10) {
		
	System.out.println(num);
	num++;	//if we dont write ++, the system prints ifinity number
	}
	System.out.println("****************************************");
	//if we want to print the number in one line we sysout print as apposed to println
	int num1=1;
	while(num1<=25) {
	System.out.print(num1+" ");// if we want to add space we sysout system.out.print(num1+" ");
	num1++;
	}
	System.out.println("****************************");
	int num2=10;
	while (num2>=1) {
		System.out.print(num2+" ");
		num2--;//=+1 replaceable with any number
	}
	System.out.println("******************");
	int num3=1;
	while (num3<=20){
	System.out.print(num3+" ");
	num3+=2;//=(num3%2=0)if we want to add number we add +=number 
	}
}
}
