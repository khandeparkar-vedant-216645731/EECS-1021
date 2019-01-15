import java.util.Scanner;

public class LogicalOperationApp3b {

	public static void main(String[] args) {
		// We expect the integer entered by the user not to be in a particular range
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter and integer that is not between 1 and 10:");
		int i = input.nextInt();
		// Wrong choice of operator
		boolean isNotBetween = i < 1 && i > 10; // there is no number less than 1 and greater than 10 --> output will ALWAYS be FALSE
		System.out.println("The number you entered " + i + " is not between 1 and 10: " + isNotBetween);
		
		input.close();

	}

}
