import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListAndRemoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1 = Arrays.asList(1,2,3,4,0,7,0,0);
List<Integer> l2 = Arrays.asList(1,0,9,0,7,0,2,3,4);
List<List<Integer>> list= Arrays.asList(l1,l2);
List<Integer> list1 =  list.stream().flatMap(x -> x.stream()).filter(x-> !x.equals(0)).collect(Collectors.toList());
list1.forEach(System.out::println);
	}

}
