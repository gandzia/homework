package com.epam.mentoring1;

import java.util.List;

import static com.epam.mentoring1.EQSolver.calculate;
import static com.epam.mentoring1.InputData.inputData;

public class EQSolverMain {
    public static void main(String[] args) {
        List<Double> enteredValues = inputData();
        System.out.println("a=" + enteredValues.get(0));
        System.out.println("b=" + enteredValues.get(1));
        System.out.println("c=" + enteredValues.get(2));
        calculate(enteredValues.get(0), enteredValues.get(1), enteredValues.get(2));
//calculate(5, -22, 3.3);
    }

}
