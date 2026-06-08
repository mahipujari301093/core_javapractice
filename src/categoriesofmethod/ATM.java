package categoriesofmethod;

public class ATM {

    // "No return & No argument" method

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
        ATM a = new ATM();
        a.displayWelcome();
        a.checkBalance();
        
    }



	
/* 🔹 What is a "No return & No argument" method?

  No Return & No Argument Method

Definition:
A method that does not return any value and does not accept any input parameters is called a no return & no argument method.
		
*/
	
}  	
	
	

