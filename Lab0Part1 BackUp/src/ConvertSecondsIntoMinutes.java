import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		System.out.println("Enter an integer for seconds");
		int seconds = input.nextInt();
		input.nextLine();
		
		int minutes = seconds/60;
		int secs = seconds%60;
		
		System.out.println(name + ", your input " + seconds + " seconds can be divided into " + minutes + " minutes and " + secs + " seconds.");
		
		
        input.close();
	}

}
