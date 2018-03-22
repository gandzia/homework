package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTest {

    @Test
    public void isArraySorted() {
        int[] arr = {2, 48, -3, 15, 21, 1, 3, 72, 4, 42};
        AbstractSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
        int[] sortedArr = bubbleSort.getArrayFromAbstract();
        Assert.assertEquals(sortedArr[0], -3);

        int[] arr2 = {-5, 31, -13, 22, 21, 0, 7, 84, 4, 45};
        AbstractSort quickSort = new QuickSort(arr2);
        quickSort.sort();
        sortedArr = quickSort.getArrayFromAbstract();
        Assert.assertEquals(sortedArr[0], -13);
    }
}
