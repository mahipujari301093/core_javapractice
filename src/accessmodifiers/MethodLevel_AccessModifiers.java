package accessmodifiers;

public class MethodLevel_AccessModifiers {
	
/*
public:A public method can be accessed from anywhere but class should be public
public void m1();
	 
	 
default:Accessible only within the same package.If you do not specify any access modifier for a method, it is called default access.
Void m1();


private:Accessible only within the same class where it is declared.
private void m1();


protected: 
protected void m1();

🔹 Protected Method Access in Another Package

If a method is protected and the class is in another package, it cannot be accessed using a parent class object directly.

It can only be accessed via inheritance (child class).

Inside the child class, you can call the protected method using:

this.methodName() ✅

Or using a child class reference (childObj.methodName()) ✅

You cannot use a parent class reference to access it outside the package.
	 	 
	 
*/

}
