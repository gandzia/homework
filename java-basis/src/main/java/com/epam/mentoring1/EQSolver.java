package com.epam.mentoring1;

public class EQSolver {

    private double x1;
    private double x2;
    String message;

    private double getX1() {
        return x1;
    }

    private void setX1(double x1) {
        this.x1 = x1;
    }

    private double getX2() {
        return x2;
    }

    private void setX2(double x2) {
        this.x2 = x2;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    public EQSolver() {
        setX1(x1);
        setX2(x2);
        setMessage(message);
    }

    public void calculate(double a, double b, double c) {

        if (a == 0) {
            message = "Value of divider is 0!";
        } else {
            double radicand = b * b - 4 * a * c;
            if (radicand < 0) {
                message = "Value under square root is negative!";
            } else {
                x1 = (-b + Math.sqrt(radicand)) / (2 * a);
                x2 = (-b - Math.sqrt(radicand)) / (2 * a);

                message = "x1 and x2 are calculated";
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}

