import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st Integer in Sequence 1:");
		int a1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd Integer in Sequence 1:");
		int a2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd Integer in Sequence 1:");
		int a3 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th Integer in Sequence 1:");
		int a4 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 1st Integer in Sequence 2:");
		int b1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd Integer in Sequence 2:");
		int b2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd Integer in Sequence 2:");
		int b3 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th Integer in Sequence 2:");
		int b4 = input.nextInt();
		input.nextLine();
		
		int sum = ((a1*b1)+(a2*b2)+(a3*b3)+(a4*b4));
		
		System.out.println("sum([" + a1 + ", " + a2 + ", " + a3 + ", " + a4 + "] * [" + b1 + ", " + b2 + ", " + b3 + ", " + b4 + "]) = " + sum);
		
		input.close();
	}

}
