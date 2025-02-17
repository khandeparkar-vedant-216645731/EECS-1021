import java.util.Scanner;

public class WhileLoopApp {

	public static void main(String[] args) {
		
		// Prompt the user for two strictly positive integers
		// Calculate their average
		// Error Handling: For each integer, as long as the user cannot
		// Enter a value > 0, we have to keep prompting the user for an integer

		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int total = 0;
		
		// This while loop controls the number of times that the user will be prompted enter an integer.
		while (i <= 2) {
			System.out.println("Enter integer " + i + ":");
			int x = input.nextInt();
			
			// This while loop controls the indefinite number of times the user enters an integer < 0.
			while (!(x>0)) {
				System.out.println("Error: " + x + " is not > 0");
				System.out.println("Try Again.");
				x = input.nextInt();
			}
			
			total += x;
			i++;
		}
		
		double average = total / 2.0;
		System.out.println("Average is " + average);
		input.close();
	}

}
