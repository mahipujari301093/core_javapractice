package exceptionhandling;

public class ThrowWithoutCatch {
	
	    public static void main(String[] args) {
	        System.out.println("About to throw an exception...");

	        // Directly throw an exception
	        throw new ArithmeticException("This is a manually thrown exception!");

//	         Any code here will NOT execute
//	         System.out.println("This line will not run.");
	    }
	}

	


