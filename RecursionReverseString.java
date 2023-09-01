
public class RecursionReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hard Work";
		String reveStr = reversed(str);
		System.out.println(reveStr);
	}

	private static String reversed(String str) {

		// TODO Auto-generated method stub

		if (str.isEmpty()) {
			return str;
		}
		return reversed(str.substring(1)) + str.charAt(0);
	}

}