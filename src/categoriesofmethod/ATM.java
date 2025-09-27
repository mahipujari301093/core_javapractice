package categoriesofmethod;

public class ATM {           // "No return & No argument" method

       
   public void checkBalance() 
    {
    	
    	int balance = 5000;
        System.out.println("Your current balance is: ₹" + balance);
    }

    
    public void displayWelcome() 
    {
    	
        System.out.println("Welcome to SBI Bank ATM");
    }


   
    public static void main(String[] args) 
    
    {
        ATM atm = new ATM();
        atm.displayWelcome();
        atm.checkBalance();
        
    }



	
/* 🔹 What is a "No return & No argument" method?

    No return type → the method uses void (it doesn’t return any value).

    No arguments → the method doesn’t take any input parameters inside parentheses ().

    👉 These methods usually perform an action but don’t send anything back.

    📌 Real-time Example: ATM Simulation

    Imagine an ATM machine → when you insert your card and just want to check balance.

    You don’t need to give any arguments.

    You don’t expect the method to return anything — it just displays balance.
		
*/
	
}  	
	
	

