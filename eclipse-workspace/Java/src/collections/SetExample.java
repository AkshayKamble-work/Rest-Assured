package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample 
{

	public static void main(String[] args) 
	{

		// Using HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Apple"); // Duplicate, will not be added
		System.out.println("HashSet (no order):");
		printSet(hashSet);
		// Using LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Bird");
        linkedHashSet.add("Dog"); // Duplicate, will not be added
        System.out.println("\nLinkedHashSet (insertion order):");
        printSet(linkedHashSet);
		
        // Using TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Lion");
        treeSet.add("Elephant");
        treeSet.add("Lion"); // Duplicate, will not be added

        System.out.println("\nTreeSet (sorted order):");
        printSet(treeSet);
        
        
        // Common operations
        System.out.println("\nCommon Set Operations:");
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Does HashSet contain 'Banana'? " + hashSet.contains("Banana"));

        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
    

	}
	// Method to print elements of a Set
	private static void printSet(Set<String> set) 
	{
		for (String element : set) {
			System.out.println(element);
		}
	}
}
