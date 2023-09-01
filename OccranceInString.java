import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "aabbccde";
Map<Character,Long> charOccurance = str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
charOccurance.forEach((k,v) -> System.out.println(k + " = "+v));
	}
}
                           