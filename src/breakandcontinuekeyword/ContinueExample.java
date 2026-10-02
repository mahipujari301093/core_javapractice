package breakandcontinuekeyword;

public class ContinueExample {
	
	
	public static void main(String[]args){


     for(int stop = 1; stop <= 5; stop++)
{
    if(stop == 4)
    {
        continue;
    }

    System.out.println("Bus stopped at Stop " + stop);
}




}
	
}

/*

Output
Bus stopped at Stop 1
Bus stopped at Stop 2
Bus stopped at Stop 3
Bus stopped at Stop 5
What happens at Stop 4?

Stop 1 → Stop
Stop 2 → Stop
Stop 3 → Stop
Stop 4 → SKIP 🚌💨
Stop 5 → Stop

When stop == 4:

condition is true
       ↓
   continue
       ↓
skip Stop 4
       ↓
go to Stop 5



🧠 Real-life meaning

continue = "Skip this stop and continue the journey."


*/



















