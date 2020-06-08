package com.syntax.class17;

public class USA {
	// create variables to hold state and capital of the state
	String state, stateCapital;

	// create method to display state and stateCapital
	public void display() {
		System.out.println(state + " and it's capital is " + stateCapital);
	}

	// create a Constructor that will initialize instance variables
	public USA(String statename, String stateCapital) {
		state = statename;//either
		//or this.state=state and then we can have same name for local variable like bellwo
		this.stateCapital = stateCapital;//or use "this"
	}

	public static void main(String[] args) {

		USA usa = new USA("Virginia", "Richmond");
		usa.display();
	}
}
