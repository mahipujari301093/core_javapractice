package method;

public class Class_D_NonStatic extends Class_C_NonStatic {


	
	public static void main(String[]args)
	{


		Class_D_NonStatic obj1 = new Class_D_NonStatic();     // Class C extends into Class D 
		
		obj1.Display();
		
	}

}



/*
Explanation:
Display() is a non-static method of parent class (Class C).
Since Class D extends Class C, the method is inherited and can be called using the child class object without creating a parent class object.
 */

