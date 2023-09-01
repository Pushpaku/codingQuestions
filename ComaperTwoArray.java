import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComaperTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {4,5,6,7};
int[] b = {4,5,7,8};

List<Integer> list = IntStream.rangeClosed(0, a.length-1).boxed().map(i -> Integer.compare(a[i], b[i])).collect(Collectors.toList());
System.out.println(list);

  //List<Integer> result =
  IntStream.rangeClosed(0,a.length-1).boxed().map(i->Integer.compare(a[i],b[i])
  ).collect(Collectors.toList()); //result.forEach(System.out::println);
  
  List<Integer> equalityResult = IntStream.range(0, a.length).mapToObj(i
  ->Integer.compare(a[i],b[i])).collect(Collectors.toList());
  System.out.println(equalityResult);
  
	/*
	 * List<Integer> list = IntStream.range(0, a.length).mapToObj(i ->
	 * Integer.compare(a[i], b[i])) .collect(Collectors.toCollection(() -> new
	 * ArrayList<>(a.length)));
	 * 
	 * int[] ints = IntStream.range(0, a.length).map(i -> Integer.compare(a[i],
	 * b[i])).toArray();
	 * 
	 * System.out.println(Arrays.toString(ints));
	 */
 
	}

}
