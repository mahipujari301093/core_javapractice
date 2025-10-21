package stringpractice;

public class Equals {
	
	
	public static void main(String[]args)
	{
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "paython";
		String s4 = "java";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s1));
			
	}

}

/*

🧩 What is equals() method?

The equals() method is used to compare the contents (values) of two strings.
It returns true if both strings have the same sequence of characters, otherwise false.






*/