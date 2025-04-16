
public class AnagramJava8 {

	public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean result = Arrays.equals(str1.chars().sorted().toArray(),str2.chars().sorted().toArray());
        System.out.println(str1 + " ---- anagram " + str2 + " is " + result);
    }
}
