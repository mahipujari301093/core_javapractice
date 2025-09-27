package method;

public class CallNonStaticMethod_InsideNonStaticMethod {
	
	//if there are two non static method inside same class then to call one non static method to another non static method no need to create an object
	// we can directly call by method name
	
	public void m1()
	{
		
		System.out.println("Non static method from m1 method");
	}
	
	public void m2()
	{
		
		m1();
		System.out.println("Non static method from m2 method");
	}
	
	
	
	public static void main(String[]args)
	{
		
		CallNonStaticMethod_InsideNonStaticMethod nsw = new CallNonStaticMethod_InsideNonStaticMethod();
		nsw.m2();
		
	}

}
