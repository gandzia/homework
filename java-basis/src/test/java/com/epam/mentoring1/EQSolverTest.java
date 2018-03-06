package com.epam.mentoring1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.mentoring1.InputData.inputData;

public class EQSolverTest {

    @Test
    public void isDividerZero(){
        List<Double> enteredValues = inputData();

        Assert.assertTrue(enteredValues.get(0)==0, "Value of divider is 0!");
    }

    @Test
    public void isRadicandNegative(){
        List<Double> enteredValues = inputData();

        Assert.assertTrue((enteredValues.get(1)*enteredValues.get(1)-4*enteredValues.get(0)*enteredValues.get(2)) < 0, "Value under square root is negative!");
    }

    @Test
    public void fff(){
        System.out.println("hello");
    }

}
