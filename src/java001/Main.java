package java001;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");


//DataTypes in Java
        int num = 10;
        float num2 = 20.25f;
        char ch = 'A';
        boolean bool = true;
        String str = "This is java data types";
        double d = 20.26578d;
        short sr = 234;
        long lng = 23560989;

// Typecasting
        int myInt = 100;
        System.out.println(myInt);
        double myDouble = myInt;

        double myDouble2 = 10.25d;
        int newInt = (int) myDouble2;
    //Operators
        //Arithmetic Operators
        //Assignment Operators
        //Comparison Operators
        //Logical Operators
        //Bitwise Operators

        //Arithmetic Operators
//        +, -, *, /, %, ++, --
        //Assignment Operators
//        =, +=, -=, /=, %=, |=, <<=, >>=, ^=
        //Comparison Operators
//        ==, != (not equal to), >, <, >=, <=
        //Logical Operators
//        &&, ||, !
        //Bitwise Operators
//        0 = true, 1 = false

        //Java String
        String stri = "hello World";
        System.out.println("hello World is " + stri.length() + "long");
        System.out.println(stri.toUpperCase());
        System.out.println(stri.toLowerCase());
        System.out.println(stri.indexOf("W"));
        //Concatenation
        System.out.println(stri + "" + str);
        System.out.println(stri.concat(str));
        //The second one, you cannot add a space if it is not in the original code.
        String strin = "10";
        int string = 10;
        System.out.println(string+string);
        System.out.println(strin+strin);


        String text = "we are learning \"Java\" in class for Automation.";
        System.out.println(text);

        String text2 = "it's alright";  //declared
        System.out.println(text2);      //calling


        //Math
        int numberOne = 7;
        int numberTwo = 10;
        System.out.println("addition:" + numberOne +"+" + numberTwo + "=" + (numberOne+numberTwo));
        System.out.println("subtraction:" + numberOne + "-" + numberTwo + "=" + (numberOne-numberTwo));
        System.out.println("multiplication:" + numberOne + "*" + numberTwo + "=" + (numberOne*numberTwo));
        System.out.println("division:" + numberOne + "/" + numberTwo + "=" + (numberOne/numberTwo));
        System.out.println("modulus" + numberOne + "%" + numberTwo + "=" + (numberOne%numberTwo));
        System.out.println(Math.min(7,10));
        System.out.println(Math.max(7,10));
        System.out.println(Math.sqrt(625));
        System.out.println(Math.sqrt(789+749));

        //Homework!!
        //All String methods
        //All Math methods
        //Java homework is always next day (so this is due 5.18
        //Just do the 28 that are pasted in the Google document for String, and ones for Math

        //HOMEWORK!
        String greetings = "Hello World!";
        System.out.println(greetings.charAt(3));
        String returns = "Hola World!";
        System.out.println(returns.length());
        String today = "Good morning";
        int result =
                today.codePointAt (0);
        System.out.println(result);
        System.out.println(today.codePointBefore(1));
        System.out.println(greetings.codePointCount(0,5));
        System.out.println(greetings.compareTo(returns));
        System.out.println(returns.compareToIgnoreCase(today));
        System.out.println(today.concat(greetings));
        System.out.println(today.contains("morn"));
        System.out.println(returns.contentEquals("World"));
        greetings = greetings.copyValueOf(new char[]{'H'},0, 5);
        System.out.println("Returned String: " + greetings);








    }
    public boolean sleepIn (boolean weekday, boolean vacation){
        if(!weekday && vacation) {
            return true;
        }
        if (vacation = true) {
            return true;
        } else {
            return false;
        }
    }



}

