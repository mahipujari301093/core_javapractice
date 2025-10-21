package casting;

public class ImplicitCastingSimple {
	
	
	public static void main(String[]args)
	{
		
		int a = 5;
		double b = a;
		
		System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);     // int automatically converted to double
        
        
		
		
	}

}

/*
🔹 Explanation:

a is an integer (int = 4 bytes).

When we assign a to b (double = 8 bytes),
Java automatically converts int → double.

This automatic conversion is called implicit casting or widening conversion.

💡 One-line definition:

Implicit Type Casting → automatic conversion from lower to higher data type (no data loss).
👉 Here, Java automatically converts int (4 bytes) → double (8 bytes).

🔹 Final Definition:

In implicit type casting, data conversion happens automatically (done by Java).

In explicit type casting, data conversion happens manually (done by the programmer using a cast operator ( )).

| Type Casting             | Conversion Type  | Who Does It         | Example        | Data Loss   |
| ------------------------ | ---------------- | ------------------- | -------------- | ----------- |
| **Implicit (Widening)**  | Smaller → Bigger | Java (Automatic)    | `int → double` | ❌ No        |
| **Explicit (Narrowing)** | Bigger → Smaller | Programmer (Manual) | `double → int` | ⚠️ Possible |




*/