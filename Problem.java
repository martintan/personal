/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.problems.problemC;
import java.util.Arrays;
import java.util.Queue;

/**
 *
 * @author Martin
 */
public class Problem {

    public static void main(String[] args) {
        int[] input = {2,7,1,3,1,4,1,5,9,2,6,5,9,7,3};
        int[] treeValues = new int[3];
        for (int i=0;i<input.length;i++) {
            treeValues[i % 3] = input[i];
            if ((i+1) % 3 == 0) {
                BinaryTree tree = new BinaryTree(treeValues);
                System.out.println(tree.getShape(tree.root));
            }
        }
    }
}
