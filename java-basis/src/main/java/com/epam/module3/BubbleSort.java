package com.epam.module3;

public class BubbleSort extends AbstractSort{
    public BubbleSort(int[] input){
        super(input);
    }

    @Override
    public void sort(){
        int tmp;
        for (int i = arrayFromAbstract.length - 1; i >= 2; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayFromAbstract[j] > arrayFromAbstract[j + 1]) {
                    tmp = arrayFromAbstract[j];
                    arrayFromAbstract[j] = arrayFromAbstract[j + 1];
                    arrayFromAbstract[j + 1] = tmp;
                }
            }
        }
    }
}
