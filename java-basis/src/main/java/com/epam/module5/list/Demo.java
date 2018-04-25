package com.epam.module5.list;

public class Demo {
    public static void main (String[] args) {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(1);
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(4);
        my_list.add(5);
        my_list.add(6);

        System.out.println("Singly Linked List before:");
        Operations.printList(my_list.getHead());
        System.out.println();

        my_list.delElementByData(1);
        System.out.println("Deleted element with value '1':");
        Operations.printList(my_list.getHead());
        System.out.println();
        my_list.delElementByIndex(5);
        System.out.println("Deleted element on position '5':");
        Operations.printList(my_list.getHead());
        System.out.println();

        DoublyLinked double_list = new DoublyLinked();
        Operations.copyToDoublyLinked(my_list, double_list);
        System.out.println("Singly Linked List copied to Doubly Linked List:");
        Operations.printList(double_list.getD_head());
        System.out.println();
        my_list.makeDoublyLinked();
        System.out.println("Singly Linked List modified to Doubly Linked List and printed from tail:");
        Operations.printListFromTail(my_list.getTail());
    }
}
