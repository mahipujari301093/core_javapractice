package abstraction;

public class Notes {



/*

=========================================================
             ABSTRACTION IN JAVA (OOPS CONCEPT)
=========================================================


🧠 Simple One-Line Understanding:

👉 Abstraction means hiding complex internal implementation
   and showing only the essential features to the user.

👉 User knows WHAT to do, but does not know HOW it is done.

Example:
🚗 Car Driving

User knows:
    ✅ Start car
    ✅ Press accelerator
    ✅ Apply brake

User does not know:
    ❌ How engine works
    ❌ How fuel injection happens
    ❌ How internal mechanical parts work


This is called Abstraction.


=========================================================
          WHY DO WE NEED ABSTRACTION?
=========================================================


Without abstraction:

User needs to understand all internal logic before using
any functionality.


With abstraction:

User only uses required functionality.

Example:

ATM:

Customer:
    ✅ Withdraw money
    ✅ Check balance

Customer does not know:
    ❌ How bank server works
    ❌ How transaction processing happens


=========================================================
          HOW TO ACHIEVE ABSTRACTION IN JAVA?
=========================================================


Java provides two ways to achieve abstraction:

1️⃣ Abstract Class

2️⃣ Interface



=========================================================
              1️⃣ ABSTRACT CLASS
=========================================================


📌 Definition:

👉 A class declared with the keyword "abstract" is called
   an abstract class.

👉 An abstract class can contain:

    ✅ Abstract methods (method without body)
    ✅ Concrete methods (method with body)


Syntax:

abstract class ClassName
{

    abstract void methodName();


    public void normalMethod()
    {

    }

}



=========================================================
             ABSTRACT CLASS EXAMPLE
=========================================================


Parent Class:

*/


    abstract class Animal {


        // Abstract method
        // No implementation
        abstract void sound();



        // Concrete method
        // Has implementation
        public void sleep()
        {
            System.out.println("Animal is sleeping");
        }

    }



/*

Child Class:

*/


    class Dog extends Animal {


        // Providing implementation
        // of abstract method

        public void sound()
        {
            System.out.println("Dog barks");
        }

    }



/*

Main Class:

*/


    public class Test {


        public static void main(String[] args)
        {


        //    Dog obj = new Dog();


         //   obj.sound();

          //  obj.sleep();


        }

    }



/*

Output:

Dog barks
Animal is sleeping



=========================================================
             HOW ABSTRACTION WORKS HERE?
=========================================================


Animal Class:

        abstract void sound();

        👆
        Only declaration
        (WHAT to do)


Dog Class:

        public void sound()
        {
            System.out.println("Dog barks");
        }


        👆
        Actual implementation
        (HOW to do)



Flow:

Animal
  |
  |
  |  sound()
  |
  |
Dog
  |
  |
  |  Dog barks implementation



👉 Animal hides the implementation.

👉 Dog provides the actual logic.

👉 User only calls sound().

👉 User does not know internal implementation.


This is Abstraction.



=========================================================
              2️⃣ INTERFACE
=========================================================


📌 Definition:

👉 Interface is another way to achieve abstraction.

👉 Interface defines what a class should do.

👉 Implementing class decides how to do it.



=========================================================
              INTERFACE EXAMPLE
=========================================================



Interface:

*/


    interface Vehicle {


        // Abstract method
        void start();

    }



/*

Implementation Class:

*/


    class Car implements Vehicle {


        public void start()
        {
            System.out.println("Car starts with key");
        }

    }



/*

Main Class:

*/


    class TestVehicle {


        public static void main(String[] args)
        {


         //   Car c = new Car();


          //  c.start();


        }

    }



/*

Output:

Car starts with key



=========================================================
              HOW INTERFACE WORKS?
=========================================================


Interface:

        void start();


        👆
        WHAT to do


Car Class:

        public void start()
        {
            System.out.println("Car starts with key");
        }


        👆
        HOW to do



👉 Interface only provides the requirement.

👉 Class provides the implementation.

👉 This is abstraction.



=========================================================
          ABSTRACT CLASS VS INTERFACE
=========================================================


| Abstract Class | Interface |
|----------------|-----------|
| Achieved using abstract keyword | Achieved using interface keyword |
| Can have abstract methods | Mainly contains abstract methods |
| Can have normal methods | Can have default/static methods |
| Uses extends keyword | Uses implements keyword |
| Supports partial abstraction | Supports complete abstraction |



=========================================================
              ENCAPSULATION VS ABSTRACTION
=========================================================


Encapsulation:

👉 Hides data.

Example:

private balance;


Purpose:

✅ Data security
✅ Data protection



Abstraction:

👉 Hides implementation.

Example:

withdrawMoney();


Purpose:

✅ Hide complexity
✅ Show only required functionality



=========================================================
              EASY WAY TO REMEMBER
=========================================================


🔒 Encapsulation:

"Hide the data"

Example:

Bank balance is private.


---------------------------------------------------------


🎭 Abstraction:

"Hide the implementation"

Example:

ATM user withdraws money without knowing
internal banking process.



=========================================================
              INTERVIEW DEFINITION
=========================================================


👉 Abstraction is an OOP concept that hides the internal
implementation details and shows only essential features
to the user.

👉 In Java, abstraction is achieved using abstract classes
and interfaces.



=========================================================

Abstraction
     |
     |
     +---- Abstract Class
     |          |
     |          +-- Abstract method (no body)
     |          +-- Concrete method (with body)
     |
     |
     +---- Interface
                |
                +-- Defines WHAT to do
                +-- Class defines HOW to do


 One important connection with your previous topics:

Encapsulation → How to protect data? // declare variables as private and provide public getter/setter methods
Abstraction → How to hide complexity? // declare abstract methods in abstract class or interface and provide implementation in subclass
Inheritance → How to reuse code? // create a parent class and extend it in child class
Polymorphism → How to achieve multiple behaviors? // method overloading (compile-time polymorphism) and method overriding (run-time polymorphism)

*/

}

