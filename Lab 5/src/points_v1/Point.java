package points_v1;

// This class is a template for 2 dimensional points.
// At runtime, we may instantiate as many 2-D point instances as we wish.

public class Point {
	
	// Attributes: class-level variables.
	// The scope of attributes are every method in the current class.
	
	double x; // typically you do not initialize the attributes here.
	double y; 
	
	// Constructors: "methods" for constructing new instances of Point
	// Note: Here we are DEFINING constructors.
	// Rule: Name of the constructor must be the SAME as the class name.
	
	
	// VERSION 1: Create a new point using two values for x and y.
	Point(double newX, double newY) {
		x = newX;
		y = newY;
		// newX = x; not right: you should never re-assign input parameter
	}
	
	// VERSION 2: Create a new Point either along the x axis or along the y axis.
	// Assumption: axis can either be 'x' or 'y'.
	Point(char axis, double distance){
		if (axis == 'x') {
			x = distance;
			y = 0;
		}
		else {
			x = 0;
			y = distance;
		}
	}
	
	// Adding these two versions of constructors will give a compile-time error.
	// Because from the compiler's point of view, both are expecting a single double value.
	// So when you call Point(3.4), it is confused as to which version to call.
	// Hence the compile-time error.
	
	
	// Point(double distacnceFromXAxis) {	
	// }
	
	// Point(double distanceFromYAxis) {	
	// }
	 

}
