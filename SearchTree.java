import java.util.ArrayList;
import java.util.Random;

public class SearchTree {
	
	private int[] input;
	private int amountOfTrees;
	private int amountOfLayers;
	private ArrayList<Node> tree;
	
	public SearchTree(int[] input, int amountOfTrees, int amountOfLayers) {
		this.input = input;
		this.amountOfTrees = amountOfTrees;
		this.amountOfLayers = amountOfLayers;
		this.createTree();
	}

    private void createTree() {
    	tree = new ArrayList<>();
    	for (int i=0;i<amountOfTrees;i++) {
    		
    		Node current = new Node();
    		for (int j=0;j<amountOfLayers;i++) {
    			int number = input[amountOfLayers*i + j];
    			if (number > current.Number) {
    				current.leftChild = new Node();
    				current = current.leftChild;
    			}
    			else if (number < current.Number) {
    				current.rightChild = new Node();
    				current = current.rightChild;
    			}
    			else {
    				current.Number = number;
    			}
    		}
    	}
    }
    
    private void recursiveNode(Node current) {
    	
    }

    public void search(int number) {

    }
}
