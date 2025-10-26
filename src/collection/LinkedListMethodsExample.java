package collection;

	
	import java.util.LinkedList;

	public class LinkedListMethodsExample {
	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> names = new LinkedList<String>();

	        // add() - Add elements
	        names.add("Vishal");
	        names.add("Radhika");
	        names.add("Neha");
	        System.out.println("After add(): " + names);

	        // addFirst() - Add element at beginning
	        names.addFirst("Amit");
	        System.out.println("After addFirst(): " + names);

	        // addLast() - Add element at end
	        names.addLast("Sagar");
	        System.out.println("After addLast(): " + names);

	        // get() - Get element by index
	        System.out.println("Element at index 2: " + names.get(2));

	        // getFirst() and getLast()
	        System.out.println("First Element: " + names.getFirst());
	        System.out.println("Last Element: " + names.getLast());

	        // set() - Replace element
	        names.set(2, "Ravi");
	        System.out.println("After set(): " + names);

	        // contains() - Check if element exists
	        System.out.println("Contains Neha? " + names.contains("Neha"));

	        // remove() - Remove by value
	        names.remove("Ravi");
	        System.out.println("After remove(): " + names);

	        // removeFirst() and removeLast()
	        names.removeFirst();
	        names.removeLast();
	        System.out.println("After removeFirst() & removeLast(): " + names);

	        // size() - Number of elements
	        System.out.println("Size: " + names.size());

	        // isEmpty() - Check if empty
	        System.out.println("Is list empty? " + names.isEmpty());

	        // clear() - Remove all elements
	        names.clear();
	        System.out.println("After clear(): " + names);
	    }
	}

/*

 💡 Summary of Methods Used:
Method	Description
add()	Add elements
addFirst() / addLast()	Add at start or end
get() / getFirst() / getLast()	Access elements
set()	Update element
contains()	Check if element exists
remove() / removeFirst() / removeLast()	Remove elements
size()	Get number of elements
isEmpty()	Check if list is empty
clear()


Null and duplicate values allowed 
 LinkedList<String> names = new LinkedList<>();

        names.add("Ravi");
        names.add(null);       // null allowed
        names.add("Neha");
        names.add(null);       // another null allowed
        
        

LinkedList<String> names = new LinkedList<>();

        names.add("Vishal");
        names.add("Neha");
        names.add("Vishal");  // duplicate allowed        
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 *
 */

