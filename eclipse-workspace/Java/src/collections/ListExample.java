package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
		
		// Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add(" ");//  null operations are allowed 
        li.add("C++");
        li.add("Java");// Duplicate are allow
       

        System.out.println("Elements of List are: "+li);
        System.out.println();
        // Iterating through the list
        System.out.println("Iterating through the list");
        for (String s : li) {
            System.out.print(s+",");
        }
        System.out.println();
        System.out.println();
     // Accessing elements
        System.out.println("Element at Index 1: "+ li.get(1));
        System.out.println();
        // Updating elements
        li.set(1, "JavaScript");
        System.out.println("Updated List: " + li);
        System.out.println();
        // Removing elements
        li.remove("C++");
        System.out.println("List After Removing Element: " + li);
    }


	} 
	

