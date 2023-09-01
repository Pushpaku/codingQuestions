import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverserNumberSeries {

	
	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println(reverse("reejjfjdfjf"));
	}
	
	public static String reverse(String str) {
		return Stream.of(str).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		
	}

}
