import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st String:");
		String a = input.nextLine();
		
		System.out.println("Enter the 2nd String:");
		String b = input.nextLine();
		
		System.out.println("Enter the 3rd String:");
		String c = input.nextLine();
		
		System.out.println("Enter the 4th String:");
		String d = input.nextLine();
		
		System.out.println("Enter the 1st Integer:");
		int q = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd Integer:");
		int r = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd Integer:");
		int s = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th Integer:");
		int t = input.nextInt();
		input.nextLine();
		
		System.out.println("Here are all 16 possible combinations:");
		System.out.println("(" + a + ", " + q + ")");
		System.out.println("(" + a + ", " + r + ")");
		System.out.println("(" + a + ", " + s + ")");
		System.out.println("(" + a + ", " + t + ")");
		System.out.println("(" + b + ", " + q + ")");
		System.out.println("(" + b + ", " + r + ")");
		System.out.println("(" + b + ", " + s + ")");
		System.out.println("(" + b + ", " + t + ")");
		System.out.println("(" + c + ", " + q + ")");
		System.out.println("(" + c + ", " + r + ")");
		System.out.println("(" + c + ", " + s + ")");
		System.out.println("(" + c + ", " + t + ")");
		System.out.println("(" + d + ", " + q + ")");
		System.out.println("(" + d + ", " + r + ")");
		System.out.println("(" + d + ", " + s + ")");
		System.out.println("(" + d + ", " + t + ")");
		
        input.close();
	}

}
