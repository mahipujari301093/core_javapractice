package Variable;

public class Local_Variable {
	
	
	
	public void m1()
	{
		
		String calculator = "Multicover calculator";
		int age = 30;
		int salary = 50000;
		String smoker = "No";
		
		System.out.println(calculator);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(smoker);
	}
	
	public static void main(String []args)
	{
		
		Local_Variable obj = new Local_Variable();
		obj.m1();
		
		
	}

}
