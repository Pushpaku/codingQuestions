import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmStrongNumberSeries {

	static List<Integer> generate(int series){
		return Stream.iterate(1, i ->++i).filter(i -> i == Stream.of(String.valueOf(i).split("")).map(Integer::valueOf).map(n->(n*n*n)).mapToInt(n->n).sum()).limit(series).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		 List<Integer> generate = ArmStrongNumberSeries.generate(5);
		 System.out.println(generate);
	}
	

}
