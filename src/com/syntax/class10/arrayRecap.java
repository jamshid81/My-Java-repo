package com.syntax.class10;

public class arrayRecap {

	public static void main(String[] args) {
		String[]cities= { "Kabul", "Washington DC", "Mascaw", "Mazar e Sherif","Tehran", "Bejing","London", "New Yark"};
		System.out.println(cities[0]);
		int x=2;// we can assign value to the array
		System.out.println("I moved to "+cities[x]);
		x-=2;
		System.out.println("I lived in the "+cities[x]);
		// to find the total element stored inside an array?
		// we intialize another variable name look at the example bellow
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		//how can we aces last element from an array
		System.out.println(cities[arraySize-2]);
		System.out.println("---------arrayAndForLoop------------");
		for (int i=0; i<arraySize; i++) {//
			System.out.print(cities[i]+", ");
		}
		

	}

}
