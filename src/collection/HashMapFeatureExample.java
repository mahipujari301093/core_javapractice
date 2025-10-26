package collection;

import java.util.HashMap;

		public class HashMapFeatureExample {
		    public static void main(String[] args) {

		        // Create HashMap
		        HashMap<Integer, String> cityMap = new HashMap<>();

		        // 1️⃣ Add normal key-value pairs
		        cityMap.put(1, "Mumbai");
		        cityMap.put(2, "Delhi");
		        cityMap.put(3, "Pune");
		        System.out.println("After adding normal entries: " + cityMap);

		        // 2️⃣ Add duplicate key (2)
		        cityMap.put(2, "Bangalore");  // replaces "Delhi"
		        System.out.println("After adding duplicate key (2): " + cityMap);

		        // 3️⃣ Add duplicate values (allowed)
		        cityMap.put(4, "Mumbai");
		        cityMap.put(5, "Mumbai");
		        System.out.println("After adding duplicate values: " + cityMap);

		        // 4️⃣ Add null key (allowed only once)
		        cityMap.put(null, "Hyderabad");
		        System.out.println("After adding null key (Hyderabad): " + cityMap);

		        // 5️⃣ Add another null key (replaces previous null key value)
		        cityMap.put(null, "Chennai");
		        System.out.println("After adding duplicate null key (Chennai replaces Hyderabad): " + cityMap);

		        // 6️⃣ Add null values (multiple allowed)
		        cityMap.put(6, null);
		        cityMap.put(7, null);
		        System.out.println("After adding multiple null values: " + cityMap);

		        // 7️⃣ Access value by key
		        System.out.println("City with key 2: " + cityMap.get(2));
		        System.out.println("City with null key: " + cityMap.get(null));

		        // 8️⃣ Remove a key-value pair
		        cityMap.remove(3);
		        System.out.println("After removing key 3: " + cityMap);

		        // 9️⃣ Check if key/value exists
		        System.out.println("Contains key 1? " + cityMap.containsKey(1));
		        System.out.println("Contains value 'Mumbai'? " + cityMap.containsValue("Mumbai"));

		        // 🔟 Print total size
		        System.out.println("Total entries in HashMap: " + cityMap.size());
		    }
		}


		
/*

🧠 HashMap Rules Summary

1️⃣ Duplicate Keys ❌ Not Allowed

If you add the same key again, it replaces the old value.

map.put(1, "A");
map.put(1, "B");  // "A" is replaced by "B"


✅ Result: {1=B}
===================================================
2️⃣ Duplicate Values ✅ Allowed

Different keys can have the same value.

map.put(1, "A");
map.put(2, "A");


✅ Result: {1=A, 2=A}
====================================================
3️⃣ Null Key → Only One Allowed

If you add another null key, it replaces the previous one.

map.put(null, "X");
map.put(null, "Y"); // replaces X


✅ Result: {null=Y}
======================================================
4️⃣ Null Values → Multiple Allowed

Any number of keys can have null as value.

map.put(1, null);
map.put(2, null);


✅ Result: {1=null, 2=null}


 * 
 */
