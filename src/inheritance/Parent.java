package inheritance;

//Single level inheritance example

public class Parent {


    public void home()
    {
        System.out.println("3 BHK House in Bangalore");

    }

    public void amount()
    {
        System.out.println("50 Lakhs in Bank");
    }



}

/*

✅ Correct Statement

Inheritance is an OOP concept that allows a child class to inherit and reuse the properties and methods of a parent class using the extends keyword.

Easy to remember:
Parent Class → Has common properties and methods.
Child Class → Reuses them using extends keyword.
Access → Create the child class object, and it can use both its own and the inherited members.



❓ Where did you use Inheritance in your Selenium Framework?

In my Selenium framework, all the test classes extend the BaseTest class. The BaseTest class contains
common code like browser initialization, opening the application URL, and closing the browser. By
using inheritance, every test class can reuse this common code instead of writing it repeatedly.


 */
