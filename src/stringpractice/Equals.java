package stringpractice;

public class Equals {
	
	
	public static void main(String[]args)
	{
		
		String actualuserName = "abc123";
		String enteruserName = "abc123";

		if(actualuserName.equals(enteruserName))
		{
			System.out.println("Login successful");
		}

		else
		{
			System.out.println("Login failed");
		}
			
	}

}

/*

🧩 What is equals() method?

The equals() method is used to compare the contents (values) of two strings.
It returns true if both strings have the same sequence of characters, otherwise false.


*/