/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemC;

/**
 *
 * @author Martin
 */
public class ProblemC {

    public static void main(String[] args) {
        int[] sampleInput = {1,2,3,4,5};
        BinaryTree tree = new BinaryTree(sampleInput);
//        System.out.println(tree.root.number);
        Node testNode = new Node(0);
        testNode.rightChild = new Node(6);
        tree.root.leftChild = testNode;
        System.out.println(tree.retrieve(tree.root, 5).number);
    }
}
