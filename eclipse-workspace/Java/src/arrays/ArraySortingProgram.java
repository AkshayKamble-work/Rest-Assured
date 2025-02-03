package arrays;

import java.util.Arrays;

public class ArraySortingProgram {

	
	public static void main(String[] args) {
		
		int a[]= {11,22,44,111,1442,00,8,9,};
		System.out.println("---Before Sorting Array---");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}System.out.println();
		System.out.println();
		System.out.println("---Before Sorting Array---");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
	}
}
