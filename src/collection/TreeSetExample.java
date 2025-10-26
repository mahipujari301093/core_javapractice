package collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<String>();

		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Bangalore");
		cities.add("Mumbai"); // duplicate, ignored
//		 cities.add(null);   ❌ not allowed — TreeSet does not allow null

		System.out.println("Cities: " + cities);
	}
}


/*
Key Points about TreeSet:

Does not allow duplicate values.

Does not allow null values.

Stores elements in sorted (ascending) order automatically.

It implements the NavigableSet and SortedSet interfaces.

*/