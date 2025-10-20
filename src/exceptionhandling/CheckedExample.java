package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExample {
	
	
	
	    public static void main(String[] args) {
	        try 
	        {
	            FileReader file = new FileReader("test.txt"); // File may not exist
	            System.out.println("File opened successfully!");
	        } 
	        catch (FileNotFoundException e) 
	        {
	            System.out.println("File not found! Please check the file path.");
	        }
	        
	        System.out.println("Program continues...");
	    }
	}


/*
 
⚙️ Explanation:

FileReader tries to open "test.txt".

If the file doesn’t exist, Java throws FileNotFoundException.

Compiler forces you to handle it (because it’s a checked exception).

The catch block handles the error, and the program continues. 
 
 */


