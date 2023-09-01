import java.util.Arrays;
public class NearestNumber {
	


	    public static void main(String[] args) {
	        int[] numbers = { 1, 5, 10, 15, 20 };
	        int target = 12;

	        
	   
	        int nearestNumber = findNearestNumber(numbers, target);
	        System.out.println("Nearest number to " + target + " is: " + nearestNumber);
	    }
//a=1,b=5
	    public static int findNearestNumber(int[] numbers, int target) {
	        return Arrays.stream(numbers)
	                     .reduce((a, b) -> Math.abs(a - target) < Math.abs(b - target) ? a : b)
	                     .orElseThrow(() -> new IllegalArgumentException("Array is empty."));
	    }
	}

//.reduce((a, b) -> Math.abs(a - target) < Math.abs(b - target) ? a : b): The reduce method is used to find the number with the smallest absolute difference to the target value. The lambda expression (a, b) -> Math.abs(a - target) < Math.abs(b - target) ? a : b compares the absolute difference between a and the target with the absolute difference between b and the target. It returns the number that has the smaller absolute difference.

//In the first iteration, a will be the first element of the stream (1) and b will be the second element (5). The lambda expression checks if the absolute difference between 1 and target (|1-12| = 11) is less than the absolute difference between 5 and target (|5-12| = 7). Since 7 is smaller, it keeps b (which is 5) for the next iteration.

//In the second iteration, a will be the result from the previous iteration (5) and b will be the next element of the stream (10). The lambda expression checks if the absolute difference between 5 and target (|5-12| = 7) is less than the absolute difference between 10 and target (|10-12| = 2). Since 2 is smaller, it keeps b (which is 10) for the next iteration.