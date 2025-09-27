package method;

public class Static_Method {

	public static void Add() {

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public static void Sub()

	{

		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println(c);

	}

	public static void Mul() {

		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}

	public static void main(String[] args) {    

		// Static method can called by classname.method name or direct method name
		
		Static_Method.Add();                         
		Static_Method.Sub();
		Static_Method.Mul();
		
		// static method call by directly method name 
		
		// Add();   
		// Sub();  
		// Mul(); 
		

	}

}
