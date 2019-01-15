import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your height in inches:");
		int inches = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", enter your weight in pounds:");
		int pounds = input.nextInt();
		input.nextLine();
		
		double height = inches/39.3700787402;
		double weight = pounds/2.2046226;
		
		double bmi = (weight)/(height*height);
		
		System.out.println(name + ", your BMI is " + bmi);
		
		if (bmi<18.5 && bmi>0) {
			System.out.println("You are underweight!");
		}
		else if (bmi>=18.5 && bmi<25.0) {
			System.out.println("You are normal!");
		}
		else if (bmi>=25.0 && bmi<30.0) {
			System.out.println("You are overweight!");
		}
		else {
			System.out.println("You are obese!");
		}
		
		input.close();

	}

}
