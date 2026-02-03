package Variable;

public class StaticVariable_NonStaticVariable {
	
	// combined static variables and non-static variables properly in one program.
	
	int a = 1000;
	String s = "Java";
	static int d = 50;
	static boolean b = true;
	
	
	public static void main(String[]args)
	{
		
		System.out.println(StaticVariable_NonStaticVariable.b);
		System.out.println(StaticVariable_NonStaticVariable.d);
		
		StaticVariable_NonStaticVariable obj = new StaticVariable_NonStaticVariable();
		
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		
	}

}
