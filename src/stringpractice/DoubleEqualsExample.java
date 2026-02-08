package stringpractice;

	public class DoubleEqualsExample {
		
		
		
		
		
	    public static void main(String[] args) {
	        String s1 = "Java";
	        String s2 = "Java";
	        String s3 = new String("Java");

	        System.out.println(s1 == s2); // true - both point to same string in String Pool
	        System.out.println(s1 == s3); // false - s3 is created as a new object in heap memory
	        System.out.println(s1.equals(s3)); // true - content is same
	    }
	}

/*

 👉 In short:

Use == → to compare memory references

Use equals() → to compare string values


 
🧩 What is == in Java (for Strings)?

The == operator compares references (memory addresses),
not the content of the strings.

So:

It checks whether both references point to the same object in memory.

It does not compare actual text (characters) inside the strings. 
 

So even though s1 and s3 look the same,
they live in different memory locations, so == gives false.

 */


