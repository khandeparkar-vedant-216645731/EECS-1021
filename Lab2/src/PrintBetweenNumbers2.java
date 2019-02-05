import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		
		while (i > 0) {
			System.out.println("Enter a lower bound:");
			int l = input.nextInt();
			input.nextLine();
			
			System.out.println("Enter a upper bound:");
			int u = input.nextInt();
			input.nextLine();
			
			if (l>u) {
				System.out.println("Error: lower bound is not less than or equal to the upper bound.");
			}
			else {
				System.out.println("Numbers between " + l + " and " + u + " are:");
				while (l<=u) {
					System.out.println(l);
					l = l+1;
				}
			}
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String ans = input.nextLine();
			if (ans.equals("Y")) {
				i = i + 1;
			}
			else if (ans.equals("N")){
				i = 0;
			}
	}
		System.out.println("Bye!");
		input.close();
 }
}
