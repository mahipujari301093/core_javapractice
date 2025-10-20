package breakandcontinuekeyword;

public class BreakExample {
	
	
	public static void main(String[]args)
	{
		
		for(int i = 1; i<=5;i++)
		{
			
			if(i==3)
			{
				break;   // exit the loop when i is 3
				
			}
			
			System.out.println("i = "+ i);
			
		}
		
		
		System.out.println("Loop ended.");
		
		
		
	}
	
/*
 
1️⃣ Break Keyword

Definition: The break statement is used to exit a loop immediately, even if the loop condition is still true. 	
 	
 	
✅ Explanation:

When i == 3, break exits the loop immediately.

The loop does not continue to 4 or 5. 	
 	

💡 Quick Tip:

break → exits the loop completely

continue → skips current iteration, but loop continues 	
 	
 	
 */
	
	
	
	
	
	

}
