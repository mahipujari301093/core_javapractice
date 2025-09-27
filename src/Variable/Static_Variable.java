package Variable;

public class Static_Variable {
	
	
	static int a = 10;
	static String s = "School";
	static Boolean b = true;
	static char c = 'K';
	static double d = 20.64;
	
	
	public static void main(String []args)
	{
		
	   // Accessing using variable name
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// Access using class name.variable name (best practice)
		
//        System.out.println(Static_Variable.a);
//        System.out.println(Static_Variable.s);
//        System.out.println(Static_Variable.b);
//        System.out.println(Static_Variable.c);
//        System.out.println(Static_Variable.d);
		
	}

}
