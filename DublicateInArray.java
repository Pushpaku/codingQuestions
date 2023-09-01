import java.util.HashSet;

//Find Duplicate Elements In An Array Using HashSet?
public class DublicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "err", "abc", "ghj", "rty", "abc", "ghj" };

		HashSet<String> hs = new HashSet<String>();
		
		for(String list:str) {
			if(!hs.add(list)) {
				System.out.println("Dublicate elemment : " +list);
			}
			
		}

	}

}
