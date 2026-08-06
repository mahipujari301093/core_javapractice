package polymorphism;

public class Method_OverRiding_Notes {


 /*

 ✅ Why Runtime Polymorphism?
 You said: JVM will decide which method needs to be called 💯 PERFECT.

Add this line: 👉 Decision happens while program is running, based on the object.
if we create child object then child class method will be called, if we create parent object then parent class method will be called.

✅ Scenario
Parent says: show → Parent Property: Land, House, Cash
Child says: show → Child Property: Bike, Mobile, Laptop

👉 Same method name
👉 Same parameters
👉 But child changed the message (method body)

✔ That is method overriding.

✅ What will JVM run?
If object is Child → 👉 JVM runs Child version.
If object is Parent → 👉 JVM runs Parent version.


👶 Super Easy Story Version
Father: 🧔 “I will show property → Land, House, Cash.”
Son:🧑 “No dad 🙂 I will show → Bike, Mobile, Laptop.”
JVM: 👍 “OK son, you are the object. You go ahead.”

*******************************************************************************

1) Main Method
public static void main(String[] args) - its a static method so Static methods are not overridden, they are hidden.

2) Constructor
Constructors are not inherited.Overriding works only on inherited methods. ❌ Constructor overriding is NOT possible.

3) Static Method
Static methods belong to the class, not object.


| Condition   | Parent Method  | Child Method | Result   |
| ----------- | -------------- | ------------ | -------- |
| Method name | property()     | property()   | ✅ Same   |
| Arguments   | No arguments   | No arguments | ✅ Same   |
| Return type | void           | void         | ✅ Same   |
| Inheritance | Parent → Child | ✅            | Required |



❓ Where did you use Method Overriding in your Framework?

🎯 Easy Definition

Where is Method Overriding?

Method overriding means a child class provides its own implementation of a parent method using the same method name and the same parameters.

🎯 Interview Point

✅ WebDriver → Parent Interface

✅ ChromeDriver → Child Class

✅ ChromeDriver implements (provides implementation for) the methods declared in WebDriver.

✅ At runtime, Java calls the ChromeDriver implementation.



WebDriver (Interface)
        │
        │ Declares methods
        ▼
get()
findElement()
quit()

        │
        │ Implemented by
        ▼
ChromeDriver (Class)

get()         ✅
findElement() ✅
quit()        ✅


ChromeDriver implements the WebDriver interface and provides the implementation of its methods (get(), findElement(), quit(), etc.). 
Even though the reference is WebDriver, Java executes the ChromeDriver implementation at runtime.









  */


}
