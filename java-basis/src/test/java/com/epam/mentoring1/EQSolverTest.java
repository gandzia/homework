package com.epam.mentoring1;

import org.testng.annotations.Test;

public class EQSolverTest {

    @Test
    public void isError(){
        InputData inputs = new InputData(2, -16.3, 9.1);
        EQSolver calc1 = new EQSolver();
        calc1.calculate(inputs.a, inputs.b, inputs.c);
        System.out.println(calc1.message);
    }

}
