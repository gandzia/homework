package com.epam.module8.task3_search;

public class Passport {

    private String serie;
    private Integer number;

    public Passport(String serie, Integer number) {

        setSerie(serie);
        setNumber(number);
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSerie() {
        return serie;
    }

    public Integer getNumber() {
        return number;
    }
}