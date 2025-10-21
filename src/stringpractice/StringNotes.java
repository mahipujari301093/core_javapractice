package stringpractice;

public class StringNotes {
	
	
/*
 
🧩 2️⃣ How == works

When you use:

s1 == s2


Java checks:

“Do s1 and s2 point to the same exact memory location?”

If yes → returns true
If no → returns false

It does NOT check the actual text (characters).

 
 
🧠 5️⃣ In short
Operator	Compares	Used for
==	Memory address (reference) ->	To check if two references point to the same object
equals()	Content (text/characters)->	To check if two strings have same value 
 	

*******************************************************

When you use new keyword, a new object is always created in Heap area.
String s1 = new String("Java");



✅ Summary Table

String s1 = "Java";			Created in SCP area
String s2 = "Java";		    Created in SCP area 
String s3 = new String("Java");	Creates new object -> Heap area 

**************************************************************************	
 	
🧠 2️⃣ What happens when you create Strings
✅ Case 1: Using string literal
String s1 = "Java";
String s2 = "Java";


How JVM handles this:

When "Java" is created first time → JVM checks String Constant Pool (SCP).

If not found, JVM creates a new object in SCP.

If already exists, JVM reuses the same object and just points new reference to it.

🧾 Result:

Only one “Java” object in SCP.

Both s1 and s2 point to same memory address.

**********************************************************************************

String s1 = "Java";
String s2 = "paython"; 


👉 JVM checks the SCP again

"paython" is different content, not found in the SCP.

So, it creates another new object for "paython" in the SCP.

📘 Result:

✅ Two String objects are created in the SCP
(because the contents are different).

✅ So your understanding is correct:

Because "Java" and "paython" have different values,
the JVM creates two separate String objects in the String Constant Pool


*****************************************************************************

String s = new String("Vishal");

✅ Summary:

"Vishal" → 1 object in SCP

new String("Vishal") → 1 object in Heap

Total = 2 objects (most common case)

If "Vishal" was already in SCP, then only 1 new object (Heap) will be created.


String s = new String("Vishal");

	Heap       SCP
	Vishal ->  Vishal
 	
 	
****************************************************************

String s = new String("Vishal"); 	
String s = new String("Radhika");

 Heap        SCP
 Vishal      Vishal
             Radhika	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
