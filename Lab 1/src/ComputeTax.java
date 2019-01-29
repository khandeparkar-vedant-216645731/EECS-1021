import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your filing status (1 - Single Filing; 2 - Married Filing)");
		int status = input.nextInt();
		input.nextLine();
		
		if (status < 1 || status > 2) {
			System.out.println("Illegal status: " + status);
		}
		else if (status == 1) {
			System.out.println(name + ", enter your taxable income:");
			double income = input.nextDouble();
			input.nextLine();
			if (income > 0 && income <= 8350) {
				double payment1 = (0.1)*(income);
				double part1 = payment1;
				System.out.println(name + ", you should pay $" + payment1);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: " + part1);
			}
			else if (income > 8350 && income <= 33950) {
				double part1 = (0.1)*8350;
				double part2 = (0.15)*(income-8350);
				double payment2 = part1 + part2;
				System.out.println(name + ", you should pay $" + payment2);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: " + part1);
				System.out.println("Part II: " + part2);
			}
			else {
				double part1 = (0.1)*8350;
				double part2 = (0.15)*(33950-8350);
				double part3 = (0.25)*(income-(33950));
				double payment3 = part1 + part2 + part3;
				System.out.println(name + ", you should pay $" + payment3);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: " + part1);
				System.out.println("Part II: " + part2);
				System.out.println("Part II: " + part3);
			}
		}
		else {
			System.out.println(name + ", enter your taxable income:");
			double income = input.nextDouble();
			input.nextLine();
			if (income > 0 && income <= 16700) {
				double payment4 = (0.1)*income;
				double part1 = payment4;
				System.out.println(name + ", you should pay $" + payment4);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: " + part1);
			}
			else if (income > 16700 && income <= 67900) {
				double part1 = (0.1)*16700;
				double part2 = (0.15)*(income-16700);
				double payment5 = part1 + part2;
				System.out.println(name + ", you should pay $" + payment5);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: " + part1);
				System.out.println("Part II: " + part2);
			}
			else {
				double part1 = (0.1)*16700;
				double part2 = (0.15)*(67900-16700);
				double part3 = (0.25)*(income-(67900));
				double payment6 = part1 + part2 + part3;
				System.out.println(name + ", you should pay $" + payment6);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: " + part1);
				System.out.println("Part II: " + part2);
				System.out.println("Part II: " + part3);
		}
	}
	input.close();
  }
}
