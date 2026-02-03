package superkeyword;

public class Child extends Parent {

    int a = 20;


    // Child Class constructor
    public Child()
    {
        super(); // calling parent class constructor

        System.out.println("Child class constructor");
    }


    // Non-static method
    public void m2()
    {
      System.out.println(a); // prints child class variable 'a' (20)
      System.out.println(super.a); // prints parent class variable 'a' (10)

        super.m1(); // calling parent class method
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m2();
    }


/*

Why do we use super?
When Child and parent have same variable names
We need to call parent constructor and method

👉 It removes ambiguity between parent and child members.


Where is super used?

super is used inside a child class and only in a non-static context.

How is super used? (3 main uses)
1️⃣ Access parent class variable
super.a;
Used when child has the same variable name.


2️⃣ Call parent class method
super.m1();
Used when child overrides parent method but wants parent behavior.

3️⃣ Call parent class constructor
super();
Used inside child constructor (must be first line).


 */

}
