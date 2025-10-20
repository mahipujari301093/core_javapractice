package exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionWriteExample {
	
	
	    public static void main(String[] args) {
	        try 
	        {
	            // Create a FileWriter to write data to a file
	            FileWriter file = new FileWriter("output.txt");
	            
	            file.write("Hello, this is a test line!\n");
	            file.write("Writing another line to the file.");

	            file.close();  // closing the file
	            System.out.println("Data written to file successfully.");
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("An I/O error occurred while writing to the file: " + e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }
	}



