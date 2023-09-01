import java.util.Arrays;
import java.util.Comparator;

public class FindLargestStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Pushpa is a java programmer zy";

String str1=Arrays.stream(str.split("\\s+")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
	System.out.println(str1);
	}

}
