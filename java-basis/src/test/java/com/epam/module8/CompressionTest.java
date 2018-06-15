package com.epam.module8;

import com.epam.module8.task1_compression.Compression;
import com.epam.module8.task1_compression.Unpacking;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompressionTest {

    @Test
    public void endsOnDigit_pack() {
        String s1 = "Helloooo5";
        Assert.assertEquals(Compression.pack(s1), "Hel2o451", "pack: wrong result if one digit at the end of string -->");
    }

    @Test
    public void endsOnLetter_pack() {
        String s2 = "Heeeeeeeeeeelo";
        Assert.assertEquals(Compression.pack(s2), "He9e2lo", "pack: wrong result if one letter at the end of string -->");
    }

    @Test
    public void bigSmallLetters_pack() {
        String s3 = "Hhhhell1p";
        Assert.assertEquals(Compression.pack(s3), "Hh3el211p", "pack: wrong result if string contains big letters next to the same small ones -->");
    }

    @Test
    public void endsOnSeveralSameDigits_pack() {
        String s4 = "He111";
        Assert.assertEquals(Compression.pack(s4), "He13", "pack: wrong result if several same digits are at the end of string -->");
    }

    @Test
    public void endsOnDigit_unpack() {
        String s1 = "Hel2o451";
        Assert.assertEquals(Unpacking.unpack(s1), "Helloooo5", "unpack: wrong result if several same digits are at the end of string -->");
    }

    @Test
    public void endsOnLetter_unpack() {
        String s2 = "He9e2lo";
        Assert.assertEquals(Unpacking.unpack(s2), "Heeeeeeeeeeelo", "unpack: wrong result if several same digits are at the end of string -->");
    }

    @Test
    public void bigSmallLetters_unpack() {
        String s3 = "Hh3el211p";
        Assert.assertEquals(Unpacking.unpack(s3), "Hhhhell1p", "unpack: wrong result if several same digits are at the end of string -->");
    }

    @Test
    public void endsOnSeveralSameDigits_unpack() {
        String s4 = "He13";
        Assert.assertEquals(Unpacking.unpack(s4), "He111", "unpack: wrong result if several same digits are at the end of string -->");
    }
}