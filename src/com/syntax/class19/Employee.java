package com.syntax.class19;

public class Employee {
	static String company;
	int id;
	double salary;
	void getpaid() {
		System.out.println("This employee is paid a base pay of "+ salary+" anualy");
	}
	static void work() {
		System.out.println("all employee Work for "+company);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary=75000;
		emp.id=1234;
		company="syntax";
		work();
		emp.getpaid();
		ScrumTeam st=new ScrumTeam();
		st.salary=450000;
		st.cermonies="daily Stand up";
		st.attendMetting();
		ScramMaster sm=new ScramMaster();
		sm.cermonies= "All meetings";
		sm.navigateTeam();
		
		
	}
}
