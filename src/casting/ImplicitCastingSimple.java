package casting;

public class ImplicitCastingSimple {
	
	
	public static void main(String[]args)
	{
		
		int a = 5;
		double b = a;  
		
		System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);   

	}

}



/*

1️⃣ Implicit Casting — Widening

Implicit casting is the conversion from a smaller data type to a larger data type.
Java does it automatically, and there is no data loss because the larger data type can store the smaller data type's value.

int → double ✅
double can store the int value 10, so no data is lost.


*/