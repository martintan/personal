/*
 * ICPC 2016 Problem C: Ceiling Function
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.problems.problemC;

import java.util.LinkedList;
import java.util.Queue;

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
    
    public Queue<Integer> getShape(Node node) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	shape(queue, node);
    	return queue;
    }
    
    private Node shape(Queue<Integer> queue, Node node) {
    	if (node != null) {
            if (shape(queue, node.leftChild) != null) queue.add(0);
            if (shape(queue, node.rightChild) != null) queue.add(1);
    	}
    	return node;
    }
    
    public Node retrieve(Node current, int number) {
    	if (current == null) return null;
//          System.out.println("Looking at Node("+ Integer.toString(current.number) +")");
    	if (current.number == number) return current;
            Node lastNode = retrieve(current.leftChild, number);
            if (lastNode == null) lastNode = retrieve(current.rightChild, number);
            return lastNode;
    }
    
    private Node createNode(int number) {
        return new Node(number);
    }

    private Node insert(Node current, int number) {
    	// only insert when there is an available spot
        if (current == null) return createNode(number);
        else {
            if (number < current.number) current.leftChild = insert(current.leftChild, number);
            else current.rightChild = insert(current.rightChild, number);
            return current;
        }
    }
}
