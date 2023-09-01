import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//uppercase
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("df", "fg");
		List<String> list = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("upper case" + list);
		
		List<String> a1 =  Arrays.asList("Ram","Shaym","ram");
		a1.stream().distinct().map(String::toLowerCase).collect(Collectors.toList());
		a1.forEach(System.out::print);
	}

}
