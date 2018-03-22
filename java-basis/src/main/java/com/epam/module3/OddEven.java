package com.epam.module3;

import java.util.Scanner;

public class OddEven {

    public static int enterNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = reader.nextInt();
        reader.close();
        return num;
    }

    public static String checkNumber(int num) {
        if (num % 2 != 0) {
            System.out.println("Odd Number");
            return "odd";
        } else {
            System.out.println("Even Number");
            return "even";
        }
    }
}
