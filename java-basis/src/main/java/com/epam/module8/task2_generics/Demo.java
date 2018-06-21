package com.epam.module8.task2_generics;

//Перепишите класс связного списка задания 3 модуля 5 таким образом, чтобы он мог хранить любые данные.
//При выполнении задания используйте обобщённое программирование (generics).

public class Demo {
    public static void main(String[] args) {
        ListOperations my_list = new ListOperations();
        my_list.<Integer>add(1);
        my_list.<String>add("slovo");
        my_list.<Boolean>add(true);

        System.out.println("Singly Linked List:");
        ListOperations.printList(my_list.getHead());
        System.out.println();
    }
}
