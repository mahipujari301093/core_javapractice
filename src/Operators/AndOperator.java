package Operators;

public class AndOperator {


	public static void main(String[] args) {

        // Example: Using Logical AND (&&) to check multiple conditions

		boolean isDisplayed = false;   // can be true or false
		boolean isEnabled = true;

		if (isDisplayed && isEnabled)
		{
			System.out.println("Click the button");
		}

		else
		{
			System.out.println("Cannot click");
		}


	}

}





/*  Logical AND (&&) → Both conditions must be true for the whole expression to be true.

    If any one condition is false, the result is false.
    && evaluates both conditions and returns true only if both are true.

    ✅ AND Truth Table (Formula) 🧠
    true  && true  = true
    true  && false = false
    false && true  = false
    false && false = false

*/
	
	


