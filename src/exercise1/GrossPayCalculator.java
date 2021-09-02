package exercise1;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        //Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // get the hourly pay rate
        System.out.println("Enter the employees; pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours and pay rate
        double grossPay = hours * rate;

        //Display the result
        System.out.println("Display the result");
        System.out.println(grossPay);

    }
}