package stringpractice;

public class StringNotes {
	
	
/*

****************************************************************

String s1 = new String("Vishal");   // creates 1 object in SCP and 1 object in Heap
String s2 = new String("Vishal");   // no new SCP object (because "Vishal" already exists), but creates 1 new Heap object
String s3 = new String("Radhika");  // creates 1 object in SCP and 1 object in Heap


✅ Line 1
String s1 = new String("Vishal");

If "Vishal" not in SCP:

1 object will create in SCP area
1 object will create in Heap area

***************************
✅ Line 2
String s2 = new String("Vishal");

SCP already has "Vishal" ✔
So:

❌ No new SCP object
✅ New Heap object


****************************
✅ Line 3
String s3 = new String("Radhika");

If "Radhika" not in SCP:

1 object in SCP
1 object in Heap


**********************************************************************
✅ Code

String s1 = "Java";     // stored in SCP (String Constant Pool)
String s2 = "Vishal";   // stored in SCP (String Constant Pool)
String s3 = "Vishal";   // "Vishal" already exists in SCP → reuse

✅ Step-by-step JVM work
Line 1

"Java" not in SCP → create.

Line 2

"Vishal" not in SCP → create.

Line 3

"Vishal" already exists in SCP → reuse.

No new object.

*************************************************************************
✅ Code

String s1 = "Java";  // stored in SCP (String Constant Pool)
String s2 = new String("Java"); // creates only 1 new object in Heap, "Java" already exists in SCP → reuse

✅ Step-by-step JVM action
Line 1
String s1 = "Java";
"Java" not in SCP → create 1 object in SCP.

Line 2
String s2 = new String("Java");

Because you used new:

✔ JVM checks SCP → "Java" already exists → reuse
✔ BUT new forces → create new object in Heap

**************************************************************************
✅ Code

String s1 = "Java";   // stored in SCP (String Constant Pool)
String s2 = new String("python"); // creates two objects: one in SCP for "python" and one in Heap for the new String object



 */


}
