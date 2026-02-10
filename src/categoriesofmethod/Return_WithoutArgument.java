package categoriesofmethod;

public class Return_WithoutArgument {
	
	// Method with return type but no arguments

	  
	   public int getBalance()
	  
	    {
		   int balance = 5000;
	        return balance;           // returns current balance
	    }
	   
	   
	   
	   public String name()
	   {
		   
		   String bank = "BOM";
		   return bank;
	   }
	

	
	    public static void main(String[] args)

		{
	    	Return_WithoutArgument atm = new Return_WithoutArgument();

	        // Call method and store returned value
	    	
	        int currentBalance = atm.getBalance();
	        String bankname = atm.name();
	        System.out.println("Your current balance is: ₹" + currentBalance);
	        System.out.println(bankname);
	    	
	    }
	}

/* We store the returned value in variables (currentBalance, bankname) so that we can use them later.
✅ Important interview line ⭐

A return method sends result back to the caller so it can be reused further.




*/


