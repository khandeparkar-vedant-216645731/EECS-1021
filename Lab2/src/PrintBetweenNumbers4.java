import java.util.Scanner;

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int i = 1;
		
		while (i > 0) {
			System.out.println("Enter a lower bound:");
			int l = input.nextInt();
			input.nextLine();
			int lOut = l;
			
			System.out.println("Enter a upper bound:");
			int u = input.nextInt();
			input.nextLine();
			int uOut = u;
			
			System.out.println("Enter a middle number:");
			int m = input.nextInt();
			input.nextLine();
			int mOut = m;
			
			if (l>u) {
				System.out.println("Error: lower bound " + l + " is not less than or equal to the upper bound " + u);
			}
			else if ((m>u) || (m<l)) {
				System.out.println("Error: middle number " + m + " is not in-between the lower bound " + l + " and upper bound " + u);
			}
			else {
				
				if ((l%2)==0) {
					l = l+1;
				}
				if ((m%2)==1) {
					m = m+1;
				}
				
				System.out.println("Odd numbers between " + lOut + " and " + mOut + " are:");
				while (l<=m) {
					System.out.println(l);
					l = l+2;
				}
				System.out.println("Even numbers between " + mOut + " and " + uOut + " are:");
				while (m<=u) {
				    System.out.println(m);
					m = m+2;	
				}
			}
			
			int x = 1;
            
			while (x>0) {
				System.out.println("Would you like to continue printing? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("Y")) {
					x = 0;
					i = i + 1;
				}
				else if (ans.equals("N")){
					x = 0;
					i = 0;
				}
				else {
					System.out.println("Error: " + ans + " is not valid");
					x = x+1;
				}
			}
	    }
		System.out.println("Bye!");
	
        input.close();
	}

}
