package polymorphism;

public class Method_Overloading_Notes {

    /*

🎯 One Line Interview Answer
👉 If method name is same but parameters are different, it is called method overloading.


✅ What You Built
 I have created printInfo() method - But it behaves in three different ways depending on input.That is exactly polymorphism 💯


✅ First Line – Object Creation
Printer p = new Printer();  //👉 Now it can call all overloaded methods.


✅ Call 1
p.printInfo("Vishal");- Java checks Which method accepts String? so it calls printInfo(String name) method and prints Name: Vishal

✅ Call 2
p.printInfo(30);- Java checks Which method accepts int? so it calls printInfo(int age) method and prints Age: 30

✅ Call 3
p.printInfo("Vishal", 30);- Java checks Which method accepts String and int? so it calls printInfo(String name, int age) method and prints Name: Vishal


✅ Final Output Together
Name: Vishal
Age: 30
Name: Vishal, Age: 30



✅ MAGIC LINE YOU MUST REMEMBER 🧠🔥

👉 Java chooses the method based on parameters, not based on method name.


✅ Why this is Polymorphism
One method name → printInfo but Many behaviors → depending on input.

*********************************************************************************************************

✅ Why is Method Overloading called Compile-Time Polymorphism?
Because Java decides which method to run
👉 while compiling the program, 👉 NOT while running it

✅ Example from your program
p.printInfo("Vishal");
During compilation, Java sees: argument type = String So compiler says:👉 "OK, I will call printInfo(String)."
Decision DONE ✅ before the program runs.


✅ Example from your code

When compiler sees: p.printInfo(30); It immediately fixes: call printInfo(int) Decision finished ✅

✅ Compile Time (Before Program Runs)

✅ Your Understanding (Meaning)

You said:

✔ Compiler checks syntax
✔ finds errors
✔ ensures correctness
✔ decides overloaded method
✔ generates bytecode
✔ gives to JVM
✔ then execution happens

👉 And compile time = before execution

💯 PERFECT.

✅ Ultra Simple Version 🧠
Compile time = before program runs
Run time = while program runs

✅ Timeline View 🔥
Write code
   ↓
Compile time (compiler checks & prepares)
   ↓
Bytecode generated
   ↓
Run time (JVM executes)
   ↓
Output


********************************************************************************
✅ 1) Can we overload the main method? 👉 YES
public static void main(String[] args)  // with String arguments
public static void main(int a)          // with int argument


✅ 2) Can we overload constructors? 👉 YES

// No-argument constructor
    Student()
    {
        System.out.println("Default constructor");
    }

    // Constructor with 1 argument
    Student(String name)
    {
        System.out.println("Name: " + name);
    }

**********************************************************************************

✅ 2) Can we overload access modifiers ? 👉 YES

public static void m1(char c)
private void m1(int a)

👉 Same method name → m1
👉 Different parameter list → char vs int
👉 Different access modifier → public vs private

****************************************************************************************

 ✅ 2) Can we overload static and non-static method ? 👉 YES

   public static void m1(char c)
   public void m1(int a)

👉 Method name → SAME (m1)
👉 Parameters → Different arguments (char vs int)


"In method overloading, we create multiple methods with the same name inside the same class.
 Although the method name is the same, each method behaves differently because the parameters are different.
 Java identifies which method to execute based on the arguments passed while calling the method."

✅ This is exactly the concept of method overloading.

It is also called compile-time polymorphism because the compiler decides which method should execute at compile time.

  */


}
