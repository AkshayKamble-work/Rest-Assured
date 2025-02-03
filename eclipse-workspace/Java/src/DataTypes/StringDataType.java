package DataTypes;

public class StringDataType {

	/*
	 Strings are used for storing text.
	 A String variable contains a collection of characters surrounded by double quotes
	 A String in Java is actually an object, which contain methods that can perform certain operations on strings.
	  For example, the length of a string can be found with the length() method:
	  There are many string methods available, for example toUpperCase() and toLowerCase():
	  The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):


	 */
	public static void main(String[] args) {

		String StringName="Hello";
		System.out.println("Length of String is :: "+StringName.length());
		System.out.println("Priting String in upper case :: "+StringName.toUpperCase());
		System.out.println("Priting String in lower case :: "+StringName.toLowerCase());
		System.out.println(StringName.indexOf("Hello"));

		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate"));

	}
}
