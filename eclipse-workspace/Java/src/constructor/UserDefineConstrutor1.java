package constructor;

public class UserDefineConstrutor1 {
	int No1;
	int No2;
	int Addition;

	public  UserDefineConstrutor1(){
	 

		System.out.println("Zero input prrmeter const");

	}

	public UserDefineConstrutor1(int n1, int n2) {

		No1 = n1;
		No2 = n2;
		Addition = No1 + No2;
		// Addition =n1 +n2;

	}

	public static void main(String[] args) {

		UserDefineConstrutor1 UD1 = new UserDefineConstrutor1(); // Object
		UserDefineConstrutor1 UD2 = new UserDefineConstrutor1(10, 20);

		System.out.println(UD2.No1 + " " + UD2.No2); //

		System.out.println(UD2.Addition);

		UD2.Demo();
	}

	public void Demo() {

		System.out.println(No1 + " " + No2); // 0 0 10 ,20
		System.out.println(Addition); // 30
	}

}
