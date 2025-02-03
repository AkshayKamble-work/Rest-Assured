package arrays;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		System.out.println("--Unorder list Array--");
		String str[]= {"Apple","Mango","Cherry","Banana","Orange"};
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+",");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("--Order list Array--");
		Arrays.sort(str);
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+",");
		}
	}
}
