package thiskeyword;

public class Thiskeyword {  // this keyword is used in non-static methods, constructors to
							// access instance variables

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

/*    When local variable and instance variable (Global variable) names are same, this keyword is used to avoid ambiguity. 
	  An instance variable is a variable that is declared inside a class but outside any method, constructor, or block
      If local variable and instance (global) variable have the same name,
      then local variable gets priority inside the method/constructor.
      
      To call the instance variable (global variable) inside a non-static method when there is a naming conflict with a local variable, we use the this keyword.
      this cannot be used in static methods, because static methods don’t belong to any particular object.
*/
	 

}
