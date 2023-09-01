
public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("dhdjjd");
	
	
try {
    int array[] = new int[10];
    array[10] = 30 / 0;
} /*
	 * catch (Exception | ArithmeticException e) {
	 * System.out.println(e.getMessage()); }
	 */



		
		  catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		  System.out.println(e.getMessage()); }
		 
	
	}
	


}
