import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,3,67,90,89,99,23,45,69);
System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
 
		int[] itr = {2,3,67,90,89,99,23,45,69};
		int sdd =Arrays.stream(itr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(sdd);
	}

}
