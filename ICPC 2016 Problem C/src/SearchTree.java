import java.util.Random;

/*
 * 
 * ICPC 2016 Problem 3
 * Identify and group binary search tree "shapes"
 * 
 */


public class SearchTree {
	
	public static void main(String[] args) {
//		SearchTree searchTree = new SearchTree();
		
		int randNumber = randomRange(1, 50);
		int layers = randomRange(1, 20);
		
	}
	
	public class Node {
		int number;
		Node leftChild;
		Node rightChild;
	}
	
	public void search(int value) {
		
	}
	
	private static int randomRange(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}
}
