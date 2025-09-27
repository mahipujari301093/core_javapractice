package thiskeyword;

public class Practice {
	
	int a = 10000;
	int b = 20000;
	
	public void NS()
	{
		
		int a = 30;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
	
	public static void main (String [] args)
	{
		
		
		Practice pr = new Practice();
		
		pr.NS();
	}
	
	
	
			

}
