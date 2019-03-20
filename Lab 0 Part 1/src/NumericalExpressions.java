
public class NumericalExpressions {

// This is a comment and is not executed by the computer
	
	public static void main(String[] args) {
		/* Math vs. (-->) Java 
		 * + --> + (addition)
		 * - --> - (subtraction)
		 * x --> * (multiplication)
		 * --> / (division)
		 * quotient --> / (strictly integer divided by integer)
		 * remainder --> % (modulo operation)
		 */
		 
		System.out.println(15+4); // 15 + 4 = 19
		
		System.out.println(15-4); // 15 - 4 = 11
		
		System.out.println(15*4); // 15 * 4 = 60
		
		System.out.println(15/4); // 15 / 4 = 3 --> both are integers so we will get the quotient
		
		System.out.println(15%4); // 15 % 4 = 3
		
		System.out.println(23/4); // 23 / 4 = 5
		
		System.out.println(23%4); // 23 % 4 = 3
		
		// 4 * (23 / 4) + (23 % 4) = 23
		System.out.println(4 * (23 / 4) + (23 % 4));
		
		// System.out.println("1" * "1"); --> this is not correct
		System.out.println("1 + 1"); // will print 1 + 1
		System.out.println(1 + 1); // will print 2
		
		System.out.println(5.0/2.5); // 2.0 : gives result with degree of precision of the inputs provided
		System.out.println(5.2/2); // 2.6
		

	}

}
