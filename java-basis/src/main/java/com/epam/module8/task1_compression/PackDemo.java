package com.epam.module8.task1_compression;

import com.epam.module8.task1_compression.Compression;

public class PackDemo {
    public static void main(String[] args) {
        String s1 = "Helloooo5"; //--> Hel2o451
        String s2 = "Heeeeeeeeeeelo"; //--> He9e2lo
        String s3 = "Hhhhell1p"; //--> Hh3el211p
        String s4 = "He111"; //--> He13
        System.out.println("before compression: " + s1);
        System.out.println("compressed:" + Compression.pack(s1));
        System.out.println("before compression: " + s2);
        System.out.println("compressed:" + Compression.pack(s2));
        System.out.println("before compression: " + s3);
        System.out.println("compressed:" + Compression.pack(s3));
        System.out.println("before compression: " + s4);
        System.out.println("compressed:" + Compression.pack(s4));
        System.out.println();

        System.out.println("before unpack: " + "Hel2o451");
        System.out.println("unpacked:" + Unpacking.unpack("Hel2o451"));
        System.out.println("before unpack: " + "He9e2lo");
        System.out.println("unpacked:" + Unpacking.unpack("He9e2lo"));
        System.out.println("before unpack: " + "Hh3el211p");
        System.out.println("unpacked:" + Unpacking.unpack("Hh3el211p"));
        System.out.println("before unpack: " + "He13");
        System.out.println("unpacked:" + Unpacking.unpack("He13"));
    }
}
