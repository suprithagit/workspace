package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoChaes {

	public static void main(String[] args) {
		String s="hi i am supritha and now attending interview";
		List<Character > ar= new ArrayList<>();
		for (int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			ar.add(c);
		}
		
		Map<Character,Long> map=ar.stream().filter(n->n!=' ').collect(Collectors.groupingBy((n->n),Collectors.counting()));
		map.entrySet().stream().forEach(System.out::println);
		//System.out.println(map);
		

	}
}
