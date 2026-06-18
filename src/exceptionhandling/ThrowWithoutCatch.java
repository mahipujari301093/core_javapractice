package exceptionhandling;

import java.security.InvalidParameterException;

public class ThrowWithoutCatch {

	public static void main(String[] args) {


		int age = 65;

		if (age >= 18 && age <= 60)  //  one condition false hence else block will execute with error message
		{

			System.out.println("Customer is eligible to proceed");

		}

		else

		{

			throw new IllegalArgumentException ("Customer age must be between 18 and 60 to proceed with the insurance application.");

		}

	}
}

/*

Simple Definition of throw keyword:

Real-time Example: Insurance Application (Needs Assessment Page)

Business Rule:

Customer age should be between 18 and 60 years to proceed with the insurance application.

Java does not know this business rule automatically.

Example:

int age = 65;

For Java:

65 is just a valid integer value ✅

There is no technical error.

But according to the insurance business rule:

Age 65 is not eligible ❌

So the developer explicitly tells Java:

"If the customer age is not between 18 and 60, throw an exception and show a meaningful error message to the user."


 */


