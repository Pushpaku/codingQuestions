import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccuranceOfStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str = {"Ram","Shyam","krishna","Ram","Govinda","Shyam"};
Set<String> set = new HashSet<>();
//Arrays.stream(str).filter(s-> !set.add(s)).collect(Collectors.groupingBy(s->s)).forEach((k,v)-> System.out.println(k+" "+v.size()));
Arrays.stream(str).collect(Collectors.groupingBy(s->s)).forEach((k,v) -> System.out.println(k+ " "+v.size()));
Map<String, Long> hstr =Arrays.stream(str).collect(Collectors.groupingBy(s->s ,Collectors.counting()));
hstr.forEach((k,v) -> System.out.println(k +"  jhjhjjjh ---"+v));

	int[] arr= {3,4,5,6,3,4,8,9,8,4};
Map<Integer, Long> hm	= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c -> c , Collectors.counting()));
hm.forEach((k,v) -> System.out.println(k +"   ---"+v));


	
	}

}
