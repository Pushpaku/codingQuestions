import java.util.stream.Collectors;

public class UnidueDegits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i = 1234455667;
   
  String str = String.valueOf(i);
  
 String i1 = str.chars().mapToObj(c-> (char)c).distinct().map(Object::toString).collect(Collectors.joining());
 System.out.println(i1);
	}

}
