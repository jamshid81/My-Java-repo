package com.syntax.class21;

public class Degree {

void getPrerRequisit() {
	System.out.println("To get a degree, you have to be graduated from highschool");
}

}
class Bachelor extends Degree{
	@Override //this is to check if override has had happened
	void getPrerRequisit() {
		System.out.println(" You need to have a highschool diploma, before to get Bachelor ");
	}
	
}
class Master extends Degree{
	void getPrerRequisit() {
		System.out.println("You need to have a Bachelor, before to get Bachelor you have Master");
}

}	
//class TestN{
//public static void main(String[] args) {
//	Degree obj=new Degree();
//	obj.getPrerRequisit();
//	Bachelor bDegree=new Bachelor();
//	bDegree.getPrerRequisit();
//	Master mDegree=new Master();
//	mDegree.getPrerRequisit();
//}
//}
