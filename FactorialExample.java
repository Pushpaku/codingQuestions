import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FactorialExample {

	
	  static int factorial(int no) { return IntStream.rangeClosed(1, no).reduce(1,
	  (a, b) -> a * b); }
	  
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  int fact; int no = 5; fact = factorial(no); System.out.println(fact); }

	/*
	 * public static void main(String[] args) { List<Integer> list =
	 * Arrays.asList(1,3,4,6,7,89,65,34,68,88); int list1 =list.stream().filter(i->
	 * i%2==0).mapToInt(Integer:: intValue).sum(); System.out.println(list1); }
	 */
}
