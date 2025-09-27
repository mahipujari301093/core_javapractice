package method;

public class CallStaticMethod_AnotherStaticMethod {
	
	// if two static methods are in the same class, then we can directly call one static method  from another just by using method name. 
	
	public static void firststaticmethod()
	{
		
		System.out.println("first static method executing");
	}
	
	public static void secondstaticmethod()
	{
		
		firststaticmethod();
		
		System.out.println("second static method executing");
		
	}
	
	
	public static void main(String[]args)
	{
		
		
		secondstaticmethod();
		
		
		
	}
	
	

}
