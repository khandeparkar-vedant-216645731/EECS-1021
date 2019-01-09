import java.util.Scanner;

public class SimpleUserInputs1 {

	public static void main(String[] args) {
		// Create an input object of type scanner so that we can use input to read integer, double or string from the user (keyboard).
		Scanner input = new Scanner(System.in); // always say control space after typing scanner to get the input line.
        
		// STEP 1 --> Prompt the user for an input
		System.out.println("Enter an integer:");
		
		// STEP 2 --> Read an input (which can be an integer, double or string) from the user.
		int i = input.nextInt(); // read an integer from the keyboard and store the read value into variable i
		
		// STEP 3 --> Perform some computation with the integer values stored.
		int square = i * i;
		
		// STEP 4 --> Output some result back to the user
		System.out.println("The square of i, " + i + ", is " + square);
	
	    input.close();
	}

}

