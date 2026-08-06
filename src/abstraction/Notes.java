package abstraction;

public class Notes {



/*

=========================================================
             ABSTRACTION IN JAVA (OOPS CONCEPT)
=========================================================

The developer writes the code to develop the application, but the end user only uses the functionality.
The user doesn't know the internal code or logic. This hiding of implementation is called Abstraction.



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

***********************************************************************************

❓ Where did you use Abstraction in Selenium?

Abstraction in Selenium

driver.get()
driver.findElement()
driver.quit()

✔ We simply use these methods.
✔ We can see the behavior.
   - Browser opens
   - Element is located
   - Browser closes

❌ We don't know the internal logic.
   - How the browser opens
   - How Selenium locates the element
   - How the browser closes

👉 The implementation is hidden from the user.

This is called Abstraction.

********************************************************************************

❓ How do you achieve Abstraction in Java?

1️⃣ Using an Abstract Class

✅ Declare abstract methods in the abstract class.
✅ The child class extends the abstract class and provides the implementation.

abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

********************************************************************************************

2️⃣ Using an Interface

✅ Declare methods in the interface.
✅ The implementing class provides the implementation.


interface WebDriver 
{

    void get(String url);
}




class ChromeDriver implements WebDriver
 {

    @Override
    public void get(String url)
     {
        // Actual code Implementation
    }
}


Encapsulation → How to protect data? // declare variables as private and provide public getter/setter methods
Abstraction → How to hide complexity? // declare abstract methods in abstract class or interface and provide implementation in subclass
Inheritance → How to reuse code? // create a parent class and extend it in child class
Polymorphism → How to achieve multiple behaviors? // method overloading (compile-time polymorphism) and method overriding (run-time polymorphism)

*/

}

