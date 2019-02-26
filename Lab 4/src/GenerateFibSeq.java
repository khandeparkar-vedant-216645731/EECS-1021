import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		
		while (x > 0) {
			System.out.println("Enter the size of Fibonacci Sequence:");	
			int size = input.nextInt();
			input.nextLine();
			if (size <= 0) {
				System.out.println("Error: Fibonacci Sequence must have size >= 1");
				x = -1;
				
				System.out.println("Would you like to continue? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("N")) {
					System.out.println("Bye!");
					x = 0;
				}
				else if (ans.equals("Y")) {
					x = 1;
			    }
			} 
			else {
				int p1 = 1;
				int p2 = 0;
				int y = 0;
				System.out.println("Fibonacci Sequence of size " + size + ":");
				System.out.print("<1, ");
				for (int i = 0; i < size - 1; i++) {
					if (i == size - 2) {
						y = p1 + p2;
						System.out.println(y + ">");
						x = -1;
					}
					else {
						y = p1 + p2;
						System.out.print(y + ", ");
					}
					p2 = p1;
					p1 = y;
				}
				
				System.out.println("Would you like to continue? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("N")) {
					System.out.println("Bye!");
					x = 0;
				}
				else if (ans.equals("Y")) {
					x = 1;
			    }
		    }
		}
        input.close();
	}
}
