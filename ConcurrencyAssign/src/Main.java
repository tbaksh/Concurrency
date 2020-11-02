import java.util.Random;

public class Main {

private static final long startTime1 = 0;
private static final long startTime2 = 0;

public static void main(String[] args) {

	Random rand = new Random();

	int[] arr = new int[200000000];
	int sum = 0;

	for (int i = 0; i < arr.length; i++) {

		arr[i] = rand.nextInt(10) + 1;

}
	long endTime1 = System.nanoTime();
	long endTime2 = System.nanoTime();
	long totalTime1 = endTime1 - startTime1;
	long totalTime2 = endTime2 - startTime2;
	
	//Print out results
	System.out.println("Single thread: (Array size of: " + 20000000 + ") - Total Sum: " + Summation.sum(arr) +  " - Total Time: " + totalTime1 + " milliseconds. \n");
	System.out.println("Multiple threads: (Array size of: " + 20000000 + ") - Total Sum: " + Summation.sum(arr) + " - Total Time: " + totalTime2 + " milliseconds. \n");
	}
}



