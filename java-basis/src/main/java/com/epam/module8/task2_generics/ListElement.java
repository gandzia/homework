package com.epam.module8.task2_generics;

public class ListElement<T> {
    private ListElement next;
    private T data;

    public ListElement(T data) {
        this.data = data;
    }

    public void setNext(ListElement next_el) {
        this.next = next_el;
    }

    public ListElement getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}
