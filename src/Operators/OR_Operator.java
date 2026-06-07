package Operators;

public class OR_Operator {

	public static void main(String[] args) {

        // OR operator (||) is used when we want to check if at least one condition is true.

		boolean emailValid = true;   // Change this to true to test the "email valid" scenario
		boolean phoneValid = false;

		if (emailValid || phoneValid)
		{
			System.out.println("User can login");
		}

		else
		{
			System.out.println("Provide valid credentials");
		}




	}

}

/*

✅ What is OR operator (||) ?

👉 If ANY ONE condition is true → result is true.
👉 It becomes false only when BOTH are false.

✅ Formula 🧠
true  || true  = true
true  || false = true
false || true  = true
false || false = false

 */