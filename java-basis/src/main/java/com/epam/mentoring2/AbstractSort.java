package com.epam.mentoring2;

public abstract class AbstractSort {
    int[] arrayFromAbstract;

    public int[] getArrayFromAbstract() {
        return arrayFromAbstract;
    }

    public AbstractSort(int[] input) {
        this.arrayFromAbstract = input;
    }

    public abstract void sort();

    public static void printArray(int[] arr, String text) {
        System.out.println("Array " + text + " sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printInReverseOrder(int[] arr) {
        System.out.println("Array in reverse order: ");
        int i = arr.length - 1;
        while (i >= 0){
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();
    }
}
