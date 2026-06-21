package collection;

import java.util.*;

public class ArrayListMethodsExample {

	    public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<String>();
		names.add("Virat");
		names.add("Virat");
		names.add("Rohit");
		names.add("Sachin");
		names.add("Dhoni");
		names.add(null);
		names.add(null);
		System.out.println(names);

		names.set(2,"Hardik");
		System.out.println(names);

		System.out.println(names.get(2));

		System.out.println(names.contains("Rohit"));


        ArrayList<String> nm = new ArrayList<String>();
		nm.add("Jadeja");
		nm.add("Shami");
		names.addAll(nm);
		System.out.println(names);

        System.out.println(names.size());

		names.remove("Dhoni");
		System.out.println(names);

        names.clear();
		System.out.println(names);


		}


}

/*


1. ArrayList size is dynamic (not fixed).

2. ArrayList allows multiple null values.

3. ArrayList allows duplicate values.

4. ArrayList maintains insertion order.

5. Elements are stored in the same order in which they are added.

6. ArrayList uses index-based storage (index starts from 0).

7. ArrayList is not synchronized (not thread-safe).






*/
