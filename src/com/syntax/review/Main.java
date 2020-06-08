package com.syntax.review;
//	static String alphabetical(String str) {
//		String newWord="";
//		char [] alpha=str.toCharArray();
//		newWord=newWord+alpha [0];
//		for (int i=1; i<alpha.length; i++) {
//		if (alpha[i-1]<alpha[i]) {
//		newWord=newWord+alpha[i];
//		}
//		}
//		return newWord;
//		}
//		// test case below (dont change):
//		public static void main(String[] args) {
//		System.out.println(alphabetical("hello")); // "hlo"
//		System.out.println(alphabetical("sftware")); // "
//		System.out.println(alphabetical("language")); // "
//		}
//		}
//	public static String alphabetical(String str) {
//		str = str.toLowerCase();
//		char[] ch = str.toCharArray();
//		String alphabetical = "";
//		alphabetical = alphabetical + ch[0];
//		char c = ch[0];
//		for (int i = 0; i < ch.length; i++) {
//			if (c < ch[i]) {
//				alphabetical += ch[i];
//			}
//			c = ch[0 + i];
//		}
//		return alphabetical;
//	}
//	//test case below (dont change):
//	public static void main(String[] args){
//		System.out.println(alphabetical("hello")); //"hlo"
//		System.out.println(alphabetical("software")); //"stwr"
//		System.out.println(alphabetical("language")); //"lnug"
//	}
//}
//	public static int maxValue(int []arr){//void maxValue(int []arr])
//		   static  dogBreed="Matt";
//		int max=arr[0];
//		   for (int i=0; i<arr.length; i++){
//		     if (max<arr[i]){
//		       max=arr[i];
//		     }
//		    
//		   }
//		   return max;//incase of void the sysout should be here
//		  
//		 }
//			public static void main(String[] args) {
//				int[] arr = {5,12,-3,7,3,22};
//			 System.out.println(maxValue(arr)); //should print 22
////				Main obj=new Main();
////				obj.maxValue(arr);
//			}
//			
//			
//		}
	public class Main {
		  public static void main (String[]args){
		  Dog obj =new Dog("Tarzan", 50.0, "Mutt");
		  obj.doginfo();
		  Dog obj1=new Dog("Lucy", 10.0, "Mutt");
		  obj1.doginfo();
		  

		  }
		}
	class Dog {
		  String dogName;
		  double dogWieght;
		  static String dogBreed="Matt";
		  Dog(String dogName,  double dogWieght, String dogBreed) {
	
		  this.dogName=dogName;
		  this.dogWieght=dogWieght;
		  
		  }
		  void doginfo(){
		    System.out.println(dogName+" "+dogBreed+" "+dogWieght);
		  }
		}
	