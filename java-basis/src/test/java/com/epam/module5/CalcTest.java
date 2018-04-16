package com.epam.module5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void isAddWorks() {
        int a = 15;
        int b = -2;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.add(a,b), 13, "method 'add' works incorrectly -->");
    }

    @Test
    public void isSubWorks() {
        int a = 15;
        int b = -2;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.sub(a,b), 17, "method 'sub' works incorrectly -->");
    }

    @Test
    public void isDivWorks() {
        int a = 20;
        int b = 2;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.div(a,b), 10.0, "method 'div' works incorrectly -->");
    }

    @Test
    public void isMultWorks() {
        int a = -7;
        int b = 8;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.mult(a,b), -56, "method 'mult' works incorrectly -->");
    }

    @Test
    public void isMemoAddWorks() {
        int a = -7;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.memoAdd(a), -7.0, "method 'memoAdd' works incorrectly -->");
    }

    @Test
    public void isMemoSubWorks() {
        int a = 4;
        CalcBasicOperations result = new CalcBasicOperations();
        Assert.assertEquals(result.memoSub(a), -4.0, "method 'memoSub' works incorrectly -->");
    }

    @Test
    public void isMemoCleanWorks() {
        CalcBasicOperations result = new CalcBasicOperations();
        result.setMemory(12);
        Assert.assertEquals(result.memoClean(), 0.0, "method 'memoClean' works incorrectly -->");
    }
}
