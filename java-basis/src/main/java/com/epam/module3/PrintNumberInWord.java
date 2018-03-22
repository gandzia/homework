package com.epam.module3;

import java.util.Scanner;

public class PrintNumberInWord {

    public static int enterNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter integer number from 1 to 9: ");
        int number = reader.nextInt();
        reader.close();
        return number;
    }

    public static String numberInWord(int num) {

        String word;

        switch (num) {
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;
        }
        System.out.println(word);
        return word;
    }
}
