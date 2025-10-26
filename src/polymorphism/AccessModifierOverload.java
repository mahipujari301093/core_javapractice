package polymorphism;

public class AccessModifierOverload {

	// public method
	public void show(String name) {
		System.out.println("Public show() called - Name: " + name);
	}

	// private overloaded method (different parameter type)
	private void show(int age) {
		System.out.println("Private show() called - Age: " + age);
	}

	// protected overloaded method (different number of parameters)
	protected void show(String name, int age) {
		System.out.println("Protected show() called - Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		AccessModifierOverload obj = new AccessModifierOverload();

		obj.show("Vishal"); // Calls public show()
		obj.show(32); // Calls private show()
		obj.show("Vishal", 32); // Calls protected show()
	}
}


/* 

✅ Answer: YES — methods can be overloaded even if they have different access modifiers.

Access modifiers (public, private, protected, default) do not prevent method overloading.
Because method overloading depends only on:

Method name (must be same)

Parameter list (must be different — number or type)



*/