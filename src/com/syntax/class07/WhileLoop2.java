package com.syntax.class07;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		/* int i=0;
		* while(i<5){
		* {system.out.println(i);
		* i++;
		*/
		boolean rain=true;
		while (rain) {
			System.out.println("Take an umbrella");
			rain=false;
		}
		int y=1;
		while (y<20) {
			System.out.print(y+++" ");
			y++;
			//it keeps printing untill it reaches the condition in this case as long as the number is smaller
			//than 20
			
		}
	}

}
