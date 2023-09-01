/*
 * import java.util.stream.Collectors;
 * 
 * public class RepeatedcharacterOfString {
 * 
 * public static void main(String[] args) {
 * 
 * String input = "hello world";
 * 
 * Pair<Character, Long> maxCharCountPair =
 * getMostRepeatedCharacterFromString(input);
 * 
 * System.out.println("Input string : " + input);
 * System.out.println(maxCharCountPair.getKey() +
 * " is the most repeated character for " + maxCharCountPair.getValue() +
 * " times.");
 * 
 * }
 * 
 * private static Pair<Character, Long>
 * getMostRepeatedCharacterFromString(String input) {
 * 
 * return input.chars() .filter(c -> Character.isWhitespace(c) == false) //
 * ignoring space .mapToObj(c -> (char) c) .collect(Collectors.groupingBy(c ->
 * c, Collectors.counting())) .entrySet() .stream()
 * .max(Map.Entry.comparingByValue()) .map(p -> Pair.of(p.getKey(),
 * p.getValue())) .orElse(Pair.of(Character.MIN_VALUE, -1L)); }
 * 
 * 
 * 
 * }
 */