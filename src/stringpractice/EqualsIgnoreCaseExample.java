package stringpractice;

public class EqualsIgnoreCaseExample {
	
	
	
	
	    public static void main(String[] args) {
	        
	        String name1 = "VISHAL";
	        String name2 = "vishal";
	        
	        // Compare two strings ignoring case
	        if(name1.equalsIgnoreCase(name2)) {
	            System.out.println("Both strings are equal (case ignored).");
	        } else {
	            System.out.println("Strings are not equal.");
	        }
	    }
	}

/*
 
🔍 Explanation:

equalsIgnoreCase() compares two strings, but it ignores uppercase and lowercase differences.

So "VISHAL" and "vishal" are treated as equal. 
 
 
 */

