package com.plurasight.CompareNumbers;

public class Java {
    public static void main(String[] args) {
        // creating method
        System.out.println( isEven(5));
        System.out.println( isEven(8));

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {


            return true;

        }
        else {
            return false;
        }
    }
}
