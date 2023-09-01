import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseInStringOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String[] strd= {"Ram","Shaym","Krishna","Govinda"};
		 * Arrays.stream(strd).map(str->str.length());
		 */
		String str = "ram is boy";
		IntStream.range(0, str.length()).map(i->str.length()-1-i).mapToObj(j->str.charAt(j)).forEach(System.out::print);
		//int[] b = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length-i]).toArray();
		//System.out.println(Arrays.toString(b));
		
		
	}

}
