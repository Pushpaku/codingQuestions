import java.util.stream.IntStream;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 151;
String str= String.valueOf(n);
System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		
		return IntStream.range(0,str.length()).allMatch(i -> str.charAt(i) == str.charAt(str.length()-1-i));
}
}
