package hashMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GeroupBY {
	public static void main(String[] args) {

		List<Student> std= Arrays.asList(new Student("Suman",'A',90),
				new Student("Amar",'A',75),
				new Student("Praveen",'B',55),
				new Student("Suman",'C',45));
		
		Map<Character, List<Student>> group =  std.stream()
				.collect(Collectors.groupingBy(Student::getGrade));
		System.out.println(group);
		System.out.println("**************");
		group.entrySet().stream().sorted((e1,e2)->e1.getKey().charValue()-e2.getKey().charValue()).forEach(System.out::println);
		//group.entrySet().stream().forEach(System.out::println);
	}
}
 