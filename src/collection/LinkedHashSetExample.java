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



			System.out.println(fruits.contains("Banana"));

			System.out.println(fruits.size());

			fruits.remove(null);
			System.out.println(fruits);

			fruits.clear();
			System.out.println(fruits);









	    }
	}


/*
 Key Points about LinkedHashSet:

No duplicate values allowed.

Maintains insertion order.

Allows one null value.
 
*/
