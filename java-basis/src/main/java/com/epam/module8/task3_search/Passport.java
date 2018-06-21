package com.epam.module8.task3_search;

public class Passport {
    final String SERIE;
    final Integer NUMBER;

    public Passport(String serie, Integer number) {
        this.SERIE = serie;
        this.NUMBER = number;
    }

    public String getSerie() {
        return SERIE;
    }

    public Integer getNumber() {
        return NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (!SERIE.equals(passport.SERIE)) return false;
        return NUMBER.equals(passport.NUMBER);
    }

    @Override
    public int hashCode() {
        int result = SERIE.hashCode();
        result = 31 * result + NUMBER.hashCode();
        return result;
    }
}