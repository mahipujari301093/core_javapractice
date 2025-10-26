package collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>();

		names.add("Neha");
		names.add("Amit");
		names.add("Ravi");
		names.add("Neha"); // duplicate, will be ignored
		names.add(null);
		names.add(null);

		System.out.println("Names :" + names);

	}

}

/*

Definition of Set (in Java):

A Set is a collection in Java that does not allow duplicate elements.
It is part of the java.util package and is implemented by classes like HashSet, LinkedHashSet, and TreeSet.

👉 Key points:

No duplicate values allowed ✅

Only one null value allowed



*/