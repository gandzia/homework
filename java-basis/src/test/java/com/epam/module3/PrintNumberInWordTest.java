package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintNumberInWordTest {

    @Test
    public void isWordRight() {
        Assert.assertEquals(PrintNumberInWord.numberInWord(5), "FIVE");
        Assert.assertEquals(PrintNumberInWord.numberInWord(15), "OTHER");
    }
}