package casting;

public class SBI extends Bank {
    
    

 public void loan()
 {
     System.out.println("Loan method of SBI class");
 }



 public static void main(String[]args)
 {
   
    // Upcasting
 
   Bank b = new SBI();

   b.deposit(); // Output: Deposit method of Bank class
  // b.loan(); this is child class method but parent method reference is not allowed to call child class method

   
   
   // Downcasting

   SBI s = (SBI) b; // Downcasting
   s.loan(); // Output: Loan method of SBI class
   s.deposit(); // Output: Deposit method of Bank class


 }

}


/*

⬆️ Upcasting

Parent reference + Child object

Bank b = new SBI();
Reference = Bank (Parent)
Object = SBI (Child)
We can call only methods available in the parent reference.

💡 Remember:
Reference type decides which methods are accessible.


⬇️ Downcasting

Child reference + Child object

SBI s = (SBI) b;
Reference = SBI (Child)
Object = SBI (Child)
Now we can call both parent and child methods.

Downcasting: Converting a Parent reference to a Child reference using explicit casting.

*********************************************************************************************************************

⬆️ Upcasting in Selenium
WebDriver driver = new ChromeDriver();

Interface reference → Child object -> this is called Upcasting in Selenium. (done automatically by Java)

ChromeDriver implements WebDriver methods.
Example: driver.get(), driver.quit(), driver.findElement()


⬆️ Downcasting in Selenium

TakesScreenshot ts = (TakesScreenshot) driver;  

Convert the driver reference to a TakesScreenshot reference ts using explicit casting, so we can access getScreenshotAs(). method.



driver → WebDriver reference (WebDriver driver = new ChromeDriver();

ts → TakesScreenshot reference

(TakesScreenshot) → Explicit casting

getScreenshotAs() → Screenshot method







*/