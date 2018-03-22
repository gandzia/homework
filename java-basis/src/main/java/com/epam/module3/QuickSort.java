package com.epam.module3;

public class QuickSort extends AbstractSort{
    public QuickSort(int[] input){
        super(input);
    }

    @Override
    public void sort(){
        int startIndex = 0;
        int endIndex = arrayFromAbstract.length - 1;
        doSort(startIndex, endIndex);
    }

    private void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arrayFromAbstract[i] <= arrayFromAbstract[cur])) {
                i++;
            }
            while (j > cur && (arrayFromAbstract[cur] <= arrayFromAbstract[j])) {
                j--;
            }
            if (i < j) {
                int temp = arrayFromAbstract[i];
                arrayFromAbstract[i] = arrayFromAbstract[j];
                arrayFromAbstract[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
}