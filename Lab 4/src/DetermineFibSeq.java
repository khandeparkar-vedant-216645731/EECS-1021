import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int r = 1;
		
		while (r == 1) {
			int[] seq = new int[20];
			int count = 0;
			
			for (int i = 0; i < 20; i++) {
				System.out.println("Enter a positive integer value, or -1 to stop:");
				int a = input.nextInt();
				input.nextLine();
				
				if (a == -1) {
					break;
				}
				else {
					seq[i] = a;
			    }
		    }
			
			for (int i = 0; i < seq.length; i++) {
				if (seq[i] != 0) {
					count = count + 1;
				}
				else {
					break;
				}
			}
			
			int[] isSeq = new int[count];
			
			System.out.print("The sequence you entered <");
			
			for (int i = 0; i < count; i++) {
				isSeq[i] = seq[i];
				if (i == count-1) {
					System.out.println(isSeq[i] + ">");
				}
				else {
					System.out.print(isSeq[i] + ", ");
				}
			
			}
			
			int x = 1;
			int p = 0;
			
			while (x > 0) {
				if (isSeq[0] == 1 && count == 1) {
					p = 1;
				}
				else if (isSeq[0] != 1 && count == 1) {
					p = 0;
				}
			    else if (count == 2 && isSeq[0] == 1 && isSeq[1] == 1) {
					p = 1;
				}
				else if (isSeq[1] != 1) {
					p = 0;
				}
				else {
					for (int i = 2; i <= count-1; i++) {
						if (isSeq[i] == isSeq[i-1] + isSeq[i-2]) {
							p = 1;
						}
						else {
							p = 0;
						}
					}
				}
				x = -1;
			}
			
			if (p == 1) {
				System.out.println("is the first " + count + " numbers in the Fibonacci Sequence.");
			}
			else if (p == 0) {
				System.out.println("is not the first " + count + " numbers in the Fibonacci Sequence.");
			}
			
			while (x < 0) {
				System.out.println("Would you like to try another sequence? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("Y")) {
					r = 1;
					x = 0;
				}
				else {
					System.out.println("Bye!");
					x = 0;
					r = -1;
				}
			}
		}
	    input.close();
    }
}
