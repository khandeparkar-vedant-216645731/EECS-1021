import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Develop a console application that determines the users entered integer is positive (>0);
		
		// The logical negation for i > 0 is !(i > 0) which is equivalent to i <=0.
		
		System.out.println("Enter an integer:");
		int i = input.nextInt();
		boolean isLessThanOrEqualToZero = i <= 0;
		System.out.println("The number you entered was positive: " + !isLessThanOrEqualToZero);
		
		// System.out.println("The Number you entered was positive: " + !(!(i > 0));

		input.close();

	}

}
