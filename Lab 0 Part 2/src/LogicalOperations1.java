
public class LogicalOperations1 {

	public static void main(String[] args) {
		
		/*  There are 3 logical operators for you to
		 *  combine relational operations (each of which evaluating to true or false)
		 *  1. Logical negation (not the case / opposite) --> !
		 *  2. Logical conjunction (and / both scenarios should be true) --> &&
		 *  3. Logical Disjunction (or / either scenario must be true) --> ||
		 */
		
		boolean p = true;
		boolean negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + negation);
		p = false;
		negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + negation);


	}

}
