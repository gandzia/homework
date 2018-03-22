package com.epam.module4;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        double av;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        av = sum / 100;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + av);
    }
}
