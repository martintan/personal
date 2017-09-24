/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.problems.problemC;

/**
 *
 * @author Martin
 */
public class Problem {

    public static void main(String[] args) {
        int[] sampleInput = {1,2,3,4,5};
        BinaryTree tree = new BinaryTree(sampleInput);
//        System.out.println(tree.root.number);
        System.out.println(tree.retrieve(tree.root, 5));
    }
}
