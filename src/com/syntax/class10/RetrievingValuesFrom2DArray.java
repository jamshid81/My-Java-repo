package com.syntax.class10;

public class RetrievingValuesFrom2DArray {

	public static void main(String[] args) {
		String[][]month= {
				{"January", "February","March"},
				{"April","May","June",},
				{"July","August","September",},
				{"October", "November", "December"}
		};
		int row=month.length;
		int firstRow=month[1].length;
		System.out.println(firstRow);// this will print the number of element in the first row
		
		 for(int i=0; i<month.length; i++) {//iterates over rows
	            
	            for(int j=0; j<month[i].length; j++) {//iterates over columns
	                
	                System.out.print(month[i][j]+", ");
	            }
	            
	            System.out.println();
	}

}
}