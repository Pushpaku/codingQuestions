import java.util.Arrays;
import java.util.Comparator;

public class LargestLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Pushpa is  java developer";
String str1 = Arrays.stream(str.split("\\s+")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
	System.out.println(str1);
	}
}
