package com.syntax.class11;

public class TaskTowDArray {

	public static void main(String[] args) {
		String [][] cars= {
				{"Ford","chivi","GMC","Lincolin"},
				{"Toyota","Honda","Leuxis","Acura"},
				{"Hundai", "KIA","Nissan","infinity"}
		};
		for (int r=0; r<cars.length; r++) {
			for (int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
				
			}
			System.out.println();
		}
		System.out.println("==============");
		for (String[] company:cars) {
			for(String type:company) {
				System.out.print(type+" ");
			}
			System.out.println();
		}
	}

}
