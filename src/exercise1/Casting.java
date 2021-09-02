package exercise1;

public class Casting {
    public static void main(String[] args) {
        int z;
        z = 3;
        double x = z; //widening
        int v = (int) x; //narrowing

        System.out.println("Valoarea ta este: " + z);
        System.out.println("Valoarea ta este: " + x);
        System.out.println("Valoarea ta este: " + v);

        /*Java Type Casting
        Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        Widening Casting
        Widening casting is done automatically when passing a smaller size type to a larger size type:
         */
    }
}
