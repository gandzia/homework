package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTest {

    @Test
    public void isArraySortedBubbleSort() {
        int[] arr = {2, 48};
        AbstractSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
        int[] sortedArr = bubbleSort.getArrayFromAbstract();
        Assert.assertEquals(sortedArr[0], -3, "BubbleSort: Array is not sorted -->");
    }

    @Test
    public void isArraySortedQuickSort() {
        int[] arr2 = {-5, 31, -13, 22, 21, 0, 7, 84, 4, 45};
        AbstractSort quickSort = new QuickSort(arr2);
        quickSort.sort();
        int[] sortedArr = quickSort.getArrayFromAbstract();
        Assert.assertEquals(sortedArr[0], -13, "QuickSort: Array is not sorted -->");
    }

    @Test
    public void isArrayEmpty() {
        int[] arr = {};
        boolean empty;
        if (arr.length == 0) empty = true;
        else empty = false;
        Assert.assertFalse(empty, "Array is empty -->");
    }

    @Test
    public void isArrayInteger() {
        String[] arr = {"a", "b", "c"};
        Assert.assertEquals(arr.getClass().getComponentType().toString(), "int", "Array is not integer -->");
    }
}
