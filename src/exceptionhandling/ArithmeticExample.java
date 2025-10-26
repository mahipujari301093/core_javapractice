package exceptionhandling;

public class ArithmeticExample {   // Unchecked exception

	
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 0;

//	        int result = a / b;   // ❌ ArithmeticException (divide by zero)
//	        System.out.println("Result: " + result);
	  
	    
//	    Handling the exception
	    
	    
	        try
	        {   
	        	int result = a/b;
	        	System.out.println("Result: " + result);
	        }
	    
	       catch(ArithmeticException e )
	        {
	    	   
	    	   System.out.println("Cannot divide by zero!");
	    	   
	       }
	    
	          System.out.println("Used catch block : Programe continue without crashing");
	    
	    }
	}
