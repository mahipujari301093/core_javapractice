package Variable;

public class NonStatic_Variable {
	
	int a = 10;
	String s = "Coding";
	boolean b = true;
	char c = 'p';
	double d = 50.69;
	
	
	
	public static void main (String []args)
	{
		
		NonStatic_Variable obj = new NonStatic_Variable();
		
		System.out.println(obj.a);
		System.out.println(obj.s);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}
	

}
