package Operators;

public class OR_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;

		
		
		System.out.println(a > b || c > a); // false || true → true
		System.out.println(a > b || c < a); // false || false → false
		System.out.println(a < b || c < a); // true || false → true

		
		 // || → true if at least one condition is true.

        // Only false if both conditions are false.
		
		
	}

}