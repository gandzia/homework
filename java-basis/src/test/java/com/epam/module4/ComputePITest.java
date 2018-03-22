package com.epam.module4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputePITest {

    @Test
    public void isCalculatedPI() {
        Assert.assertEquals(ComputePI.calcPI(), 3.14);
    }
}
