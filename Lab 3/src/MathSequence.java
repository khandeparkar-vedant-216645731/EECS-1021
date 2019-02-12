import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		
		while (x>0) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1. Generate an arithmetic sequence.");
			System.out.println("2. Generate a geometric sequence.");
			System.out.println("3. Determine an arithmetic sequence.");

			int task = input.nextInt();
			input.nextLine();
			
			if (task < 1 || task > 3) {
				System.out.println("Error: task number must be 1, 2 or 3.");

			}
			else if (task == 1){
				System.out.println("Enter the first term in the arithmetic sequence:");
				int first = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the common difference in the arithmetic sequence:");
				int cDiff = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the number of terms in the arithmetic sequence:");
	            int nTerms = input.nextInt();
	            input.nextLine();
	            
	            int[] arithmetic = new int[nTerms];
	            
	            int sum = 0;
	            
	            System.out.print("<");
	            
	            for (int i = 0; i < nTerms; i++) {
	            	arithmetic[i] = first + (i) * cDiff;
	            	if (i == nTerms-1) {
	            		System.out.print(arithmetic[i]);
	            	}
	            	else {
	            		System.out.print(arithmetic[i] + ", ");
	            	}
	            	sum = sum + arithmetic[i];
	            }
	            System.out.println(">");
	            System.out.println("Sum of the arithmetic sequence: " + sum);
	            
				System.out.println("Would you like to process another sequence? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("Y")) {
					x = x + 1;
				}
				else {
					x = -1;
				}
			}
			else if (task == 2) {
				System.out.println("Enter the first term in the geometric sequence:");
				int first = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the common ratio in the geometric sequence:");
				int ratio = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the number of terms in the geometric sequence:");
	            int nTerms = input.nextInt();
	            input.nextLine();
	            
	            int[] geometric = new int[nTerms];
	            
	            int sum = 0;
	            
	            System.out.print("<");
	            
	            for (int i = 0; i < nTerms; i++) {
	            	geometric[i] = first; 
	            	first = first * ratio;
	            	if (i == nTerms-1) {
	            		System.out.print(geometric[i]);
	            	}
	            	else {
	            		System.out.print(geometric[i] + ", ");
	            	}
	            	sum = sum + geometric[i];
	            }
	            System.out.println(">");
	            System.out.println("Sum of the ageometric sequence: " + sum);
	            
				System.out.println("Would you like to process another sequence? (Y/N)");
				String ans = input.nextLine();
				if (ans.equals("Y")) {
					x = x + 1;
				}
				else {
					x = -1;
				}
			}
			else {
				int z = 1;
				int sum = 0;
				int[] n = new int[11];
				int possible = 10;
				int amount = 0;
				
				while (z >= 1) {
					for (int i = 0; z > 0; i++) {
						System.out.println("Enter a new number:");
						n[i] = input.nextInt();
						input.nextLine();
						sum = sum + n[i];
						amount = amount + 1;
						System.out.println("You have entered " + amount + " numbers.");
						possible = possible - 1;
						System.out.println("You may still enter " + possible + " numbers.");
						
						if (amount == 10) {
							System.out.println("You have entered the maximum number of numbers!");
							System.out.println("We will start processing your sequence right away.");
							z = -1;
						}
						else {
							System.out.println("Would you like to enter another new number? (Y/N)");
							String ans = input.nextLine();
							if (ans.equals("Y")) {
								z = z + 1;
							}
							else if (ans.equals("N")) {
								if (amount == 1) {
									System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
									z = 0;
								}
								else {
									z = -1;
								}
							}
						}
					}
				}
				while (z < 0) {
					int result = 0;
					int y = 0;
					int[] m = new int[amount];
					System.out.print("<");
				    while (n[y] != 0) {
				    	m[y] = n[y];
				    	if (y == amount-1) {
				    		System.out.print(m[y]);
				    	}
				    	else {
				    		System.out.print(m[y] + ", ");
				    	}
				    	y++;
				    }
				    System.out.print(">");
					int i = 0;
					if (amount == 2) {
						System.out.println(" is an arithmetic sequence with first term " + n[0] + ", common difference " + (n[1]-n[2]) + ", length " + amount + ", and sum " + (n[0]+n[1])); 
						z = 0;
						result = 2;
					}
					else {
						for (i = 0; i < amount-2; i++) {
					    	if (m[i+1]-m[i] == m[i+2]-m[i+1]) {
					    		result = 1;
					    	}
					    	else {
					    		result = 0;
					    	}
					    }
					}
					if (result == 1) {
						System.out.println(" is an arithmetic sequence with first term " + n[0] + ", common difference " + (m[i+1]-m[i]) + ", length " + amount + ", and sum " + sum); 
						z = 0;
					}
					else if (result == 0) {
						System.out.println(" is not an arithmetic sequence");
						z = 0;
					}
				}
					z = 0;
					System.out.println("Would you like to process another sequence? (Y/N)");
					String ans = input.nextLine();
					if (ans.equals("Y")) {
						x = x + 1;
					}
					else if (ans.equals("N")){
						x = -1;
					}
			}
		}
		while (x<0){
			System.out.println("Bye!");
			x = 0;
		}
        input.close();
	}
}
