package inheritance;

public class C_hild extends P_arent {
	
	public void car()
	{
		
		System.out.println("BMW from child");
	}
	
	
	public static void main(String[]args)
	{
		
		C_hild c = new C_hild();
		c.farm();  // grandparent property
		c.house(); // parent property
		c.car();   // child property 
		
	}

}
