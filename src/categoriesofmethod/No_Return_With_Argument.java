package categoriesofmethod;

public class No_Return_With_Argument {


	// ✅ No return, WITH arguments method receives input but does not return any value to the caller.


	public void bankDetails(String bankName, int balance, String welcome) {

		System.out.println("Bank Name: " + bankName);
		System.out.println("Balance: ₹" + balance);
		System.out.println("Welcome Message: "+ welcome);
	}


	public static void main(String[] args) {
		No_Return_With_Argument n = new No_Return_With_Argument();

		n.bankDetails("SBI", 5000, "Welcome to SBI Bank!");

	}

}

/* No Return but With Arguments Method

Definition:A method that accepts input values (arguments) but does not return any value is called a no return but with arguments method.

Use of No Return but With Arguments Method
1️⃣ To avoid hardcoding

Instead of writing fixed values inside method: you can pass different values dynamically.

2️⃣ To make method reusable

Same method can work with different inputs.

Example:

deposit(1000);
deposit(5000);
deposit(10000);

One method handles all values.

3️⃣ To make program flexible and dynamic

User can send different data every time.
**************************************************************************************************
If you want to change the value randomly then there is no need to define it inside the method
you can just change the value from the main method.so reduced hard coding.

*/



