import java.util.Arrays;
import java.util.List;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<String> vowels = Arrays.asList("a", "e", "i", "o", "u"); String
		 * string="fghjkloiu"; Arrays.stream(string.split("")) // generate stream from
		 * an String[] of single character strings .filter(vowels::contains) // remove
		 * all non-vowels .count();
		 */
		List<String> l = Arrays.asList("hello", "world", "test");		
		int tot = l.stream()
	               .map(s -> s.replaceAll("[aeiou]", "").length())
	               .reduce(0, Integer::sum);
		System.out.println(tot);
	}

}
