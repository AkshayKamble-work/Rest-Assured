package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
	
	Map<Integer, String> map = new HashMap<>();

    // Adding elements
    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Cherry");

    // Accessing elements
    System.out.println("Value for key 2: " + map.get(2));
    System.out.println();
    System.out.println();
    for (Map.Entry KV:map.entrySet()) 
    		{
    	System.out.println("Map Elements :: "+KV.getKey()+" "+KV.getValue());
		
	}
    System.out.println();
    System.out.println();
    // Checking for keys and values
    System.out.println("Map contains key 1? " + map.containsKey(1));
    System.out.println("Map contains value 'Banana'? " + map.containsValue("Banana"));

    // Iterating through keys, values, and entries
    System.out.println("Keys: " + map.keySet());
    System.out.println("Values: " + map.values());
    System.out.println("Entries: " + map.entrySet());

    // Removing elements
    map.remove(2);
    System.out.println("After removing key 2: " + map);

    // Using default value
    System.out.println("Value for key 5 (default): " + map.getOrDefault(5, "Default"));

    // Clearing the map
    map.clear();
    System.out.println("Map after clearing: " + map);
    
  
}

	
}
