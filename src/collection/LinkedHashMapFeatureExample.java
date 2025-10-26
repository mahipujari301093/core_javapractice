package collection;
import java.util.LinkedHashMap;
public class LinkedHashMapFeatureExample {

	
	    public static void main(String[] args) {

	        // Create LinkedHashMap
	        LinkedHashMap<Integer, String> cityMap = new LinkedHashMap<Integer, String>();

	        // 1️⃣ Add normal key-value pairs
	        cityMap.put(1, "Chennai");
	        cityMap.put(2, "Kolkata");
	        cityMap.put(3, "Ahmedabad");
	        System.out.println("After adding normal entries: " + cityMap);

	        // 2️⃣ Add duplicate key (2)
	        cityMap.put(2, "Jaipur");  // replaces "Kolkata"
	        System.out.println("After adding duplicate key (2): " + cityMap);

	        // 3️⃣ Add duplicate values (allowed)
	        cityMap.put(4, "Chennai");
	        cityMap.put(5, "Chennai");
	        System.out.println("After adding duplicate values: " + cityMap);

	        // 4️⃣ Add null key (allowed only once)
	        cityMap.put(null, "Lucknow");
	        System.out.println("After adding null key (Lucknow): " + cityMap);

	        // 5️⃣ Add another null key (replaces previous null key value)
	        cityMap.put(null, "Bhubaneswar");
	        System.out.println("After adding duplicate null key (Bhubaneswar replaces Lucknow): " + cityMap);

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
	        System.out.println("Contains value 'Chennai'? " + cityMap.containsValue("Chennai"));

	        // 🔟 Print total size
	        System.out.println("Total entries in LinkedHashMap: " + cityMap.size());
	    }
	}

	/*

	🧠 LinkedHashMap Rules Summary

	1️⃣ Duplicate Keys ❌ Not Allowed
	   Replaces old value if key already exists.
	   map.put(2, "Kolkata");
	   map.put(2, "Jaipur");  // replaces "Kolkata"

	2️⃣ Duplicate Values ✅ Allowed
	   Different keys can have same value.
	   map.put(1, "Chennai");
	   map.put(4, "Chennai");

	3️⃣ Null Key → Only One Allowed
	   Only one null key is allowed. Replaces previous null value.
	   map.put(null, "Lucknow");
	   map.put(null, "Bhubaneswar"); // replaces "Lucknow"

	4️⃣ Null Values → Multiple Allowed
	   Multiple keys can have null value.
	   map.put(6, null);
	   map.put(7, null)

	✅ Difference from HashMap: Maintains **insertion order**.
	*/

	
	

