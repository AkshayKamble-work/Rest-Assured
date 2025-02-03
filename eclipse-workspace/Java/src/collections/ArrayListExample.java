package collections;

import java.util.ArrayList;

public class ArrayListExample {

	    public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> names = new ArrayList<>();

	        // Add elements to the ArrayList
	        names.add("Akshay");
	        names.add("Prashanthi");
	        names.add("John");
	        names.add("Alice");

	        // Print the ArrayList
	        System.out.println("Initial ArrayList: " + names);

	        // Access elements
	        System.out.println("First Element: " + names.get(0));

	        // Update an element
	        names.set(1, "Priya");
	        System.out.println("After Update: " + names);

	        // Remove an element
	        names.remove("John");
	        System.out.println("After Removal: " + names);

	        // Check if an element exists
	        if (names.contains("Alice")) {
	            System.out.println("Alice is in the list.");
	        }

	        // Iterate through the ArrayList
	        System.out.println("Iterating through ArrayList:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Clear all elements
	        names.clear();
	        System.out.println("ArrayList after clear: " + names);
	    }
	}


