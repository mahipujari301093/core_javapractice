package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsWithoutCatch {
	
	 // This method declares that it may throw FileNotFoundException
	
		public static void readFile() throws FileNotFoundException
		{
			FileReader file = new FileReader("example.txt");  // may throw exception
			
			System.out.println("File opened successfully!");
		}
	
	    public static void main(String[]args) throws FileNotFoundException
	    {
	    	
	    	System.out.println("Calling readFile() without try-catch...");
	    	
	    	readFile();  // exception not handled here
	        System.out.println("Program continues...");
	    	
	    	
	    }
	
	
	
	
	
	

}
