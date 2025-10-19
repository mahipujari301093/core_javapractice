package inheritance;

public class C_MultipleInheritance extends A_MultipleInheritance
{

	public static void main(String[]args)
	{
		
		C_MultipleInheritance c = new C_MultipleInheritance();
		
		c.show();
		
	}

}


/*  Note: If we try to extends B_MultipleInheritance class then its don't allowed to inheritance more than one class
 
 * But the problem is that Java does not allow multiple inheritance using classes, which is why the following line in your code causes a compilation error:
  A class can extend only one class (single inheritance).
  
  But a class can implement multiple interfaces (multiple inheritance through interfaces).
  
  package inheritance;

   // First interface
    interface A_MultipleInheritance {
    void show();
    }

    // Second interface
    interface B_MultipleInheritance {
    void display();
    }

   // Child class implementing both interfaces
   public class C_MultipleInheritance implements A_MultipleInheritance, B_MultipleInheritance {

    // Implement methods from both interfaces
    public void show() {
        System.out.println("Show method from Interface A");
    }

    public void display() {
        System.out.println("Display method from Interface B");
    }

    public static void main(String[] args) {
        C_MultipleInheritance c = new C_MultipleInheritance();
        c.show();     // from A_MultipleInheritance
        c.display();  // from B_MultipleInheritance
    }
}

  
  
  🧠 Explanation

    A_MultipleInheritance and B_MultipleInheritance are interfaces.

    C_MultipleInheritance implements both interfaces — this is multiple inheritance in Java.

    The child class must provide implementation for all methods declared in the interfaces.

    No ambiguity occurs because Java enforces explicit method definitions in the child.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
*/ 