import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OccuranceOfIntegerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(10,10,40,70,80,90,40,20,20,90,80);
 Set <Integer> sset = new HashSet<>();

Map<Integer,Long> map= list.stream().filter(i->!i.equals(40)).collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
	map.forEach((k,v)-> System.out.println(k + ": "+v));
	}

}
