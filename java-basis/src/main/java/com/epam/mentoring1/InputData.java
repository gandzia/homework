package com.epam.mentoring1;

import org.testng.Assert;
import java.util.Scanner;

public class InputData {

    double a;
    double b;
    double c;

    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    private void setC(double c) {
        this.c = c;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    public InputData(double a, double b, double c) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter number a: ");
//        setA(reader.nextDouble());
//
//        System.out.print("Enter number b: ");
//        setB(reader.nextDouble());
//
//        System.out.print("Enter number c: ");
//        setC(reader.nextDouble());
//        System.out.println();
//        reader.close();
        setA(a);
        setB(b);
        setC(c);

    }
}