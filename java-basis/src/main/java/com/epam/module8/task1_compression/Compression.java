package com.epam.module8.task1_compression;

public class Compression {
    public static String pack(String initialString) {
        String packedString = "";
        char symb = '!';
        int count = 1;
        boolean isLastReached = false;
        for (int i = 0; i < initialString.length() - 1; i++) {
            symb = initialString.charAt(i);
            for (int j = i + 1; symb == initialString.charAt(j); j++) {
                count++;
                if (count == 9)
                    break;
                if (j == initialString.length() - 1) {
                    isLastReached = true;
                    i = i - 1;
                    break;
                }
            }
            if (count == 1) {
                if (Character.isDigit(symb)) {
                    packedString = packedString + symb + '1';
                } else
                    packedString = packedString + symb;
            } else {
                packedString = packedString + symb + count;
                i = i + count - 1;
                if ((i != initialString.length() - 1 & isLastReached == false) | (i == initialString.length() - 1 & isLastReached == false))
                    count = 1;
            }
        }
        //processing of the last element:
        if (count == 1) {
            if (Character.isDigit(initialString.charAt(initialString.length() - 1)))
                packedString = packedString + initialString.charAt(initialString.length() - 1) + '1';
            else
                packedString = packedString + initialString.charAt(initialString.length() - 1);
        }
        return (packedString);
    }
}