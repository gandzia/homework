package com.epam.module5;

public class Person {
    private String name;
    private String surname;
    private String email;

    public Person(String name, String surname, String email) {
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'';
    }
}
