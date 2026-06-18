package exceptionhandling;

public class ArithmeticExample {   // Unchecked exception



	    public static void main(String[] args) {

        int a = 10;
		int b = 0;

	//	int result = a/b;  // This will throw ArithmeticException: cannot divide by zero
	//	System.out.println(result);


		// to handle the exception, we can use try-catch block

			try     // define risky code in try block
			{

				int result = a/b;
				System.out.println("Result: " + result);
			}

			catch(ArithmeticException e)   // catch block will handle the exception
			{

				System.out.println("Exception Message: " + e.getMessage());
			}


			System.out.println("Used catch block : Program continue without crashing");




	    }
	}
/*


Why is it called Runtime Exception?

Because the compiler does not check it during compilation.
The code will compile successfully, but when JVM executes it, the exception occurs.

 */