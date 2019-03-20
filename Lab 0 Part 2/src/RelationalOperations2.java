
public class RelationalOperations2 {

	public static void main(String[] args) {
		int x = 23;
		int y = 23;
		System.out.println("After initiating x to 23 and y to 23:");
		System.out.println("x == y is " + (x == y)); // 23 == 23 -->  true
		System.out.println("x < y is " + (x < y)); // 23 < 23 --> false
		System.out.println("x <= y is " + (x <= y)); // 23 <= 23 --> true
		System.out.println("x >= y is " + (x >= y)); // 23 >= 23 --> true
		System.out.println("x > y is " + (x > y)); // 23 > 23 --> false
		
		System.out.println("After re-assigning x to 56 and y to 89:");
		
		x = 56;
		y = 89;
		System.out.println("x == y is " + (x == y)); // 56 == 89 -->  false
		System.out.println("x < y is " + (x < y)); // 56 < 89 --> true
		System.out.println("x <= y is " + (x <= y)); // 56 <= 89 --> true
		System.out.println("x >= y is " + (x >= y)); // 56 >= 89 --> false
		System.out.println("x > y is " + (x > y)); // 56 > 89 --> false
		
		System.out.println("After re-assigning x to 101 and y to 48:");
		
		x = 101;
		y = 48;
		System.out.println("x == y is " + (x == y)); // 101 == 48 -->  false
		System.out.println("x < y is " + (x < y)); // 101 < 48 --> false
		System.out.println("x <= y is " + (x <= y)); // 101 <= 48 --> false
		System.out.println("x >= y is " + (x >= y)); // 101 >= 48 --> true
		System.out.println("x > y is " + (x > y)); // 101 > 48 --> true

	}

}
