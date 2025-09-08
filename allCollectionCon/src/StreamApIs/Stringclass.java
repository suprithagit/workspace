package StreamApIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stringclass {

	public static void main(String[] args) {
		List<String> str1 = Arrays.asList(null,"son", "son", "moon", null, "Stars", "Colors", "Aurandathi", null);
		str1.stream().filter(w -> w != null).sorted().filter(w -> w.length() > 3 && w.length() < 6)
				.forEach(System.out::println);
		System.out.println(str1);
		List<String> result = str1.stream().filter(w -> w != null).sorted()
				.distinct().collect(Collectors.toList());
		System.out.println(result);
	}
}
