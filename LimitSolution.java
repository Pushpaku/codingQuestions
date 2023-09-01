import java.util.Arrays;
import java.util.List;

public class LimitSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(5,6,7,8,9,3,4,5);
list.stream().limit(5).forEach(System.out::println);
	}

}
