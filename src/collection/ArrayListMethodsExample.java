package collection;

import java.util.ArrayList;

public class ArrayListMethodsExample {
	    public static void main(String[] args) {

	        // Create ArrayList
	        ArrayList<String> names = new ArrayList<String>();

	        // add() - add elements
	        names.add("Vishal");
	        names.add("Radhika");
	        names.add("Sagar");
	        names.add("Neha");
	        System.out.println("After add(): " + names);

	        // set() - update element(replace)
	        names.set(1, "Ravi");
	        System.out.println("After set(): " + names);
	        
	        // get() - get element by index
	        System.out.println("Element at index 2: " + names.get(2));

	        // remove() - remove element by name
	        names.remove("Sagar");
	        System.out.println("After remove(): " + names);

	        // contains() - check element
	        System.out.println("Contains Neha? " + names.contains("Neha"));

	        // addAll() - add another list
	        ArrayList<String> newNames = new ArrayList<String>();
	        newNames.add("Amit");
	        newNames.add("Priya");
	        names.addAll(newNames);
	        System.out.println("After addAll(): " + names);

	        // retainAll() - keep only common elements
	        ArrayList<String> common = new ArrayList<>();
	        common.add("Neha");
	        common.add("Amit");
	        names.retainAll(common);
	        System.out.println("After retainAll(): " + names);

	        // removeAll() - remove all from another list
	        names.removeAll(common);
	        System.out.println("After removeAll(): " + names);

	        // size() - get number of elements
	        System.out.println("Size: " + names.size());
	        
	     // clear() - remove all elements
	        names.clear();
	        System.out.println("After clear(): " + names);
	    }
	}


/*
 
💡 In short:
Method	Purpose
add()	Add one element
set()	Replace an element
remove()	Remove element
contains()	Check if element exists
addAll()	Add all elements from another list
retainAll()	Keep only common elements
removeAll()	Remove elements from another list
size()	Get total number of elements 
clear()  Remove all elements

💡 Meaning of retainAll() method:

👉 retainAll() keeps only the common elements between two ArrayLists and removes all other elements.
 
 
RetailAll example:

ArrayList<String> names = new ArrayList<>();
names.add("Vishal");
names.add("Ravi");
names.add("Neha");
names.add("Amit");

System.out.println("Before retainAll(): " + names);

// Another list with some common names
ArrayList<String> common = new ArrayList<>();
common.add("Neha");
common.add("Amit");

// Keep only names that are also in 'common'
names.retainAll(common);

System.out.println("After retainAll(): " + names);

🧠 Output:
Before retainAll(): [Vishal, Ravi, Neha, Amit]
After retainAll(): [Neha, Amit] 
 
 
 
ArrayList allowed duplicate values and null values

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
 
   
 
 */

