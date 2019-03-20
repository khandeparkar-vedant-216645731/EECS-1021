
public class SwapXAndY {

	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		System.out.println("Before the swap:");
		System.out.println("x = " + x + " and y = " + y);
		
		// Code for Swap
		int temp = x;
	    x = y;
	    y = temp;
	    System.out.println("After the swap:");
		System.out.println("x = " + x + " and y = " + y);
		
	}

}
