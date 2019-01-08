
public class SwapTwoStringsWrong {

	public static void main(String[] args) {

	   String person1 = "Alan";
       String person2 = "Tom";
       System.out.println("Before the Swap:");
       System.out.println("Person 1 is " + person1 + " and Person 2 is " + person2 + ".");
       
       // you want to swap person1 and person2
       // Incorrect Implementation
       
       person1 = person2;
       person2 = person1;
       
       System.out.println("After the Swap:");
	   System.out.println("Person 1 is " + person1 + " and Person 2 is " + person2 + ".");
	}

}
