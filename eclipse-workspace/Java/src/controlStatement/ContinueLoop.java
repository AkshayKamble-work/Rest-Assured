package controlStatement;

public class ContinueLoop {

	
	public static void main(String[] args) {
		
		int a=0;
		while (a<10)
		{
		
			if (a==4)
			{
				a++;
			continue;// if i==4 it will ignore the condition and continue execute the loop
			
			}
			System.out.println(a);
			a++;
		}
		
	}
}
