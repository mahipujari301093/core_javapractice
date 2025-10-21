package stringpractice;

public class StringExample {
	
	
	    public static void main(String[] args) {
	        String name = "Vishal";

	        System.out.println("Length: " + name.length());
	        System.out.println("Uppercase: " + name.toUpperCase());
	        System.out.println("Lowercase: " + name.toLowerCase());
	        System.out.println("Character at 2nd index: " + name.charAt(2));
	        System.out.println("Substring (1,4): " + name.substring(1,4));
	        System.out.println("Contains 'sha': " + name.contains("sha"));
	    }
	}



