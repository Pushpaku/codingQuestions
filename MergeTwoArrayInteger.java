import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] array1 = {1,2,3,3,4,5,6,0};
Integer [] array2 = {7,8,9,10,11,12,0};

Integer[] array3 = Stream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray(Integer[]::new);
Integer[] array4= Arrays.stream(array3).filter(i -> i!=0).toArray(Integer[]::new);
  System.out.println(Arrays.toString(array4));
 
  
  
  int [] arra1 = {19,29,38,3,4,5,6,0};
  int [] arra2 = {7,80,90,10,11,12,0,0};

  int[] arra3 = IntStream.concat(Arrays.stream(arra1),Arrays.stream(arra2)).toArray();
  int[] arra4 = Arrays.stream(arra3).filter(i -> i!=0).toArray();
    System.out.println(Arrays.toString(arra4)+"-------");
   

//--------

List<Integer> list = Arrays.asList(array1);
List<Integer> list2 = Arrays.asList(array2);
List<List<Integer>> list3 = Arrays.asList(list,list2);
List<Integer> l =list3.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
l.forEach(System.out::println);
	}

}
