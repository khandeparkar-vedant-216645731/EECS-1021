import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		
		// VERSION WITHOUT FOR-LOOP 
		
		// Scanner input = new Scanner(System.in);
		
		// Problem: Prompt the user to enter 5 integers
		// Then calculate their average
		
		// System.out.println("Enter integer 1");
		// int i1 = input.nextInt();
		
		// System.out.println("Enter integer 2");
		// int i2 = input.nextInt();

		// System.out.println("Enter integer 3");
		// int i3 = input.nextInt();

		// System.out.println("Enter integer 4");
		// int i4 = input.nextInt();

		// System.out.println("Enter integer 5");
		// int i5 = input.nextInt();
		
		// input.close();
		
		Scanner input = new Scanner(System.in);
		
		// for (int i = 1; i <= 5 ; i++) {}
		
		int total = 0;
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Enter integer " + i + ":");
			int x = input.nextInt();
			total += x;
		}
		
		double average = ((double) total)/5;
		System.out.println("Average is " + average);
		input.close();
	}

}
