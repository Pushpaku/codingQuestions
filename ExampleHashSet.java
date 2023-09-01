import java.util.HashMap;
import java.util.HashSet;

public class ExampleHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashSet<Integer> s = new HashSet<>();
		 * 
		 * s.add(3); s.add(6); s.add(7); s.add(8); s.add(3); System.out.println(""+s);
		 */

HashMap<Integer, Integer> h = new HashMap<>();
h.put(3, 5);
h.put(4, 5);
h.put(null, 7);
h.put(null, 33);
h.put(8, 5);
h.put(3, 5);
h.forEach((k,v) -> System.out.println(k +""+ v));
	}

}
