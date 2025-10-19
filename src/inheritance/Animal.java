package inheritance;

public class Animal {

	public void eat() 
	
	{

		System.out.println("Animals can eat-> From parent class");

	}

}


/* ✅ Key Points

   The extends keyword is used for inheritance.

   The child class can reuse code from the parent class.
   
   🔹 Definition

   Single Level Inheritance means that one class (child/subclass) inherits the properties and methods of another class (parent/superclass).

   👉 In simple words:
   One parent → One child.
   
   🧠 So in short:

   ✅ Yes — the child can access both parent and grandparent properties
   because inheritance passes everything down the chain.

*/