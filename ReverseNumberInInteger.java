import java.util.stream.IntStream;

public class ReverseNumberInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer df= 3456;
		String sr = String.valueOf(df);
		IntStream.range(0, sr.length()).map(i -> sr.length()-1-i).mapToObj(j -> sr.charAt(j)).forEach(System.out::print);
			
	
	}

}
