package exceptionHandling;

public class TestException {

	
	public static void main(String[] args) {
		 int a=10;
		 int b=0;
		 int c;
		 try 
		 {
			c=a/b;
			System.out.println(c);
			
		} catch (Exception e)
		 {
			System.out.println("Exception Occurred and handled with catch block");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		 finally {
				System.out.println("Hello Finally block alway executed ");
			}
	}
}
