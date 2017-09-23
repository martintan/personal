import java.util.Random;

public class ProblemC {
	
    public static void main(String[] args) {
//    	Random random = new Random();
    	int[] sampleInput = {
    			5,2,3,1,2,9,
    			3,7,1,5,6,7,
    			1,4,9,5,3
    	};
        SearchTree tree = new SearchTree(sampleInput, 5, 3);
    }
    
    // helper function
    public static int randomRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) - min;
    }
}
