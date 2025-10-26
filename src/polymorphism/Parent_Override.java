package polymorphism;

public class Parent_Override {
	
	
	public void ShowMessage()
	{
		
		System.out.println("Message from parent class");
		
	}
	
	
/*	
 💡 Key Points:

✅ Method names and parameters must match exactly.

✅ The @Override annotation (optional) helps catch mistakes.

✅ JVM decides which method to call at runtime — this is runtime polymorphism.


💡 In short:

Overloading = Compile-time polymorphism → Compiler decides which method to call based on parameters.

Overriding = Runtime polymorphism → JVM decides which method to call based on actual object type at runtime. 	
 	
 
*/
	
	
	

}
