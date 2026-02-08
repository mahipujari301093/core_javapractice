package breakandcontinuekeyword;

public class BreakExample {
	
	
	public static void main(String[]args)
	{
		
		for(int i = 1; i<=10; i++)
		{

			if(i==5)
			{
				System.out.println("Number found. Stopping loop.");
				break;   // This prints numbers from 1 to 4. When i becomes 5, the loop stops.

			}

			System.out.println("i = " + i);  // This will print numbers from 1 to 4, then exit when i is 5


		}

		  System.out.println("Execution continues after the loop terminates because break only exits the loop, not the entire program.");
		
	}
	
/*
 
✅ Fully Corrected Notes Version (Best for interview)

1️⃣ Break Keyword

Definition: The break statement is used to exit a loop immediately, even if the loop condition is still true.

✅ Explanation:
When i == 5, break executes and the loop terminates.
The loop will not continue to the remaining iterations. but break only stops the loop or switch, not the entire program.

💡 Quick Tip:
break → exits the loop only not the entire program.
 */
	

}
