package com.epam.mentoring1;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
//    public static double a, b, c;

    public static List<Double> inputData (){
        double a, b, c;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number a: ");
        a = reader.nextDouble();

        System.out.print("Enter number b: ");
        b = reader.nextDouble();

        System.out.print("Enter number c: ");
        c = reader.nextDouble();
        System.out.println();
        reader.close();

        List<Double> enteredValues = new ArrayList<Double>();
        enteredValues.add(a);
        enteredValues.add(b);
        enteredValues.add(c);

        return enteredValues;
    }
}