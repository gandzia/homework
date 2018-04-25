package com.epam.module5;

import com.epam.module5.list.SinglyLinked;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListTest {

    @Test
    public void deleteInEmptyList_byData() {
        SinglyLinked my_list = new SinglyLinked();
        boolean isDeleted = my_list.delElementByData(1);
        Assert.assertEquals(isDeleted, false, "method 'delElementByData' works incorrectly with empty list -->");
    }

    @Test
    public void deleteNonexistentListElement_byData() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteNonexistentListElement (by data) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByData(1);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, false, "method 'delElementByData' works incorrectly with notexistent list element -->");
    }

    @Test
    public void deleteFirstListElement_byData() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteFirstListElement (by data) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByData(2);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByData' works incorrectly with first list element -->");
    }

    @Test
    public void deleteLastListElement_byData() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteLastListElement (by data) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByData(3);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByData' works incorrectly with last list element -->");
    }

    @Test
    public void deleteMiddleListElement_byData() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteMiddleListElement (by data) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByData(2);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByData' works incorrectly with middle list element -->");
    }

    @Test
    public void deleteInEmptyList_byIndex() {
        SinglyLinked my_list = new SinglyLinked();
        boolean isDeleted = my_list.delElementByIndex(1);
        Assert.assertEquals(isDeleted, false, "method 'delElementByIndex' works incorrectly with empty list -->");
    }

    @Test
    public void deleteNonexistentListElement_byIndex() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteNonexistentListElement (by index) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByIndex(5);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, false, "method 'delElementByIndex' works incorrectly with notexistent list element -->");
    }

    @Test
    public void deleteFirstListElement_byIndex() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteFirstListElement (by index) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByIndex(0);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByIndex' works incorrectly with first list element -->");
    }

    @Test
    public void deleteLastListElement_byIndex() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        System.out.println("<<< deleteLastListElement (by index) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByIndex(2);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByIndex' works incorrectly with last list element -->");
    }

    @Test
    public void deleteMiddleListElement_byIndex() {
        SinglyLinked my_list = new SinglyLinked();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(4);
        System.out.println("<<< deleteMiddleListElement (by index) >>>");
        System.out.print("List before: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        boolean isDeleted = my_list.delElementByIndex(2);
        System.out.print("List  after: ");
        my_list.printList(my_list.getHead());
        System.out.println();
        Assert.assertEquals(isDeleted, true, "method 'delElementByIndex' works incorrectly with middle list element -->");
    }
}
