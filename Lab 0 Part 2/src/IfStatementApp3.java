import java.util.Scanner;

public class IfStatementApp3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer balance
		// Prompt the user to enter an integer amount to withdraw
		// Display the remaining balance after the withdrawal
		
		// Three possible errors from the user
		// 1. balance < 0 (cannot withdraw if there is no balance)
		// 2. amount < 0 (cannot give money into the ATM)
		// 3. amount <= balance (cannot withdraw more money then the balance you have)
		
		System.out.println("Enter an integer balance:");
		int initialBalance = input.nextInt();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if (initialBalance < 0 || amount < 0 || amount >= initialBalance) {
			// The body of the if-statement
			// This block of code is only if the the branch conditions are all true
			System.out.println("Error: Launch the program again.");
		}
		else {
			// The body of the else-statement
			// This block of code is only if the the branch conditions are all false
			int resultingBalance = initialBalance - amount;
			System.out.println("Initial balance was " + initialBalance + " and withdrawing " + amount + " has the resulting balance " + resultingBalance + ".");

		}
		
		input.close();

	}

}
