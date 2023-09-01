
public class FebnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int febCount = 15;
		int[] fib = new int[febCount];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<febCount;i++) {
			fib[i] = fib[i-1] + fib[i-2];
			
		}
		for(int i=0;i<febCount;i++) {
			System.out.println("Febonnaci series: " + fib[i]);
		}
		
	}

}
