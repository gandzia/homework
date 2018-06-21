package com.epam.module8.task3_search;

//Используйте классы задания 2 модуля 5 для реализации задачи поиска человека по паспортным данным.
//Предусмотрите новый класс Passport в котором будут серия и номер паспорта (серия типа String, номер типа Integer).
//Создайте несколько экземпляров Passport и Person для установления связи между ними используйте HashMap<Passport, Person>
//Для поиска создайте новый экземпляр Passport в который внесите заведомо существующие данные (совпадающие с данными
//Passport на предыдущем шаге), проверьте поведение приложения если паспортные данные внесены с ошибкой.
//Обратите внимание на поведение HashMap в случае если Passport не имеет методов hashCode и equals

import com.epam.module5.Person;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person("Olha", "Ivanova", "olha@i.ua");
        Person person2 = new Person("Ivan", "Petrov", "ivan@i.ua");
        Passport passport1 = new Passport("CO", 123456);
        Passport passport2 = new Passport("CH", 987654);
        Passport passport_to_find = new Passport("CO", 123456);

        Map<Person, Passport> people = new HashMap<Person, Passport>();
        people.put(person1, passport1);
        people.put(person2, passport2);

        System.out.println("Does Map contain " + passport_to_find.getSerie() + passport_to_find.getNumber() + "?");
        boolean isFound = false;

        if (people.get(person1).getSerie().matches(passport_to_find.getSerie()) & (people.get(person1).getNumber().toString().matches(passport_to_find.getNumber().toString())))
            isFound = true;
        System.out.println(isFound);
//я не розумію чому наступний рядок повертає false:
        System.out.println("Verification via equals(): " + (people.get(person1)).equals(passport_to_find));
    }
}