package collection;

	
	import java.util.LinkedHashSet;

	public class LinkedHashSetExample {
	    public static void main(String[] args) {
	        LinkedHashSet<String> fruits = new LinkedHashSet<>();

	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");
	        fruits.add("Apple"); // duplicate, ignored
	        fruits.add(null);    // Allows one null value.
	        fruits.add(null);
	        System.out.println("Fruits: " + fruits);
	    }
	}


/*
 Key Points about LinkedHashSet:

No duplicate values allowed.

Maintains insertion order (unlike HashSet).

Allows one null value.
 
*/
