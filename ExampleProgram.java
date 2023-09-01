
public class ExampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "REW";
		String str = new String("REW");
		StringBuffer ste = new StringBuffer("REW");
		StringBuilder ste1 = new StringBuilder("REW");
		System.out.println(str1.equals(ste1));
		System.out.println(str1.equals(ste));
		System.out.println(str.equals(ste1));
		System.out.println(str1.equals(str));
		
		System.out.println(str1==str+"==");
		System.out.println(str1==ste +"==");
		System.out.println(str1==ste1+"==");
		System.out.println(str1==str+"==");
		System.out.println(str1==str+"==");
	}

}
