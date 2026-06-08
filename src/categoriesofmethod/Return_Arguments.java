package categoriesofmethod;

public class Return_Arguments {
	
	
	
	public int b1(int amount)  //takes input of amount and return the same value
	{
			
		return amount;
			
	}
	

	public static void main(String[]args)
	{
		
		Return_Arguments r = new Return_Arguments();
		
		int balance = r.b1(11000000);
		System.out.println(balance);

		
		
		
	}
	
	/*

	✅ Interview Definition ⭐

A method with return type and arguments receives data, processes it, and sends result back to the caller.


	 */

}
