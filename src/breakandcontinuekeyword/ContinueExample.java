package breakandcontinuekeyword;

public class ContinueExample {
	
	
	public static void main(String[]args)
	{
		
		for(int i = 1; i<=5; i++)
		{
			
			if(i==3)
			{
				
				continue;  // skip the iteration when i is 3
				
			}
			
			System.out.println("i = " + i);
			
			
			
		}
		
		System.out.println("Loop ended.");
			
	}
	
}


/*

 2️⃣ Continue Keyword

Definition: The continue statement is used to skip the current iteration of a loop and continue with the next iteration.
 

 ✅ Explanation:

When i == 3, continue skips printing and moves to the next iteration.

The loop continues normally after skipping.
 
 
💡 Quick Tip:

break → exits the loop completely

continue → skips current iteration, but loop continues 
 
 
 
 */












