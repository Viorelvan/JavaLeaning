package exercise1;

public class Operators {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(x < 5 && x < 10);
        System.out.println(x < 5 && x < 1);
        System.out.println(x < 5 || x < 1);
        System.out.println(!(x < 5 && x < 10));
        System.out.println(!(x < 1 && x < 1));

/*Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators*/
    }
}
