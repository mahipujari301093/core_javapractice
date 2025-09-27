package categoriesofmethod;

public class Return_Arguments {
	
	
	
	public int b1(int amount)
	{
			
		return amount;
			
	}
	
	
	
	public String B2(String bankname)
	{
		
		return bankname;	
	}
	
	
	
	public static void main(String[]args)
	{
		
		Return_Arguments obj = new Return_Arguments();
		
		int balance = obj.b1(11000);
		String name = obj.B2("SBI");
		
		System.out.println(balance);
		System.out.println(name);
		
		
		
	}
	
	
	
	
	

}
