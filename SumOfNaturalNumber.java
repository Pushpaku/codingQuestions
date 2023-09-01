
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		SumOfNaturalNumber sm = new SumOfNaturalNumber();
		int a= sm.sum(10);
		System.out.println("Sum of n Natural number: "+a);
	}
	
	int sum(int b) {
		if(b>0) {
			return b+sum(b-1);
		}else {
			return 0;
		}
	}
}