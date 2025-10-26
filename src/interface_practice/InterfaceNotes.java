package interface_practice;

public class InterfaceNotes {
	
	
/*
	 
✅ 1.

Interface is a blueprint which contains only abstract methods

✅ Correct, but with a small update:

Before Java 8 → interfaces could contain only abstract methods.

From Java 8 onwards → interfaces can also contain:

default methods (with body)

static methods (with body)

private methods (with body, used inside the interface only)


✅ 2.

All the methods inside an interface are by default abstract and public

✅ Absolutely correct!

You don’t need to write public abstract — it’s added automatically.

interface Animal {
    void sound(); // means public abstract void sound();
}

	 
✅ 3.

To implement the interface we need to create a class using implements keyword

✅ 4.

A class can implement multiple interfaces at a time

✅ 5 .

One interface can extend another interface (using extends keyword)

A class implements one or more interfaces (using implements keyword)


✅ 6 .

We can define static methods inside an interface, but they must be complete (with body).

You cannot have an incomplete static method — that part is correct.

✅ 7 .

Variables are by default public static final 

====================================================================

💡 Simple Definition of Interface:

An interface is like a rule book for classes.
It tells what a class must do, but not how to do it.


Interface is deal or contract between client and developer 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
*/

}
