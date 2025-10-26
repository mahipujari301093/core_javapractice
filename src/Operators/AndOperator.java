package Operators;

public class AndOperator {

	// && evaluates both conditions and returns true only if both are true.
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a < b && a <= c); // true && true → true
		System.out.println(b > c && b <= a); // true && false → false


	}
	
/*  Logical AND (&&) → Both conditions must be true for the whole expression to be true.

        If any one condition is false, the result is false.
        
        
*/
	
	

}
