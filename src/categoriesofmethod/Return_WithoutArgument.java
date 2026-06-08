package categoriesofmethod;

public class Return_WithoutArgument {
	
	// Method with return type but no arguments

	  
	   public int getBalance()
	  
	    {
		   int balance = 5000;
	        return balance;           // returns current balance
	    }
	   

	    public static void main(String[] args)

		{
	    	Return_WithoutArgument atm = new Return_WithoutArgument();

	        // Call method and store returned value
	    	
	        int currentBalance = atm.getBalance();
			System.out.println(currentBalance);

	    }
	}

/*

✅ Important interview line ⭐

A return method sends the result back to the caller so the returned value can be reused later in the program.
A method that returns a value to the caller but does not take any input parameters is called a return type & no argument method.




*/


