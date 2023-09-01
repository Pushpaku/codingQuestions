import java.util.Arrays;
import java.util.stream.Stream;

public class MergeStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array1 = {"ram","shyam","krishna"};
		String [] array2 = {"sita","rita","gita"};
		
		String[] mergeOfTwoString = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[] :: new);
		System.out.println(Arrays.toString(mergeOfTwoString));
	}

}
