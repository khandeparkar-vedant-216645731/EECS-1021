import java.util.Scanner;

public class IfStatementApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Read input from user and return the absolute value
		
		System.out.println("Enter and integer");
		int i = input.nextInt();
		int abs = i;
		if (i < 0) {
			// abs = -i;
			abs = abs * -1;
		}
		System.out.println("The absolute value for " + i + " is: " + abs);	
		
        input.close();
	}

}
