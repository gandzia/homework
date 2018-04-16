package com.epam.module5;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Olha", "Ivanova", "olha@i.ua");
        Person p2 = new Person("Ivan", "Petrov", "ivan@i.ua");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
