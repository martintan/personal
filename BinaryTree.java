/*
 * ICPC 2016 Problem C: Ceiling Function
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.problems.problemC;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class BinaryTree {
    
    public Node root;

    public BinaryTree(int[] input) {
        Node current = null;
        for (int i=0;i<input.length;i++) {
            current = insert(current, input[i]);
            if (i == 0) root = current;
        }
    }
    
    private Node createNode(int number) {
        return new Node(number);
    }

    private Node insert(Node current, int number) {
        // it will always return the current node
        if (current == null) return createNode(number);
        else {
            if (number <= current.number) current.leftChild = insert(current.leftChild, number);
            else current.rightChild = insert(current.rightChild, number);
            return current;
        }
    }
    
    private void recursiveSearch(Node current) {
    	
    }

    public void search(int number) {

    }
}
