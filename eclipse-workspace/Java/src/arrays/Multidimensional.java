package arrays;



public class Multidimensional {

	public static void main(String[] args) 
	{

		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int[] row : myNumbers)
		{
			for (int i : row)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("********************************************************");
		String cars[][]= {{"Maruthi","Thar","suzuki"},{"Fronx","XUV700","KIA"}};
		
		for (int i = 0; i < cars.length; ++i)
		{
		
			for (int j = 0; j < cars[i].length; ++j) 
			{
				
			
				System.out.println(cars[i][j]);
			}
		}
	}
}
