import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(4,6,7,8,9,2);
list.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
