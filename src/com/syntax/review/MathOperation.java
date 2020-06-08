package com.syntax.review;

public class MathOperation {
	// can be accessed from everywhere
		public int add(int num1, int num2) {
			int addition = num1 + num2;
			return addition;
		}

		// can be accessed from inside package, and inheritance
		protected void addNoReturn(int num1, int num2) {
			int addition = num1 + num2;
			System.out.println("Printing the result " + "inside the method " + addition);
		}

		// can be accessed from inside package
		int multiply(int num1, int num2) {
			return num1 * num2;
		}

		// can be accessed only within this class
		private void smth() {

		}
		public static void main(String[] args) {
			MathOperation math = new MathOperation();

			int result = math.add(4, 5);
			System.out.println("result is " + result);

			math.addNoReturn(4, 5);

			System.out.println(math.add(5, 2));

			result = math.multiply(3, 4);
			System.out.println("multiplication result is " + result);

			// cannot access this method, because it is private
			// math.smth();

			// HW only for Farid :)
			// create divide method
			// create substruct method
		}

	}

