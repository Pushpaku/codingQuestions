import java.util.Arrays;

public class AnnagramExample {

	public static void main(String[] args) {

String str1 = "Race";
String str2 = "Care";

str1 = str1.toLowerCase();
str2 = str2.toLowerCase();

if(str1.length() == str2.length()) {
	char[] str1Char = str1.toCharArray();
	char[] str2Char = str2.toCharArray();
	
	Arrays.sort(str1Char);
	Arrays.sort(str2Char);
	 boolean result = Arrays.equals(str1Char, str2Char);
	 
	 if(result) {
		System.out.println(str1 + "----anagram"+str2 +"  is true"); 
	 }else {
		 System.out.println(str1 + "----anagram"+str2 +"is false");
	 }
	
}

	}

}
