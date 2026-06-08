package Conditional_Statments;

public class ElseIfExample {

    public static void main(String args[])
    {

        int marks = 75;

        if(marks >= 90)   // Condition became false because 75 is not greater than or equal to 90
        {
            System.out.println("Grade: A");
        }

        else if(marks >= 80)  // Condition became false because 75 is not greater than or equal to 80
        {
            System.out.println("Grade: B");
        }

        else if(marks >= 70) // Condition became true because 75 is greater than or equal to 70
        {
            System.out.println("Grade: C");
        }

        else
        {
            System.out.println("Grade: Fail");
        }


    }

}

/*

Important Interview Point ⭐

In else-if ladder:
Java checks conditions from top to bottom.As soon as one condition becomes true:✅ corresponding block executes

The else-if ladder is used to check multiple conditions one by one.


 */