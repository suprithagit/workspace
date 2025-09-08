package StreamApIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoflatmapEx {
	
	    public static void main(String[] args) {
	        List<String> sentences = Arrays.asList("Hello World", "Java Stream API", "FlatMap Example");

	        List<String> words = sentences.stream()
	            .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split each sentence into words
	            .collect(Collectors.toList());

	        System.out.println(words); // Output: [Hello, World, Java, Stream, API, FlatMap, Example]
	    
	}
}
