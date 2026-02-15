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

























  */
























}
