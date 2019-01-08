
public class NumberVariables {

	public static void main(String[] args) {
		System.out.println("After initializing i's value to 5");
		int i = 5;
        // int i is the declaration of a variable 
		// 'i' is the name of the variable and 'int' is the type of variable
		// you can only declare the type of variable once
		System.out.println("i's value is = " + i); // i has the value of 5
		
		i = 7;
		System.out.println("After changing i's value to 7");
		System.out.println("i's value is = " + i); // i has the value of 7
		
		double x = 7.2; // double stores values with more precision places.
		double y = 3.0;
		// This is a flexible solution and thus the values will change every time you change x and y values. 
		System.out.println("Average between x, " + x + ", and y, " + y + ", is equal to " + ((x + y) / 2)); // answer is expected to be 5.1
	}

}