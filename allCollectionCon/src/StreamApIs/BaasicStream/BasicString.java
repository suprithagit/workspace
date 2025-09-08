package StreamApIs.BaasicStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicString {

	public static void main(String[] args) {
		List<String> sr=Arrays.asList("Anitha","Vinu","Sun","Kun","Moon","Vinu","Run");
		sr.forEach(System.out::println);
		List<String> result=sr.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		//forEach(System.out::println);
		List<String> reverse=sr.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("Reverse : " +reverse);
		
		System.out.println("Sort By Length");
		List<String> lines=sr.stream().sorted((a,b)->b.length()-a.length()).distinct().collect(Collectors.toList());
		System.out.println(lines);
		
		List<String> line=sr.stream().sorted((a,b)->a.length()-b.length()).distinct().collect(Collectors.toList());
		System.out.println(line);
		
	}
}
