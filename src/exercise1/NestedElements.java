package exercise1;

import java.util.Scanner;

public class NestedElements {
    public static void main(String args[]) {

        //Initialize values we know
        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with current employer");
        double years = scanner.nextDouble();
        scanner.close();

        //make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats");
            } else {
                System.out.println("Sorry you have worked at your current job"
                        + requiredYearsEmployed + "Years");
            }
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify to loan");
        }
    }
}
