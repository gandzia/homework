package com.epam.module5.list;

public class SinglyLinked extends Operations{

    private Element head;
    private Element tail;

    public void add(int data) {
        Element list_el = new Element(data);
        if (tail == null)
        {
            head = list_el;
            tail = list_el;
        } else {
            tail.setNext(list_el);
            tail = list_el;
        }
    }

    public boolean delElementByData(int data)
    {
        if(head == null)
            return false;

        if (head == tail) {
            head = null;
            tail = null;
            return true;
        }

        if (head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Element pointer = head;
        while (pointer.getNext() != null) {
            if (pointer.getNext().getData() == data) {
                if(tail == pointer.getNext())
                {
                    tail = pointer;
                }
                pointer.setNext(pointer.getNext().getNext());
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }

    public boolean delElementByIndex(int index)
    {
        if(head == null)
            return false;

        if (index == 0 & head == tail) {
            head = null;
            tail = null;
            return true;
        }

        if (index == 0) {
            head = head.getNext();
            return true;
        }

        Element pointer = head;
        int curr_index = 0;
        while (pointer.getNext() != null) {
            if (curr_index + 1 == index) {
                if(tail == pointer.getNext())
                {
                    tail = pointer;
                }
                pointer.setNext(pointer.getNext().getNext());
                return true;
            }
            pointer = pointer.getNext();
            curr_index++;
        }
        return false;
    }

    public void makeDoublyLinked() {
        Element pointer = head;
        while (pointer != null) {
            if (pointer.getNext() != null){
                pointer.getNext().setPrev(pointer);
            }
            pointer = pointer.getNext();
        }
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }
}
