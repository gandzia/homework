package com.epam.module8.task1_compression;

//Осуществить сжатие английского текста, заменив каждую группу из двух или более рядом стоящих символов, на один символ,
//за которым следует количество его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.
//В случае если в тексте будет присутствовать цифра в единичном экземпляре перед ней необходимо поставить цифру 1.
//Например, строка He4lo будет преобразована в He14lo
//Также если количество повторений будет превышать 9 используйте несколько повторений.
//Например, строка heloooooooooo будет преобразована в hel9oo. Строка heloooooоooooo будет преобразована в  hel9o2o
//Реализуйте возможность распаковки текста, сжатого по этому правилу. В случае если распаковка не возможна метод
//распаковки должен выбросить checked exception.

public class PackDemo {
    public static void main(String[] args) {
        String s1 = "Helloooo5"; //--> Hel2o451
        String s2 = "Heeeeeeeeeeelo"; //--> He9e2lo
        String s3 = "Hhhhell1p"; //--> Hh3el211p
        String s4 = "He111"; //--> He13
        System.out.println("before compression: " + s1);
        Compression string1 = new Compression(s1);
        System.out.println("compressed:" + string1.pack());
        System.out.println("before compression: " + s2);
        Compression string2 = new Compression(s2);
        System.out.println("compressed:" + string2.pack());
        System.out.println("before compression: " + s3);
        Compression string3 = new Compression(s3);
        System.out.println("compressed:" + string3.pack());
        System.out.println("before compression: " + s4);
        Compression string4 = new Compression(s4);
        System.out.println("compressed:" + string4.pack());
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
