package breakandcontinuekeyword;

public class ContinueExample {
	
	
	public static void main(String[]args)
	{
		
		for(int i = 1; i<=5; i++)
		{
			
			if(i==3)
			{
				
				continue;  // Skip the current iteration when i becomes 3 but the loop continues to the next iteration.
				           //  So it will print 1, 2, skip 3, and then print 4 and 5.
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
 

🔥 Important Understanding (Golden Point)

With break → loop ends
With continue → loop jumps to next round

continue = skip but stay inside loop
break = come outside loop

Real-Life Example

Suppose you are checking attendance:

If one student is absent → skip that student and continue checking others.

That behavior is like continue.

 */












