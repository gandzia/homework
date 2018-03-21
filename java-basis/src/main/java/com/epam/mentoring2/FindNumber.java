package com.epam.mentoring2;

import java.util.Scanner;

public class FindNumber {
    public static int getPos() {
        return pos;
    }

    static int pos;

    public static int enterNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter integer number to find: ");
        int el = reader.nextInt();
        reader.close();
        return el;
    }

    public static void findNumber(int[] arr, int el) {

        boolean not_found = true;
        int right_pos, left_pos, mid_pos;
        pos = 11;
        left_pos = 0;
        right_pos = arr.length - 1;

        while (not_found) {
            if (left_pos > right_pos) {
                break;
            }
            mid_pos = left_pos + (right_pos - left_pos) / 2;
            if (arr[mid_pos] < el) {
                left_pos = mid_pos + 1;
            }
            if (arr[mid_pos] > el) {
                right_pos = mid_pos - 1;
            }
            if (arr[mid_pos] == el) {
                pos = mid_pos;
                not_found = false;
            }
        }
        if (not_found) {
            System.out.println("Element " + el + " not found");
        } else {
            System.out.println("Element " + el + " found on position " + pos);
        }
    }
}
