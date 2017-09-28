import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sorting {
	
	public static void main(String[] args) {
		int [] arr = getRandomArray(500);
//		System.out.println("input: " + Arrays.toString(arr));
		Sorting s = new Sorting();
		
		// Bubble sort
//		long startTime = System.nanoTime();
//		s.bubbleSort(arr);
//		System.out.println("Bubble Sort: " + Arrays.toString(arr));
//		double time = ((double)(System.nanoTime() - startTime)) / (double)1000000;
//		System.out.println("Bubble Sort took " + time + " milliseconds.");
		
		// Multiplying matrices
		int[][] mArr1 = {
				{6,3,0},
				{2,5,1},
				{9,8,6},
		};
		int[][] mArr2 = {
				{7,4},
				{6,7},
				{5,0},
		};
		int[][] result = s.multiplyMatrices(mArr1, mArr2);
		for (int[] row : result) System.out.println(Arrays.toString(row));
		
	}

	public int[][] multiplyMatrices(int[][] arr1, int[][] arr2) {
		if (arr1[0].length != arr2.length) return null;
		int[][] result = new int[arr1.length][arr2[0].length]; // result = matrix [n rows of arr1] [n columns of arr2]
		int result_row = 0, result_col = 0;
		int x = 0, y = 0;
		for (int i=0;i<arr1.length;i++) {
			System.out.println("iteration " + i);
			int m = 0;
			for (int j=0;j<arr1[0].length;j++) {
				m += arr1[i][j] * arr2[y][x];
				y++;
			}
			x++;
			System.out.println(m);
			result[result_row][result_col] = m;
			if (result_col > result_row) {
				result_row++;
				result_col = 0;
			} else result_col++;
		}
		return result;
	}
	
	public void bubbleSort(int[] arr) {
		for (int j=0;j<arr.length;j++) {
			for (int i=arr.length-1;i>0;i--) {
				int current = arr[i];
				if (current < arr[i-1]) {
					arr[i] = arr[i-1];
					arr[i-1] = current;
				}
			}
		}
	}
	
	public static int[] getRandomArray(int n) {
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			boolean duplicate = true;
			int random = -1;
			while (duplicate) {
				duplicate = false;
				random = new Random().nextInt(n+1);
				for (int j=0;j<arr.length;j++) if (random == arr[j]) duplicate = true;
			}
			arr[i] = random;
		}
		return arr;
	}
}
