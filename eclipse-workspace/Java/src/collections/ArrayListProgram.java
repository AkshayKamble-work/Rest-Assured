package collections;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {


		ArrayList ar=new ArrayList();
		ar.add("Hello");
		ar.add("Java");
		ar.add("Hello");// Duplicate are allowed
		System.out.println(ar);


		ar.add(" ");// Null are allowed 
		ar.add(1);
		ar.add("Java");
		System.out.println(ar);// insertion order is maintains

		System.out.println("Accessing the element usig index number :: "+ar.get(2));// access the element using index number.
		System.out.println("Size of Array is :: "+ar.size());
		ar.add(3,"Ranjeet");
		System.out.println("Element is added in 3 index is :: "+ar.get(3));
		System.out.println(ar);
		ar.remove(5);
		System.out.println("Removed element from 5 index :: "+ar);

		for(int i=0;i<ar.size();i++)
		{

		}
	}

}
