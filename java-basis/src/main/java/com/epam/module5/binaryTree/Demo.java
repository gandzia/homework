package com.epam.module5.binaryTree;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes in the tree:");
        int r = sc.nextInt();
        System.out.println("Enter nodes (int with space like '1 2 3'). The first number will be the root:");
        for (int i = 0; i < r; i++) {
            theTree.addNode(sc.nextInt());
        }

        System.out.println("Enter number to search:");
        r = sc.nextInt();
        sc.close();
        if (theTree.searchInOrder(theTree.root, r))
            System.out.println("The number was found in the tree");
        else
            System.out.println("The number was NOT found in the tree");

        System.out.println("Traversal of the tree by type In-Order:");
        theTree.inOrderTraverseTree(theTree.root);
        System.out.println();

        System.out.println("Traversal of the tree by type Pre-Order:");
        theTree.preOrderTraverseTree(theTree.root);
    }
}
