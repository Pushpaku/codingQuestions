import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartWithOneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> list = Arrays.asList(11,12,13,24,13,14,15,16);
  list.stream().map(s -> s +"").filter(s-> s.startsWith("1")).forEach(System.out::println);
	
  
	  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,8);

  Set<Integer> set = new HashSet<>();
  myList.stream().filter(n->!set.add(n)).forEach(System.out::println);//dupl.
	
	}

}
