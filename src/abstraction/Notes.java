package abstraction;

public class Notes {


/*

Abstraction in Java (OOPS Concept)
🧠 Simple One-Line Understanding
Abstraction means:Hiding complex internal logic and showing only necessary features to the user, End user doesn’t see the actual implementation

Abstraction is achieved by using abstract class and interface.
1️⃣ Abstract Class

 abstract class Animal
 {

abstract void sound();   // abstract method (no body)

 public void sleep()   // normal method
 {

 System.out.println("Animal is sleeping");

 }

*************************************************************
class Dog extends Animal {

    void sound()
    {
        System.out.println("Dog barks"); // Dog barks is the new implementation
    }
}

public class Test {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}

👉 Here:
👉 Animal hides how sound() works.
👉 Dog provides the implementation.
👉 User only calls sound(). // User doesn’t see the internal logic of sound()
👉 This is abstraction.
**************************************************************
2️⃣ Interface
interface Vehicle
{
    void start();   // by default abstract
}

class Car implements Vehicle {
    public void start()
    {
        System.out.println("Car starts with key");
    }
}

👉 Interface defines WHAT to do.
👉 Class defines HOW to do.
👉 That is abstraction.

***************************************************************

🔹 2️⃣ Car Driving Example 🚗

When you drive a car:
What you use:
Steering
Accelerator
Brake
Gear

What you don’t see:

Engine combustion process

Fuel injection system

Internal mechanical operations

You just press accelerator → Car moves.

You don’t need to understand engine design to drive.

👉 That is abstraction.

 */
























}
