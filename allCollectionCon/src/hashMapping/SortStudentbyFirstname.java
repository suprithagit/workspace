package hashMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortStudentbyFirstname {
	public static void main(String[] args) {
		List<Student> s= Arrays.asList(new Student("Suma", 'A', 8),new Student("Vishal", 'C', 9),
				new Student("Abhi", 'B', 6), new Student("Bhuvi", 'A', 10));
		s.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).forEach(n->System.out.println(n));
		List<Student> s1= s.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
				System.out.println(s1);
		List<Student> s2= s.stream().sorted((e1,e2)->e1.getGrade().compareTo(e2.getGrade())).collect(Collectors.toList());
		s2.forEach(System.out::println);
		System.out.println("----Converting to Maps-----------");
		Map<Character, List<Student>> group =  s.stream()
				.collect(Collectors.groupingBy(Student::getGrade));
		group.entrySet().stream().forEach(System.out::println);
		System.out.println("....By Name....");
		Map<String, List<Student>> name =  s.stream()
				.collect(Collectors.groupingBy(Student::getName));
		System.out.println(name);
	}
}
