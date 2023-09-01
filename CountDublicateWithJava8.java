import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDublicateWithJava8 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter integer values separated by spaces (e.g., 1 2 3 2 4):");
		String input = reader.readLine();

		List<Integer> numbers = Stream.of(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		int duplicateCount = countDuplicates(numbers);
		System.out.println("Number of elements occurring more than once: " + duplicateCount);

		reader.close();
	}

	public static int countDuplicates(List<Integer> nums) {
		return (int) nums.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).values().stream()
				.filter(count -> count > 1).count();
	}
}