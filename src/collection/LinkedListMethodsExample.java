package collection;

	
	import java.util.LinkedList;

	public class LinkedListMethodsExample {

	    public static void main(String[] args) {

			LinkedList<Integer> ls = new LinkedList<Integer>();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(40);
			ls.add(null);
			System.out.println(ls);

			ls.addFirst(60);
			System.out.println(ls);

			ls.addLast(80);
			System.out.println(ls);


			System.out.println(ls.getFirst());
			System.out.println(ls.getLast());

			ls.removeFirst();
			System.out.println(ls);

			ls.removeLast();
			System.out.println(ls);

			System.out.println(ls.get(2));

			System.out.println(ls.size());

			System.out.println(ls.contains(30));

			ls.clear();
			System.out.println(ls);
	    }
	}

/*

1. LinkedList size is dynamic (not fixed).

2. LinkedList allows multiple null values.

3. LinkedList allows duplicate values.

4. LinkedList maintains insertion order.

5. Elements are stored in the same order in which they are added.

6. LinkedList allows index-based access (index starts from 0).

7. LinkedList is not synchronized (not thread-safe).


 */

