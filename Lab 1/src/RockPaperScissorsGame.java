import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int winsP1 = 0;
		int winsP2 = 0;
		
		System.out.println("Enter the name of player 1:");
		String player1 = input.nextLine();
		
		System.out.println("Enter the name of player 2:");
		String player2 = input.nextLine();
		
		System.out.println("========");
		System.out.println("Round 1");
		System.out.println("========");
		
		System.out.println("What does " + player1 + " play? (R, P or S)");
		String R1P1 = input.nextLine();
		
		System.out.println("What does " + player2 + " play? (R, P or S)");
		String R1P2 = input.nextLine();
		
		if (R1P1.equals("R") && R1P2.equals("S") || (R1P1.equals("S") && R1P2.equals("P")) || (R1P1.equals("P") && R1P2.equals("R"))) {
			winsP1 = winsP1 + 1;
		}
		else if (R1P2.equals("R") && R1P1.equals("S") || (R1P2.equals("S") && R1P1.equals("P")) || (R1P2.equals("P") && R1P1.equals("R"))) {
			winsP2 = winsP2 + 1;
		}
		else 
			winsP1 = winsP1 + 0;
		    winsP2 = winsP2 + 0;
		
		System.out.println("========");
		System.out.println("Round 2");
		System.out.println("========");
		
		System.out.println("What does " + player1 + " play? (R, P or S)");
		String R2P1 = input.nextLine();
		
		System.out.println("What does " + player2 + " play? (R, P or S)");
		String R2P2 = input.nextLine();
		
		if (R2P1.equals("R") && R2P2.equals("S") || (R2P1.equals("S") && R2P2.equals("P")) || (R2P1.equals("P") && R2P2.equals("R"))) {
			winsP1 = winsP1 + 1;
		}
		else if (R2P2.equals("R") && R2P1.equals("S") || (R2P2.equals("S") && R2P1.equals("P")) || (R2P2.equals("P") && R2P1.equals("R"))) {
			winsP2 = winsP2 + 1;
		}
		else {
			winsP1 = winsP1 + 0;
		    winsP2 = winsP2 + 0;
		}
		
		if (winsP1 == 2) {
			System.out.println("Game over : " + player1 + " wins!");
		}
		else if (winsP2 == 2) {
			System.out.println("Game over : " + player2 + " wins!");
		}
		else {	
			System.out.println("========");
			System.out.println("Round 3");
			System.out.println("========");
			
			System.out.println("What does " + player1 + " play? (R, P or S)");
			String R3P1 = input.nextLine();
			
			System.out.println("What does " + player2 + " play? (R, P or S)");
			String R3P2 = input.nextLine();
			
			if (R3P1.equals("R") && R3P2.equals("S") || (R3P1.equals("S") && R3P2.equals("P")) || (R3P1.equals("P") && R3P2.equals("R"))) {
				winsP1 = winsP1 + 1;
			}
			else if (R3P2.equals("R") && R3P1.equals("S") || (R3P2.equals("S") && R3P1.equals("P")) || (R3P2.equals("P") && R3P1.equals("R"))) {
				winsP2 = winsP2 + 1;
			}
			else {
				winsP1 = winsP1 + 0;
			    winsP2 = winsP2 + 0;
		}	
			
		   if ((winsP1 > winsP2) || (winsP2 > winsP1)) {
			  if (winsP1 > winsP2) {
				 System.out.println("Game over: " + player1 + " wins!");
			  }
			  else {
				  System.out.println("Game over: " + player2 + " wins!");
			   }
			 }
		   else {
			   System.out.println("Game over: a tie between " + player1 + " and " + player2);
		  }
	   }	
    input.close();
	}
}
