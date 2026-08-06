package exceptionhandling;

public class Notes {
	
/*
 
Checked Exceptions

Definition

Exceptions that are checked by the compiler before the program runs.

If not handled, the program will not compile.

Common Examples

Exception	            When does it occur?
IOException	            Reading/Writing a file fails
FileNotFoundException	File does not exist
SQLException	        Database operation fails


Memory Trick
Compiler says...

"Handle me first,
then I'll allow your program to run."	


Checked Exception

        |
   Two Ways
        |
   ----------------
   |              |
try-catch      throws
   |              |
Handle Now    Handle Later

try-catch is mostly used because it handles the exception immediately and allows the program to continue executing gracefully.
 
*************************************************************************************


Unchecked Exceptions

Definition

Exceptions that occur while the program is running (Runtime).

Compiler does not check these exceptions.

Usually caused by coding mistakes.

Common Examples
Exception	                    When does it occur?
ArithmeticException	            Divide by zero (10/0)
NullPointerException	        Calling a method on a null object
ArrayIndexOutOfBoundsException	Accessing an invalid array index

Memory Trick
Compiler says...

"I trust your code.
If something goes wrong,
it will fail at Runtime."


***********************************************************************************

🔒 Checked Exception (Must Handle)
✅ Must be handled using try-catch or throws.
❌ If you don't handle it, the compiler gives a compilation error and the program won't compile.


🛠️ Unchecked Exception (Optional to Handle)
✅ Not mandatory to handle.
✅ The compiler doesn't force you to use try-catch or throws.
🐞 These exceptions usually indicate bugs or programming mistakes, so the programmer should fix the code rather than just catch the exception.
 */
	
	

}
