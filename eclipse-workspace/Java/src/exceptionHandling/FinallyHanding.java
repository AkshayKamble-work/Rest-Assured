package exceptionHandling;

public class FinallyHanding {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c;
		
		try {
			c=a/b;
			System.out.println("Exception is generated");
		} finally {
			System.out.println("Hello Finally block alway executed ");
		}
	}
}
