
public class ReverseStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String[] word = str.split(" ");
		String revStr = " ";
		for (int i = 0; i < word.length; i++) {
			String words = word[i];
			String woreRev = "";

			for (int j = words.length()-1;j>=0;j--) {
				woreRev = woreRev + words.charAt(j);
			}
			revStr = revStr + woreRev + " ";
		}
		System.out.println(revStr);
	}

}
