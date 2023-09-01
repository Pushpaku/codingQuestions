import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);  
		  int i1 = list.stream().mapToInt(i -> i).sum(); System.out.println(i1);
		 
	int i2 = 	IntStream.range(0, 100).sum();
	System.out.println(i2);
	
		
	}

}
