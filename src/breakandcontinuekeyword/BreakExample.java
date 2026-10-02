package breakandcontinuekeyword;

public class BreakExample{



public static void main(String[]args){



for (int floor = 1; floor <= 5; floor++){

	
	System.out.println("Checking floor " + floor);

    if(floor == 5)
    {
        System.out.println("Found my floor!");
        break;
    }
	
        

	}



}

}

/*

Elevator example

Imagine you are waiting for an elevator.

You check floors one by one:

Checking floor 1
Checking floor 2
Checking floor 3
Checking floor 4
Checking floor 5
Found my floor!

At floor 5, we use break.

👉 Why?
Because we found what we were looking for, so there is no need to continue checking floors 6, 7, 8, 9, 10.

🧠 Remember

break = "I found it → stop!" 🛑

break is used when a condition is met, and we want to stop the loop immediately. 🛑


*/



	


	
	

	


