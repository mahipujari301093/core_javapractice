package exceptionhandling;

public class Notes {
	
/*
 
 💡 Simple Way to Remember

🧠 Checked Exception → External Problem (it occurs At compile time)
Compiler forces you to handle it using try-catch or throws keyword

Something outside your code fails — file missing, server down, network issue.
Java says: “You must handle this!”


🧠 Unchecked Exception → Developer Mistake (it occurs At runtime) Compiler does not check
Mostly programming mistakes (logic or code errors)

Something inside your code is wrong — divide by zero, null object, wrong index.
Java says: “It’s your fault, I won’t check it.”


Checked Exception : IOException, SQLException, FileNotFoundException

Unchecked Exception : ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
 	
 
✅ Quick Trick to Identify:

Ask yourself:

“Can the compiler predict this error before running?”

Yes? → Checked Exception

No? → Unchecked Exception

 	
⚙️ Exception Type in Your Code:

ArithmeticException is a runtime exception, which means it belongs to the unchecked exception category.

try block:
Used to write the risky code that might cause an exception.

catch block:
Used to handle the exception that occurs in the try block.

finally block:
Used to write code that always executes, whether an exception occurs or not. 	
 	
 	
⚙️ Quick Tip:

Use throws when you don’t want to handle the exception in the method itself.

Use try-catch when you want to handle the exception immediately.	
 	
 	
*************************************************************

💡 Best Practice Guidelines

Use try-catch when:

You know how to handle the exception locally.

You want the program to recover and continue.

Example: Reading a file and providing a default value if it’s missing.


Use throws when:

The method cannot handle the exception properly.

You want to inform the caller that they must handle it.

Example: A library method that reads a file — you let the user of the library handle exceptions.

🧠 Rule of Thumb

If you can handle it → use try-catch.

If you cannot handle it → use throws.	
 	

 */
	
	

}
