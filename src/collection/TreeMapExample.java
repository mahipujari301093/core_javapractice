package collection;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		// Create TreeMap
		TreeMap<Integer, String> cityMap = new TreeMap<Integer, String>();

		// 1️⃣ Add key-value pairs
		cityMap.put(3, "Mumbai");
		cityMap.put(1, "Delhi");
		cityMap.put(5, "Bangalore");
		cityMap.put(2, "Pune");
		System.out.println("After adding entries: " + cityMap);

		// 2️⃣ Duplicate key (3) → replaces old value
		cityMap.put(3, "Chennai");
		System.out.println("After adding duplicate key (3): " + cityMap);

		// 3️⃣ Duplicate values → allowed
		cityMap.put(6, "Delhi");
		System.out.println("After adding duplicate value: " + cityMap);

		// 4️⃣ Null key → NOT allowed (will throw NullPointerException)
		// cityMap.put(null, "Lucknow"); // ❌ Uncommenting this will crash program

		// 5️⃣ Null value → allowed
		cityMap.put(7, null);
		System.out.println("After adding null value: " + cityMap);

		// 6️⃣ Access value by key
		System.out.println("City with key 5: " + cityMap.get(5));

		// 7️⃣ Remove a key-value pair
		cityMap.remove(2);
		System.out.println("After removing key 2: " + cityMap);

		// 8️⃣ Check if key/value exists
		System.out.println("Contains key 1? " + cityMap.containsKey(1));
		System.out.println("Contains value 'Delhi'? " + cityMap.containsValue("Delhi"));

		// 9️⃣ Print total size
		System.out.println("Total entries in TreeMap: " + cityMap.size());
	}
}

/*
 
  🧠 TreeMap Rules Summary
  
  1️⃣ Duplicate Keys ❌ Not Allowed → Replaces old value if key exists. 2️⃣
  Duplicate Values ✅ Allowed 3️⃣ Null Key ❌ Not allowed 4️⃣ Null Values ✅
  Allowed 5️⃣ Maintains **sorted order of keys** by default.
  
  💡 TreeMap Key Points

Stores key-value pairs like HashMap.

Keys must be unique — duplicate keys are not allowed.

Values can be duplicate.

Null key is not allowed (but null values are allowed).

Maintains sorted order of keys (ascending by default).
 
✅ Key Points

Keys are always sorted → 1, 3, 5, 6, 7.

Duplicate keys replace old value.

Duplicate values allowed.

Null key not allowed.

Null values allowed. 
 
 */
