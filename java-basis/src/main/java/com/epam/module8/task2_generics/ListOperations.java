package com.epam.module8.task2_generics;

public class ListOperations {

    private ListElement head;
    private ListElement tail;

    public <T> void add(T data) {
        ListElement<T> list_el = new ListElement(data);
        if (tail == null) {
            head = list_el;
            tail = list_el;
        } else {
            tail.setNext(list_el);
            tail = list_el;
        }
    }

    public static void printList(ListElement list_head) {
        ListElement pointer = list_head;
        while (pointer != null) {
            System.out.print(pointer.getData() + " ");
            pointer = pointer.getNext();
        }
    }

    public ListElement getHead() {
        return head;
    }
}