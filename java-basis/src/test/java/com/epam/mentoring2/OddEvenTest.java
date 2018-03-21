package com.epam.mentoring2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void isOdd() {
        int number = 7;
        Assert.assertEquals(OddEven.checkNumber(number), "odd");
    }

    @Test
    public void isEven() {
        int number = 10;
        Assert.assertEquals(OddEven.checkNumber(number), "even");
    }
}
