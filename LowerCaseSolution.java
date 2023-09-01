import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names = Arrays.asList("DD","GG","HJ");
names.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
