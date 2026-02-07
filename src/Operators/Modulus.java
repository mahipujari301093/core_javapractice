package Operators;

public class Modulus {
	
	// “The modulus operator % returns the remainder after division.”

	public static void main(String[] args) {

		int a = 11 % 2;          // remainder when 10 is divided by 3

		int c = 100 % 4;       // remainder when 100 is divided by 4


		System.out.println(a);
		System.out.println(c);


		// Example: Check if a number is even or odd using modulus operator

		int number = 13;  // You can change this number to test with different values

		if (number % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}


	}

}
