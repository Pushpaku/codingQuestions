import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {2,3,5,6,7};
//int[] b = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length-i]).toArray();

List<Integer> l =IntStream.rangeClosed(1, arr.length).boxed().map(i -> arr[arr.length-i]).collect(Collectors.toList());
//System.out.println(Arrays.toString(b));
System.out.println(l);

List <Integer> li = Arrays.asList(62,93,5,86,37);
List<Integer> reversedList = IntStream.range(0, li.size()).mapToObj(i -> li.get(li.size() - 1 - i)).collect(Collectors.toList());
System.out.println(reversedList);

	}
}
 