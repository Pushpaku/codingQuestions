import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		int[] arr = {2,4,5,6,7,8};
		int index = 2;
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.remove(index);
		int [] ir = list.stream().mapToInt(Integer::intValue).toArray();
System.out.println(Arrays.toString(ir));
	}

}
