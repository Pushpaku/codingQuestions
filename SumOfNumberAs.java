import java.util.stream.IntStream;

public class SumOfNumberAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1234;
		int i1 = IntStream.rangeClosed(1, i).sum();
		System.out.println(i1);
	}

}
