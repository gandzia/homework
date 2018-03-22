package com.epam.module4;

public class ComputePI {
    public double getMyPI() {
        return myPI;
    }

    static double myPI = 4;
    public static double calcPI() {
        for (int i = 3; i <= 500000; i = i + 4) {
            myPI = myPI - (double) 4 / i + (double) 4 / (i + 2);
        }

        System.out.print("      Math.PI = " + Math.PI + " == ");
        System.out.format("%.10f%n", Math.PI);
        System.out.print("Calculated PI = " + myPI  + " == ");
        System.out.format("%.10f%n", myPI);

        double digitsNum = Math.pow(10,2);
        return Math.round(myPI*digitsNum)/digitsNum;
    }
}
