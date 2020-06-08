package com.syntax.class17;

public class ClassStudents {
	String name1;
	int math;
	int language;
	int history;

	void studentavariage() {
		int ave = (math + language + history);
		System.out.println(name1 + " average score is " + ave / 3);

	}

	public static void main(String[] args) {
		ClassStudents obj = new ClassStudents();
		obj.name1 = "Ahmad";
		obj.math = 89;
		obj.language = 90;
		obj.history = 100;
		obj.studentavariage();

		ClassStudents obj1 = new ClassStudents();
		obj1.name1 = "Rohani";
		obj1.math = 95;
		obj1.language = 99;
		obj1.history = 100;
		obj1.studentavariage();

		ClassStudents obj2 = new ClassStudents();
		obj2.name1 = "Faisal";
		obj2.math = 99;
		obj2.language = 79;
		obj2.history = 95;
		obj2.studentavariage();

		ClassStudents obj3 = new ClassStudents();
		obj3.name1 = "Sharma";
		obj3.math = 99;
		obj3.language = 84;
		obj3.history = 95;
		obj3.studentavariage();

		ClassStudents obj4 = new ClassStudents();
		obj4.name1 = "Saif";
		obj4.math = 99;
		obj4.language = 84;
		obj4.history = 95;
		obj4.studentavariage();
	}
}
