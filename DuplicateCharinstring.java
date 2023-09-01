import java.util.HashMap;
import java.util.Set;

public class DuplicateCharinstring {
	public static void duplicateCharCount(String inputString) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		Set<Character> charsInString = hm.keySet();
		System.out.println("Duplicate Characters In " + inputString);
		for (Character ch : charsInString) {
			if (hm.get(ch) > 1) {
				System.out.println(ch + " : " + hm.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		duplicateCharCount("Bangalore is good city");
	}
}