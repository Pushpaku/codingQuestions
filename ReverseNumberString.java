import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("ram is done"));
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		return Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	}

	//List<Integer> myList= Arrays.asList(4,6,78,45,23,9,2);
	//myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
}	