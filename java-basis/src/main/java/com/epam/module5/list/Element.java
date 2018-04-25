package com.epam.module5.list;

public class Element {
    private Element next;
    private Element prev;
    private int data;

    public Element(int data) {
        this.data = data;
    }

    public void setNext(Element next_el) {
        this.next = next_el;
    }

    public void setPrev(Element prev_el) {
        this.prev = prev_el;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrev() { return prev; }

    public int getData() {
        return data;
    }
}
