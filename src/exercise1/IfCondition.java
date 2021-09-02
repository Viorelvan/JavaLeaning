package exercise1;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;

        if (x < y) {
            System.out.println("X este mai mic ca Y");
        } else {
            System.out.println("Valoarea X este mai mare ca Y");
        }
        System.out.println("Introdu valoarea pentru Z");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        scanner.close();

        if (x < z) {
            System.out.println("X este mai mic ca Z");
        }
        else if(z==x){
            System.out.println("Valoarea X = Z");
        }
        else {
            System.out.println("Valoarea X este mai mare ca Z");
        }
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int n = 10;
        String result2 = (n < 18) ? "Valoarea este mai mica ca 18." : "Valoarea este mai mica ca 18.";
        System.out.println(result2);

    }
}
