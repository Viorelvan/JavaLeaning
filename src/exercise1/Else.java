package exercise1;

import java.util.Scanner;

public class Else {
    public static void main(String args[]) {

        //Initialize values we know
        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales you made this");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on the path to take - Output
        if (sales >= quota) {
            System.out.println("Congrats");
        } else {
            int diff = quota - sales;
            System.out.println(" :( " + " Only " + diff);
        }

    }
}