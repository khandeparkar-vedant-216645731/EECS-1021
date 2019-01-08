
public class StringVariables {

	public static void main(String[] args) {
		String firstName = ""; // This is called an empty string
		String lastName = ""; 
		int i = 0;
		
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);
		
		firstName = "Heeyon";
		lastName = "Kang";
		i = i+1;
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);
		
		firstName = "Jihye";
		lastName = "Park";
		i = i + 1;
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);

		/*  Lines 14 and 19 are identical
		 *  However at runtime they produce different outputs
		 *  This is because they depend on the values of variables that are changed at various points throughout the code
		 */ 
		
		
	}

}
