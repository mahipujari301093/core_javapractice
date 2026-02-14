package encapsulation;

public class BankAccount {

    // private data hidden from outside access

    private int balance;  // balance is private and cannot be accessed directly by outside classes this is called data hiding


    // setter method to modify the balance(👉 This method is used to store or change the balance)
    public void setBalance(int amount)  //int amount → value coming from user
    {
        this.balance = amount;   // assigned the amount value coming from the user to the balance variable

    }

    // getter method used to see the balance or read the balance
    public int getBalance()

    {

         return balance;  // this method will return the value of balance to the caller or show the balance to the user

    }


}
