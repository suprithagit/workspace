package StreamApIs.BaasicStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TerminalString {
	public static void main(String[] args) {
		List<String> al= Arrays.asList("Lion","Ant","cat","Bat","Dog","Frog", "Zebra");
		
		String s1= al.stream().max(Comparator.comparing(String::length)).toString();
		String s2= al.stream().min(Comparator.comparing(String::length)).toString();
		String s3= al.stream().findFirst().get();
		String s4= al.stream().findAny().get();
		
		Optional<String> s5=al.stream().reduce((strA,strB)->strA.length()>strB.length()?strA:strB);
		Optional<String> s6=al.stream().reduce((strA,strB)->strA.length()<strB.length()?strA:strB);
		//String Join
		Optional<String> s7=al.stream().reduce((strA,strB)->strA+strB);
		Optional<String> s8=al.stream().reduce((strA,strB)->strA+" - "+strB);
		
		s6.ifPresent(System.out::println);
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println(s5+" "+s6+ s7);
		System.out.println(s8);
		
	}
}
