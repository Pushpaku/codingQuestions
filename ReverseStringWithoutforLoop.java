import java.util.Scanner;

public class ReverseStringWithoutforLoop {

	public static void reverseString(char[]ch,int length) {
		System.out.print(ch[length-1]);
		length--;
		 reverseString(ch,length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("enter String");
   String str= sc.nextLine();
   char[] ch = str.toCharArray();
   int length = ch.length;
   reverseString(ch,length);
	}

}
