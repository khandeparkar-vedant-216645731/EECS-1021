import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 1 (out of 100)?");
        int q1 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 2 (out of 100)?");
        int q2 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 3 (out of 100)?");
        int q3 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 4 (out of 100)?");
        int q4 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 5 (out of 100)?");
        int q5 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 6 (out of 100)?");
        int q6 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 7 (out of 100)?");
        int q7 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 8 (out of 100)?");
        int q8 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Quiz 9 (out of 100)?");
        int q9 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 1 (out of 100)?");
        int a1 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 2 (out of 100)?");
        int a2 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 3 (out of 100)?");
        int a3 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 4 (out of 100)?");
        int a4 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 5 (out of 100)?");
        int a5 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 6 (out of 100)?");
        int a6 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 7 (out of 100)?");
        int a7 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 8 (out of 100)?");
        int a8 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 9 (out of 100)?");
        int a9 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Assignment 10 (out of 100)?");
        int a10 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Lab Test 1 (out of 100)?");
        int lt1 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Lab Test 2 (out of 100)?");
        int lt2 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your score for Lab Test 3 (out of 100)?");
        int lt3 = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your midterm score (out of 100)?");
        int mid = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", what is your final exam score (out of 100)?");
        int finalExam = input.nextInt();
        input.nextLine();
        
        System.out.println(name + ", which course are you talking about?");
        String course = input.nextLine();
        
        System.out.println(name + ", here is your grading report for " + course + ":");
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Quiz 1: " + q1);
        System.out.println("Quiz 2: " + q2);
        System.out.println("Quiz 3: " + q3);
        System.out.println("Quiz 4: " + q4);
        System.out.println("Quiz 5: " + q5);
        System.out.println("Quiz 6: " + q6);
        System.out.println("Quiz 7: " + q7);
        System.out.println("Quiz 8: " + q8);
        System.out.println("Quiz 9: " + q9);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Assignment 1: " + a1);
        System.out.println("Assignment 2: " + a2);
        System.out.println("Assignment 3: " + a3);
        System.out.println("Assignment 4: " + a4);
        System.out.println("Assignment 5: " + a5);
        System.out.println("Assignment 6: " + a6);
        System.out.println("Assignment 7: " + a7);
        System.out.println("Assignment 8: " + a8);
        System.out.println("Assignment 9: " + a9);
        System.out.println("Assignment 10: " + a10);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Lab Test 1: " + lt1);
        System.out.println("Lab Test 2: " + lt2);
        System.out.println("Lab Test 3: " + lt3);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Midterm Test: " + mid);
        System.out.println("Final Exam: " + finalExam);
        
        System.out.println("-------------------------------------------");
        
        int quizAverage = (q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9)/9;
        int assignmentAverage = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10)/10;
        int labTestAverage = (lt1 + lt2 + lt3)/3;
        
        double wQuizAverage = ((q1*0.18) + (q2*0.18) + (q3*0.18) + (q4*0.18) + (q5*0.18) + (q6*0.18) + (q7*0.18) + (q8*0.18) + (q9*0.18))/9;
        double wAssignmentAverage = ((a1*0.2) + (a2*0.2) + (a3*0.2) + (a4*0.2) + (a5*0.2) + (a6*0.2) + (a7*0.2) + (a8*0.2) + (a9*0.2) + (a10*0.2))/10;
        double wLabTestAverage = ((lt1*0.12) + (lt2*0.12) + (lt3*0.12))/3;
        double wMid = (mid*0.15);
        double wFinal = (finalExam*0.35);
        double finalRawMarks = ((wQuizAverage) + (wAssignmentAverage) + (wLabTestAverage) + (wMid) + (wFinal));
        
        System.out.println("Average of quizzes: " + quizAverage);
        System.out.println("Average of assignments: " + assignmentAverage);
        System.out.println("Average of lab tests: " + labTestAverage);
        System.out.println("Final raw marks " + finalRawMarks);
		
		input.close();
	}

}
