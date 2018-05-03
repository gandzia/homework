package com.epam.module5.binaryTree;

public class BinaryTree {

    Node root;
    boolean found = false;

    //if value is less then parent - it is placed as left child, if more - as right one
    public void addNode(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.getValue()) {
                    focusNode = focusNode.getLeftChild();
                    if (focusNode == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }

                } else {
                    focusNode = focusNode.getRightChild();
                    if (focusNode == null) {
                        parent.setRightChild(newNode);
                        return;
                    }

                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.getLeftChild());
            System.out.print(focusNode);
            inOrderTraverseTree(focusNode.getRightChild());
        }
    }

    public boolean searchInOrder(Node focusNode, int value) {

        if (focusNode != null) {
            searchInOrder(focusNode.getLeftChild(), value);
            if (focusNode.getValue() == value) found = true;
            searchInOrder(focusNode.getRightChild(), value);
        }
        return found;
    }

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.print(focusNode);
            preOrderTraverseTree(focusNode.getLeftChild());
            preOrderTraverseTree(focusNode.getRightChild());
        }
    }
}
