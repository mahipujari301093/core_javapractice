package Variable;

public class Default_Values {
	
	int a;
	String s;
	double d;
	boolean b;
	char c;
	
	
	public static void main(String []args)
	{
		
		Default_Values obj = new Default_Values();
		
		System.out.println(obj.a);
		System.out.println(obj.s);
		System.out.println(obj.d);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
	
	
	/*In Java, instance variables get default values automatically if not initialized:
	 
	 When we don't initialize values inside the variables then default values gets stored automatically 


	    int a;        // 0
        String s;     // null
        double d;     // 0.0
        boolean b;    // false
        char c;       // \u0000 (null character) space 
	 
	 */

}
