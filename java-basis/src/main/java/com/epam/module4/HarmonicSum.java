package com.epam.module4;

public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double harmonic = 1;

        for (int i = 2; i <= n; i++){
            harmonic = harmonic + (double)1/i;
        }
        System.out.println("Harmonic = " + harmonic);
    }
}
