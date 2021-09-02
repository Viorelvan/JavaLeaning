package exercise1;

import java.util.Scanner;

public class SalaryPay {
    public static void main(String[] args) {

        //Initiate known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }
        //Output
        System.out.println("Total employee salary is " + salary);

    }
}