package exercise1;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXY";
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("K"));

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        String txt2 = "We are the so-called \\Vikings\\ from the north.";
        String txt3 = "We are the so-called \'Vikings\' from the north.";
        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);

        String txt4 = "We are the so-called \n from the north.";
        String txt5 = "We are the so-called \r from the north.";
        String txt6 = "We are the so-called \t from the north.";
        String txt7 = "We are the so-called \b from the north.";
        String txt8 = "We are the so-called \f from the north.";
        System.out.println(txt4);
        System.out.println(txt5);
        System.out.println(txt6);
        System.out.println(txt7);
    }
}
