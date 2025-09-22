package method;

public class CallStaticMethod_InsideNonStaticMethod {
	
	// To call a static method inside a non-static method, we can call it directly by method name.
	
	public static void StaticMethod()
	{
		
		System.out.println("Execute static method");
		
	}
	
	public void NonStaticMethod()
	{
		
		StaticMethod();
		
		System.out.println("Execute Non static method");
		
		
	}
	
	
	public static void main(String[]args)
	{
		
		
		
		CallStaticMethod_InsideNonStaticMethod nsm = new CallStaticMethod_InsideNonStaticMethod();
		
		nsm.NonStaticMethod();
		
		
					
		
	}
	

}
