package Operators;

public class EqualsOpertaor {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;

		// Using == to compare values
		System.out.println(a == b); // false, because 10 != 20
		System.out.println(a == c); // true, because 10 == 10

		// For characters
		char x = 'A';
		char y = 'B';
		System.out.println(x == y); // false

		// For boolean
		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println(flag1 == flag2); // false

	}
}
