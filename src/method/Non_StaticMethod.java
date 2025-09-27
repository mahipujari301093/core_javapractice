package method;

public class Non_StaticMethod {
	
	public void onlinesales()
	{
		
		String cal1 = "Multicover calculator";
		String cal2 = "CI cover calculator";
		String cal3 = "DB cover calculator";
		int age = 20;
		int salary = 10000;
		boolean smoker = true;	
		
		
		System.out.println("Available Calculators: " + cal1 + ", " + cal2 + ", " + cal3);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Smoker: " + smoker);
		
	}
	
	public static void main(String[]args)
	{
		
		Non_StaticMethod  obj = new Non_StaticMethod();
		
		obj.onlinesales();
		
		
		
	}
	
	
	

}
