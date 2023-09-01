import java.util.Arrays;
import java.util.List;

public class SkipSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
list.stream().skip(6).forEach(System.out::println);
	}

}
