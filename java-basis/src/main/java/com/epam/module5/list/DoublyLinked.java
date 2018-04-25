package com.epam.module5.list;

public class DoublyLinked extends Operations{

    private Element d_head;
    private Element d_tail;

    public void add(int data) {
        Element list_el = new Element(data);
        if (d_tail == null) {
            d_head = list_el;
            d_tail = list_el;
        } else {
            d_tail.setNext(list_el);
            list_el.setPrev(d_tail);
            d_tail = list_el;
        }
    }

    public Element getD_head() {
        return d_head;
    }
}
