import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultilplicationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(1,2,3,4,5);
List<Integer> a1=list.stream().map(n -> 2*n).filter(n-> n>5).collect(Collectors.toList());
System.out.print(a1);

	}

}
