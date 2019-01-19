import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		
		// 1. Prompt the user for an initial balance of their bank account (0 < balance < 1000)
		// 2. Prompt the user for a transaction (transaction should be either "d" or "w"; otherwise it is invalid)
		// 3. Prompt the user for an amount 
		//    + (in both cases, amount should be positive)
		//    + (in the case of a withdrawal: amount should be affordable)
		//    + (in the case of a deposit: balance + amount <= 1000)
		// 4. Perform a transaction accordingly and output resulting balance to console
		
		// Note: As soon as an error occurs, your app should print out and error and the program should terminate
		
		Scanner input = new Scanner(System.in);
		
		// Stage 1
		
		System.out.println("Enter a balance (e.g., 200.45)");
		double balance = input.nextDouble();
		input.nextLine();
		
		if (0 < balance && balance <= 1000){
			// Valid Initial Balance 
		}
		else {
			System.out.println("Error: initial balance " + balance + " is not in (0, 1000].");
		}
		
		// Stage 2
		
		System.out.println("Enter a transaction type (\"d\" or \"w\"):");
		String type = input.nextLine();
		
		if (type.equals("d")) {
			// Valid transaction type
		}
		else if (type.equals("w")) {
			// Valid transaction type
		}
		else {
			System.out.println("Error: transaction type " + type + " is neither d nor w");
		}
		
		// Stage 3
		
		System.out.println("Enter and amount for " + type + ":");
		double amount = input.nextDouble();
		input.nextLine();
		
		if (type.equals("d")) {
			if (amount < 0) {
				System.out.println("Error: deposit amount is not postive.");
			}
			else if ((balance + amount) > 1000) {
				System.out.println("Error: deposit amount is too large.");
			}
			else {
				// balance = balance + amount;
				balance += amount;
			}
		}
		else if (type.equals("w")){
			if (amount < 0) {
				System.out.println("Error: withdrwal amount is not postive.");
			}
			else if (amount >= balance) {
				System.out.println("Error: withdrawal amount is too large.");
			}
			else {
				// balance = balance - amount;
				balance -= amount;
		    }
		
		// Stage 4	
		System.out.println("Resulting balance after performing transaction of " +type + " with $"+ amount + ": " + balance);
		}
		
        input.close();
	}
}

