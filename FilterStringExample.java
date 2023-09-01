import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("a1", "a2", "b1", "C2", "C1", "AcD", "C3");
		List<String> lis = list.stream().filter(s -> s.matches("[C]\\d+$")).collect(Collectors.toList());
		System.out.println(lis);
		lis.forEach(System.out::println);

		String[] str = { "a1", "a2", "b1", "C2", "C1", "AcD", "C3" };
		List<String> findvalu = Arrays.stream(str).filter(s -> s.startsWith("C")).collect(Collectors.toList());
		System.out.println(findvalu.toString() + "---");
	}

}
