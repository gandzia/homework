package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindNumberTest {

    @Test
    public void isPositionRight() {
        int[] arr = {1, 2, 3, 3, 4, 15, 21, 42, 48, 72};
        AbstractSort.printArray(arr, "");
        FindNumber.findNumber(arr, 4);
        Assert.assertEquals(FindNumber.getPos(), 4);

        FindNumber.findNumber(arr, -5);
        Assert.assertEquals(FindNumber.getPos(), 11);
    }
}
