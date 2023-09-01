import java.util.Arrays;

public class LastElementOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str = {"Rajeev","rahul","shyam","Pappu","Vikash"};
String sr =Arrays.stream(str).skip(str.length-2).findFirst().get();
System.out.println(sr);
	}

}
