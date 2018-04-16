package com.epam.module5;

public class CalcBasicOperations {

    private double memory;

    public static int add(int a, int b){
        return (a + b);
    }
    public static int sub(int a, int b){
        return (a - b);
    }
    public static double div(int a, int b){
        return (a / b);
    }
    public static int mult(int a, int b){
        return (a * b);
    }
    public double memoAdd(double a){
        setMemory(getMemory() + a);
        return (memory);
    }
    public double memoSub(double a){
        setMemory(getMemory() - a);
        return (memory);
    }
    public double memoClean(){
        setMemory(0);
        return (memory);
    }

    public double getMemory() {
        return memory;
    }
    public void setMemory(double memory) {
        this.memory = memory;
    }
}