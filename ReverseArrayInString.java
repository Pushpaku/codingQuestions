import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"Ram","Shyam","Gita","Rita"};
		reverseString(str);
		System.out.println(Arrays.toString(str));
		
		 
	}

	private static void reverseString(String[] str) {
	IntStream.range(0, str.length/2).forEach(i -> 
	{String temp = str[i];
	str[i] = str[str.length -1-i];
	str[str.length -1-i] = temp;	
	});
		
	}
}
