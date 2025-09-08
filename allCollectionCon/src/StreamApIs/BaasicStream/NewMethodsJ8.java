package StreamApIs.BaasicStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewMethodsJ8 {
	public static void main(String[] args) {
		List<String> st= Arrays.asList("sun","moon","star","satern","marse","Jupiter");
		List<String> s1= new ArrayList<>(st);
		System.out.println(st);
		s1.removeIf(n->n.length()>4);
		s1.forEach(System.out::println);
		s1.replaceAll(s->s+"...");
		System.out.println(s1);
		//System.out.println("New list "+st);
		
	}

}
