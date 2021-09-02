package exercise1;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        //Get the score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'D';
        } else {
            grade = 'A';
        }
        System.out.println("Your Grade is " + grade);
    }
}