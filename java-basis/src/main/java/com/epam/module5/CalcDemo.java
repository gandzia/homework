package com.epam.module5;

public class CalcDemo {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        CalcBasicOperations res = new CalcBasicOperations();
        System.out.println("a + b = " + res.add(a,b));
        System.out.println("a - b = " + res.sub(a,b));
        System.out.println("memory = " + res.getMemory());
        res.memoAdd(res.sub(a,b));
        System.out.println("M+ = " + res.getMemory());
        System.out.println("a / b = " + res.div(a,b));
        System.out.println("memory = " + res.getMemory());
        res.memoSub(res.div(a,b));
        System.out.println("M- = " + res.getMemory());
        System.out.println("a * b = " + res.mult(a,b));
        System.out.println("memory = " + res.getMemory());
        res.memoClean();
        System.out.println("MC = " + res.getMemory());
    }
}
