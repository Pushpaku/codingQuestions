import java.util.stream.Stream;

public class FabinocciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(10) //10 Fibonaci Series number
		.map(t -> t[0])
		.forEach(x -> System.out.println(x));

	}

}
