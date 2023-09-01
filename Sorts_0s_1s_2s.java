import java.util.Arrays;
import java.util.stream.IntStream;

//How To Sort An Array Of 0s, 1s And 2s In Java?
public class Sorts_0s_1s_2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,1,1,2,2,2,0,0,0};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]> arr[j]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}


System.out.println(Arrays.toString(arr));

/*
 * int[] str = {1,1,1,2,2,2,0,0,0};; reverseString(str);
 * System.out.println("gghh"+Arrays.toString(str))
 */;
	}
	
	
	/*
	 * private static void reverseString(int[] str) { IntStream.range(0,
	 * str.length/2).forEach(i -> {int temp = str[i]; str[i] = str[str.length -1];
	 * str[str.length -1-i] = temp; });
	 * 
	 * }
	 */

}
