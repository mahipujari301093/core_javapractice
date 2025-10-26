package casting;

public class ExplicitCastingExample {
	
	
	public static void main(String[]args)
	{
		
		double a = 10.75;      // double is 8 bytes
		int b = (int)a;        // manual conversion from double → int
		
		System.out.println("Double value: " + a);
        System.out.println("Integer value: " + b);
		
			
		
	}
		

}

/*
Explanation:

a is a double (larger type).

(int) a converts it manually to int (smaller type).

Decimal part .75 is lost, because integers cannot store decimals.

Converting a bigger data type value into a smaller data type manually using a cast operator ( ) is called Explicit Type Casting (or Narrowing Conversion).

🔹 Final Definition:

In implicit type casting, data conversion happens automatically (done by Java).

In explicit type casting, data conversion happens manually (done by the programmer using a cast operator ( )).


| Type Casting             | Conversion Type  | Who Does It         | Example        | Data Loss   |
| ------------------------ | ---------------- | ------------------- | -------------- | ----------- |
| **Implicit (Widening)**  | Smaller → Bigger | Java (Automatic)    | `int → double` | ❌ No        |
| **Explicit (Narrowing)** | Bigger → Smaller | Programmer (Manual) | `double → int` | ⚠️ Possible |


💡 What is Data Loss in Type Casting?

When we convert from a bigger data type to a smaller one (like double → int),
some part of the data may be lost because the smaller type cannot store all the information.

That’s called data loss.(Decimal part .75 is lost, because integers cannot store decimals.)

*/