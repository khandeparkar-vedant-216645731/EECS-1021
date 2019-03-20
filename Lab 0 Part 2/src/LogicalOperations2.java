
public class LogicalOperations2 {

	public static void main(String[] args) {
		
		System.out.println("Method 1:");
		boolean p = false;
		boolean q = false;
		boolean conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p||q));
		
		System.out.println("Method 2:");
		p = false;
		q = true;
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));
		
		System.out.println("Method 3:");
		p = true;
		q = false;
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));
		
		System.out.println("Method 2:");
		p = true;
		q = true;
		// You must also change the value of conjunction as it is a variable that stores the result of (p && q)
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));
		
	}

}
