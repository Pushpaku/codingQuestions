import java.util.stream.IntStream;

public class PalindromeInString {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "malayalam";
//isPalindrome(str);
System.out.println(isPalindrome(str));
	}
	
	public static boolean  isPalindrome(String str) {
		return IntStream.range(0, str.length()).allMatch(i-> str.charAt(i) == str.charAt(str.length()-1-i));
		
	}

}
