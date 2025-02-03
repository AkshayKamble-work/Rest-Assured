package arrays;

public class Arrays {
	/*
	 Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets:



	 */

	public static void main(String[] args) {
		
		int [] arr=new int[6];
		arr[0]=05;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=40;
		arr[5]=50;
		
		
		
		for (int i = 0; i < arr.length; i++)
			
		{
			
			System.out.println("Index of Array is :: "+i+" value of index is :: "+arr[i]);
			
			
		}
		System.out.println("Length of Array is :: "+arr.length);
		System.out.println("********************************************************************");
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for (String string : cars) 
		{
		
			System.out.println(string);
		}
		
		System.out.println("Length of Array is :: "+cars.length);
	}
}
