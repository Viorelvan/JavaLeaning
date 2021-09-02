package exercise1;

public class Variables {
    public static void main(String[] args) {
        int x, y, z;
        double n = 5.5;
        float m = 5.4f;
        char f = 'F';
        String k = "ABC";
        long u = -5856985878L;
        boolean a = true;

        x = 1;
        y = 2;
        z = 3;

        System.out.println("Valoarea ta este: " + x + y + z);
        System.out.println("Valoarea ta este: " + u * n);
        System.out.println("Valoarea ta este: " + n + m);

        /*Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte,
 short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types:
float and double.

Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not
defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later
chapter.
         */
    }
}
