package exceptionhandling;

public class ArrayExample {   // Unchecked (Runtime) Exception.
	
	
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30};
	        
	      
       System.out.println(arr[4]);  // ❌ ArrayIndexOutOfBoundsException
	       
	       
	     // Handling the ArrayIndexOutOfBoundsException
	        
	       
	       try
	       {
	    	   
	    	   System.out.println(arr[4]);
	       }
	       
	       catch(ArrayIndexOutOfBoundsException e)
	       {
	    	   
	    	   System.out.println("\"Array index is out of bounds!\"");
	    	   
	       }
	       
	       System.out.println("Used catch block : Program continue without crashing");
	       
	    }
	    
	    
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


