package points_v1;

public class PointTester {

	public static void main(String[] args) {
		// Create point objects.
		// This is where we call or use the constructor.
		
		Point p1 = new Point(3, -4); // calling the 1st version of constructor.
		Point p2 = new Point(-2, -7); // calling the 1st version of constructor.
		Point p3 = new Point('y', 8); // calling the 2nd version of constructor.
		Point p4 = new Point('x', -5); // calling the 2nd version of constructor.
	
	    System.out.println(p1); // prints out psuedo-address
	    System.out.println(p2);
	    System.out.println("p1 and p2 store different addresses: " + (p1 != p2));
	    System.out.println("p1 and p2 store the same address: " + (p1 == p2));
	    System.out.println(p3);
	    System.out.println(p4);
	}

}
