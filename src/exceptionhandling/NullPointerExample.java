package exceptionhandling;

public class NullPointerExample {  // Unchecked exception
	
	
	    public static void main(String[] args) {
	        
	        String name = null;   // name has no memory/object assigned
	        
//	        System.out.println(name.length());  // ❌ NullPointerException here
	    
	    
	   // Handling the Null pointer exception 
	        
	        
	    try
	    {
	    	
	    	System.out.println(name.length());	
	    }
	    
	    catch (NullPointerException e) 
	    
	    {
            System.out.println("Null value! Please initialize the object first.");
        }
	    
	    }  
	}



