
public class IntegerArray1 {

	public static void main(String[] args) {
		
		// For any given array:
		// 1. Indices always start with 0
		// 2. The size of the array is the last index value +1
		// 3. All elements are of the same type
		
		// APPROACH 2: Array Initializer Notation (Comma Separated Values)
		// Version 1:
		int[] ia = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		System.out.println("The size of the array \"ia\": " + ia.length);
		System.out.println("First index of the array ia: " + "0");
		System.out.println("Last index of the array is: " + (ia.length - 1));

		
        //  System.out.println("Element of ia at index 0: " + ia[0]);
        //	System.out.println("Element of ia at index 1: " + ia[1]);
        //	System.out.println("Element of ia at index 2: " + ia[2]);
        //	System.out.println("Element of ia at index 3: " + ia[3]);
        //	System.out.println("Element of ia at index 4: " + ia[4]);
        //	System.out.println("Element of ia at index 5: " + ia[5]);
        //	System.out.println("Element of ia at index 6: " + ia[6]);
        //	System.out.println("Element of ia at index 7: " + ia[7]);
        //	System.out.println("Element of ia at index 8: " + ia[8]);
        //	System.out.println("Element of ia at index 9: " + ia[9]); // is[is.length-1]
		
		
		// Constraint on the Array Initializer Notation:
		// You cannot re-assign an array using an initializer
		
		// Not possible to do this when you use Initializer Notation:
		// ia = {940, 880, 830, 790, 750, 660, 650, 590, 510};
		
		
		// Version 2.1 of using an array to print out all elements in ia:
		// This version illustrates a common mistake that causes ArrayIndexOutOfBoundExecption
		//  for (int i = 0; i <= 9; i++) {
	    //    System.out.println("Element of ia at index " + i + ": " + ia[i]);
		//  }
		
		// Version 2.2 of using an array to print out all elements in ia:
		//  for (int i = 0; i <= ia.length-1; i++) {
		//    System.out.println("Element of ia at index " + i + ": " + ia[i]);
		//  }
		
		// Version 2.3 of using an array to print out all elements in ia:
		for (int i = 0; i < ia.length; i++) {
			System.out.println("Element of ia at index " + i + ": " + ia[i]);
		}
		
	}

}
