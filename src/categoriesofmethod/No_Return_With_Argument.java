package categoriesofmethod;

public class No_Return_With_Argument {
	
	
	// ✅ No return, WITH arguments
	
	    public void deposit(int amount ,String bankName,String bankLocation)
	    
	    {
	        System.out.println(bankName);
	        System.out.println(bankLocation);
	        System.out.println("You have successfully deposited ₹" + amount);
	       
	    }

	    public void TotalBalance(int balance ,String welcome)
	    {
	    	System.out.println("Your total balance is " + balance);
	    	System.out.println(welcome);
	    }
	    
	    public static void main(String[] args) 
	    
	    
	    {
	    	No_Return_With_Argument atm = new No_Return_With_Argument();
	    	
	    	atm.deposit(3000, "SBI","Pune");
	    	atm.TotalBalance(10000, "Thanks for visiting SBI bank");

	        
	    }
	}

/*     Why pass arguments?

      So the method can perform an action based on different inputs.
      So you don’t have to hard-code values inside the method.
      It allows re-usability — the same method can handle different types of data.
      Arguments make methods flexible, reusable, and dynamic.
      
      If you want to change the value randomly then there is no need to define it inside the method
      you can just change the value from the main method.so reduced hard coding.

*/



