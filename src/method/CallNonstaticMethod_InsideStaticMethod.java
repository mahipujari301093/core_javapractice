package method;

public class CallNonstaticMethod_InsideStaticMethod {
	
	// To call Non static method inside static method create an object
	// inside a static method, we must create an object to call a non-static method.
	
	public void NonStaticMethod()
	{
		
		System.out.println("NonStatic Method calling in static method");
		
	}
	
	public static void StaticMethod()
	{
		
		CallNonstaticMethod_InsideStaticMethod nsm = new CallNonstaticMethod_InsideStaticMethod();
		
		nsm.NonStaticMethod();
		
		System.out.println("Static Method executing from static method");
		
	}
	
	
	
	public static void main(String[]args)
	{
		
		StaticMethod();
		
	}

}
