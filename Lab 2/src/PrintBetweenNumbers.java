import java.util.Scanner;

public class PrintBetweenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound:");
		int l = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a upper bound:");
		int u = input.nextInt();
		input.nextLine();
		
		if (l>u) {
			System.out.println("Error: lower bound " + l + " is not less than or equal to the upper bound " + u + ".");
			System.out.println("Bye!");
		}
		else {
			System.out.println("Numbers between " + l + " and " + u + " are:");
			while (l<=u) {
				System.out.println(l);
				l = l+1;
			}
			System.out.println("Bye!");
		}
		
        input.close();
	}

}
