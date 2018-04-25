package com.epam.module5.list;

public class Operations {
    public static void printList(Element list_head)
    {
        Element pointer = list_head;
        while (pointer != null)
        {
            System.out.print(pointer.getData() + " ");
            pointer = pointer.getNext();
        }
    }

    public static void printListFromTail(Element list_tail)
    {
        Element pointer = list_tail;
        while (pointer != null)
        {
            System.out.print(pointer.getData() + " ");
            pointer = pointer.getPrev();
        }
    }

    public static void copyToDoublyLinked(SinglyLinked single_list, DoublyLinked double_list) {
        Element s_pointer = single_list.getHead();
        while (s_pointer != null) {
            double_list.add(s_pointer.getData());
            s_pointer = s_pointer.getNext();
        }
    }
}
