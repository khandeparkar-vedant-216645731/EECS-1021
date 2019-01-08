
public class StringExpressions {

	public static void main(String[] args) {
		System.out.println("We have various attempts to calculate the average between 5 and 2.");
		
		System.out.print("(5 + 2 / 2) ");
		System.out.print("is ");
		System.out.println(5 + 2 / 2); // incorrect output --> 6
		
		System.out.println("((5 + 2) / 2) is " + (5 + 2) / 2); // incorrect output --> 3
		// the '+' performs a concatenation between the string literal and the number literal
		
		System.out.println("((5 + 2) / 2.0) is " + (5 + 2) / 2.0); // correct output --> 3.5 (make either side a double)
		
		System.out.println("Lassonde School of Engineering");
		System.out.println("Lassonde" + " " + "School" + " " + "of" + " " + "Engineering");
		
		System.out.println("Expreiment with concatenating (1 + 1): " + (1 + 1));
		System.out.println("Expreiment with concatenating 1 + 1: " + 1 + 1);

	}
}
