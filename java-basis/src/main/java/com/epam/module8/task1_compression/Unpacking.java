package com.epam.module8.task1_compression;

public class Unpacking {
    public static String unpack(String packedString) {
        String unpackedString = "";
        char symb;
        int count;
        for (int i = 0; i <= packedString.length() - 1; i++) {
            symb = packedString.charAt(i);
            if (i == packedString.length() - 1) {
                unpackedString = unpackedString + symb;
            } else {
                if (Character.isDigit(packedString.charAt(i + 1))) {
                    count = Character.getNumericValue(packedString.charAt(i + 1));
                    if (count == 1 & Character.isLetter(packedString.charAt(i))) {
                        unpackedString = unpackedString + symb;
                    } else {
                        for (int j = 1; j <= count; j++) {
                            unpackedString = unpackedString + symb;
                        }
                        i++;
                    }
                } else {
                    unpackedString = unpackedString + symb;
                }
            }
        }

        return (unpackedString);
    }
}
