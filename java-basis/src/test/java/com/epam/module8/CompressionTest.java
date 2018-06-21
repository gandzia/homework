package com.epam.module8;

import com.epam.module8.task1_compression.Compression;
import com.epam.module8.task1_compression.Unpacking;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompressionTest {

    @Test
    public void endsOnDigit_pack() {
        String s1 = "Helloooo5";
        Compression string1 = new Compression(s1);
        Assert.assertEquals(string1.pack(), "Hel2o451", "pack: wrong result if one digit at the end of string -->");
    }

    @Test
    public void endsOnLetter_pack() {
        String s2 = "Heeeeeeeeeeelo";
        Compression string2 = new Compression(s2);
        Assert.assertEquals(string2.pack(), "He9e2lo", "pack: wrong result if one letter at the end of string -->");
    }

    @Test
    public void bigSmallLetters_pack() {
        String s3 = "Hhhhell1p";
        Compression string3 = new Compression(s3);
        Assert.assertEquals(string3.pack(), "Hh3el211p", "pack: wrong result if string contains big letters next to the same small ones -->");
    }

    @Test
    public void endsOnSeveralSameDigits_pack() {
        String s4 = "He111";
        Compression string4 = new Compression(s4);
        Assert.assertEquals(string4.pack(), "He13", "pack: wrong result if several same digits are at the end of string -->");
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