package basic;

public class DataTypes {

	public static void main(String[] args) {
		
		/*
		  DataType is used to define which type information variable can store 
		  or Its is used to define capacity of variable
		  
		  Data Type is classified into 2 types
		  1. Primitive Data Type
		   Primitive Data type is keyword i has 8 data type  and it has predefine memory size
		   1.Byte - 1Bit
		   2.Short - 2bit
		   3.Int   - 4 Bit
		   4.Long  - 8 Bit
		   5.Char  2 bit
		   6.Boolean - 1Bit
		   7.Float - 4 bit
		   8.double - 16 Byte
		   
		 */
		
		// Primitive Data Type:
		
		byte variable=127; // we can store the value from -128 to 127 in Byte
		System.out.println(variable);
		
		short shortvariable=-32768;// we can store value from -32768 to 32767 try to enter value more then limit it throw the compile time error
		System.out.println(shortvariable);
		
		int intVariable=2147483647;//we can store value from -2147483648to 2147483647 try to enter value more then limit it throw the compile time error
		System.out.println(intVariable);
		
		long longVariable=-9223372036854775808l;
		//we can store value from -9223372036854775808 to 9223372036854775807 try to enter value more then limit it throw the compile time error
		System.out.println(longVariable);
		
		float floatVariable=-344.5677f;
		System.out.println(floatVariable);
		
		char charVariavle='a';
		System.out.println(charVariavle);
		
		double doubleVariable=10;
		System.out.println(doubleVariable);
		
		Boolean booleanVariable=true;
		System.out.println(booleanVariable);
		
		Boolean booleanvariable2=false;
		System.out.println(booleanvariable2);
		
		
	}
}
