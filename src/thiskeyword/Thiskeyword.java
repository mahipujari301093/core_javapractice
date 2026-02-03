package thiskeyword;

public class Thiskeyword {  // this keyword is used in non-static methods, constructors to
							// access instance variables ( 👉 Instance = Object)

	int i = 10;             // global or instance variable
	int k = 50;             // global or instance variable

	public void m1() 
	{
		int i = 20;         // local variable
					        // local variable
		int k = 100;

		System.out.println(i);
		System.out.println(k);

		System.out.println(this.i); 
									
		System.out.println(this.k);
	}

	public static void main(String[] args) 
	
	{ 
		
		Thiskeyword nsw = new Thiskeyword();

		nsw.m1();

	}

/*
When local and instance(Global) variables have the same name, Java gives priority to the local variable.
To access the instance (global) variable inside a non-static method, we use the this keyword.

👉 Instance = Object

*/
	 

}
