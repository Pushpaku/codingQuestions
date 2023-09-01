import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumeberSeries {
	public static void main(String[] args) {
		List<Integer> list = IntStream.range(0, 100).boxed().filter(i -> isPrime(i)).collect(Collectors.toList());
		System.out.println(list);
	}

	private static boolean isPrime(Integer i) {
		// TODO Auto-generated method stub
		return i>1 && IntStream.range(2, i/2).noneMatch(n -> i%2 ==0);
	}

}
