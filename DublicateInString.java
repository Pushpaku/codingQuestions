import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "ffgghhkjk";
Set <Character> set = new HashSet<>();
Map<Object, Long> dubchar = str.chars().mapToObj(ch -> (char)ch).filter(c-> !set.add(c)).collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
	dubchar.forEach((k,v) -> System.out.println(k + " : "+v));
	}

}
