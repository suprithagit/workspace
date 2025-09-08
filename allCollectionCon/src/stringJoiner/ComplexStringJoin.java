package stringJoiner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComplexStringJoin {
	public static void main(String[] args) {
		Stream<String> s= Stream.of("Anil","Sunil","Manavi");
		String res=s.collect(Collectors.joining(" * ", " ==> ", " <== "));
		System.out.println(res);
	}
}
