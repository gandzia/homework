package com.epam.module3;


public class DemoSort {
    public static void main(String[] args) {
        System.out.println(">>>>>>> Bubble Sort: <<<<<<<");
        int[] arr = {2, 48, -3, 15, 21, 1, 3, 72, 4, 42};
        AbstractSort.printArray(arr, "before sorting");
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
        AbstractSort.printArray(arr, "after sorting");
        AbstractSort.printInReverseOrder(arr);

        System.out.println();
        System.out.println(">>>>>>> Quick Sort: <<<<<<<");
        int[] arr2 = {-5, 31, -13, 22, 21, 0, 7, 84, 4, 45};
        AbstractSort.printArray(arr2, "before sorting");
        QuickSort quickSort = new QuickSort(arr2);
        quickSort.sort();
        AbstractSort.printArray(arr2, "after sorting");
    }

}
