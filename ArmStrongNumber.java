import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmStrongNumber {

	public static List<Integer> generate(int series) {
		return Stream.iterate(1, i -> ++i).filter(i -> i == Stream.of(String.valueOf(i).split("")).map(Integer::valueOf)
				.map(n -> (n * n * n)).mapToInt(n -> n).sum()).limit(series).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> generate = ArmStrongNumber.generate(5); // 5 Armstrong number
		System.out.println(generate);
	}
	
	// Java 7
/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numer:");
	int n = sc.nextInt();
	int num = n, rem, total = 0;
	while (n > 0) {
		rem = n % 10;
		n = n / 10;
		total = total + (rem * rem * rem);
	}
	if (num == total)
		System.out.println("Armstrong Number");
	else
		System.out.println("Not Armstrong Number");
}*/

}
