package method;

public class Class_D_NonStatic extends Class_C_NonStatic {


	
	public static void main(String[]args)
	{
		
		Class_C_NonStatic obj = new Class_C_NonStatic();
		
		obj.Display();
		
		
		
		Class_D_NonStatic obj1 = new Class_D_NonStatic();     // Class C extends into Class D 
		
		obj1.Display();
		
	}

}



// Called display method from C class into D class by creating object of C class

