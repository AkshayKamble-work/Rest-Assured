package arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		String a[][]= new String[5][5];
		
		 a[0][0]="A1";
		 a[0][1]="A2";
		 a[0][2]="A3";
		 a[0][3]="A4";
		 a[0][4]="A5";
		 
		 a[1][0]="B1";
		 a[1][1]="B2";
		 a[1][2]="B3";
		 a[1][3]="B4";
		 a[1][4]="B5";
		 
		 a[2][0]="C1";
		 a[2][1]="C2";
		 a[2][2]="C3";
		 a[2][3]="C4";
		 a[2][4]="C5";
		 
		 a[3][0]="D1";
		 a[3][1]="D2";
		 a[3][2]="D3";
		 a[3][3]="D4";
		 a[3][4]="D5";

		 a[4][0]="E1";
		 a[4][1]="E2";
		 a[4][2]="E3";
		 a[4][3]="E4";
		 a[4][4]="E5";
		
		 //System.out.println(a[2][2]);
		 for(int Row=0; Row<a.length;Row++)
		 {
			 for(int col=0;col<=a[3].length-1;col++)
			 {
				System.out.print(a[Row][col]+" || "); 
			 }
			 System.out.println();
		 }
		
	}
	

}
