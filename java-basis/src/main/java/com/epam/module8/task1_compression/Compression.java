package com.epam.module8.task1_compression;

public class Compression {
    private static final int MAX_DIGIT = 9;
    static char symb = '!';
    static int count = 1;
    static boolean isLastReached = false;
    static String stringToPack = "";
    static String packedString = "";

    public Compression(String initialString) {
        this.stringToPack = initialString;
        this.packedString = "";

    }

    public static String pack() {

        int newI;
        for (int i = 0; i < stringToPack.length() - 1; i++) {
            symb = stringToPack.charAt(i);
            newI = numberOfRepeatsAndChangeI(i);
            if (i != newI)
                i = newI;
            newI = writeDigitOrCharNumberTimesAndChangeI(i);
            if (i != newI)
                i = newI;
        }
        lastElementProcessing();
        return (packedString);
    }

    private static int numberOfRepeatsAndChangeI(int i2) {
        for (int j = i2 + 1; symb == stringToPack.charAt(j); j++) {
            count++;
            if (count == MAX_DIGIT)
                break;
            if (j == stringToPack.length() - 1) {
                isLastReached = true;
                i2 = i2 - 1;
                break;
            }
        }
        return i2;
    }

    private static int writeDigitOrCharNumberTimesAndChangeI(int i2) {
        if (count == 1) {
            if (Character.isDigit(symb)) {
                packedString = packedString + symb + '1';
            } else
                packedString = packedString + symb;
        } else {
            packedString = packedString + symb + count;
            i2 = i2 + count - 1;
            if ((i2 != stringToPack.length() - 1 & isLastReached == false) | (i2 == stringToPack.length() - 1 & isLastReached == false))
                count = 1;
        }
        return i2;
    }

    private static void lastElementProcessing() {
        if (count == 1) {
            if (Character.isDigit(stringToPack.charAt(stringToPack.length() - 1)))
                packedString = packedString + stringToPack.charAt(stringToPack.length() - 1) + '1';
            else
                packedString = packedString + stringToPack.charAt(stringToPack.length() - 1);
        }
    }
}