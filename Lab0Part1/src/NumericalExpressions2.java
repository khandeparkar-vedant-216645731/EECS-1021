public class NumericalExpressions2 {

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
		 
		System.out.println("(15 + 4) = " + (15+4)); // 15 + 4 = 19
		
		System.out.println("(15 - 4) = " + (15-4)); // 15 - 4 = 11
		
		System.out.println("(15 * 4) = " + (15*4)); // 15 * 4 = 60
		
		System.out.println("15 / 4 gives the quotient = " + (15/4)); // 15 / 4 = 3 --> both are integers so we will get the quotient
		
		System.out.println("15 % 4 gives the remainder = " + (15%4)); // 15 % 4 = 3
		
		System.out.println("23 / 4 gives the quotient = " + (23/4)); // 23 / 4 = 5
		
		System.out.println("23 % 4 gives the remainder = " + (23%4)); // 23 % 4 = 3
		
		// 4 * (23 / 4) + (23 % 4) = 23
		System.out.println("divisor * quotient + reaminder = original number = " + (4 * (23 / 4) + (23 % 4)));
		
		// System.out.println("1" * "1"); --> this is not correct
		System.out.println("Output 1 + 1 ver batim = " + "1 + 1"); // will print 1 + 1
		System.out.println("Output the result of ca1culating 1 + 1 = " + (1 + 1)); // will print 2
		
		System.out.println("5.0 / 2.5 gives a result with precision = " + (5.0/2.5)); // 2.0 : gives result with degree of precision of the inputs provided
		System.out.println("5.2 / 2 gives a result with precision = " + (5.2/2)); // 2.6
		

	}

}
