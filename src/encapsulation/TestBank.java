package encapsulation;

public class TestBank {



    public static void main(String[]args)
    {

        BankAccount b = new BankAccount();      // creating an object of BankAccount class
        b.setBalance(50000);                 // depositing money to the account using setter method(👉 Put ₹50000 into the account.)
        System.out.println("Your current balance is : " + b.getBalance());  // showing the balance to the user using getter method


    }


}


/*

✅ One Sentence Understanding (Interview Style)

👉 setBalance() is used to assign value,
👉 getBalance() is used to show the value.

✅ If Getter Was Not There 😱
You could never see the balance.

✅ If Setter Was Not There 😱
You could never change the balance.



✅ 5-Year-Old Kid Version 👶

👉 Setter → said keep money inside account 📥
👉 Getter → said see money from account 📤

✅ Slightly Better Student Version 🎓

👉 Setter method is used to assign or update the value.
👉 Getter method is used to read or retrieve the value.


✅ One More Powerful Visualization 🧠
Before setter → balance = 0
After setter  → balance = 50000
Getter        → returns 50000


👉 Encapsulation is the process of hiding data by making variables private and providing public getter
and setter methods to access them. The user can see or modify the value, but cannot see the internal implementation.


✅ ATM Example (you explained correctly 👍)

User:can check balance , can deposit
But user cannot see how bank database works internally.

Exactly encapsulation.

✅ Important Clarification ⭐

Encapsulation is not only hiding data, it is also:

✔ controlling access
✔ protecting data
✔ providing safe communication

 */