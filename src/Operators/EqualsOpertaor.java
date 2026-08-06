package Operators;

public class EqualsOpertaor {

	public static void main(String[] args) {

        // Example: Using Equality (==) to compare values

		int expectedLinks = 1001;
		int actualLinks = 1001;

		if (expectedLinks == actualLinks)
		{
			System.out.println("Count matched");
		}


		else

		{
			System.out.println("Count not matched");
		}


	}
}


/*


The == operator is used to compare two values, but its behavior depends on the data type.

1. Primitive Data Types (int, char, double, etc.)

It compares the actual values.

int a = 10;
int b = 10;

System.out.println(a == b); // true

👉 Both values are 10, so the result is true.

2. Objects (String, ArrayList, custom classes, etc.)

It compares the memory addresses (references), not the object contents.

String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2); // false

👉 s1 and s2 contain the same text, but they are stored at different memory locations.

To compare the actual content, use .equals():



















*/