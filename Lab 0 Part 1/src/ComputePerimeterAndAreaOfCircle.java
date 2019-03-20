import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius:");
		double r = input.nextDouble();
		input.nextLine();
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		double area = 3.14*(r*r);
		double perimeter = 2*3.14*r;
		
		System.out.println(name + ", your input circle with radius " + r + " has perimeter " + perimeter + " and area " + area);
		
        input.close();
	}

}
