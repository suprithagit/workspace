package StreamApIs.BaasicStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SimpleArrayList {
	public static void main(String[] args) {
		List<Integer> ar=Arrays.asList(5,6,9,7,10,7);
		System.out.println(ar);
		ar.forEach(System.out::println);
		Collections.sort(ar);
		
		System.out.println("After sorting");
		ar.forEach(System.out::println);
		
		System.out.println("Remove Duplicates");
		Stream<Integer> removeDup=ar.stream().distinct();
		removeDup.forEach(System.out::println);
		
		List<String> sr=Arrays.asList("Anitha","Vin","Sun","kun","mun","vin");
		sr.forEach(System.out::println);
		System.out.println("After Removing Dup");
		sr.stream().distinct().forEach(System.out::println);
	}

}
