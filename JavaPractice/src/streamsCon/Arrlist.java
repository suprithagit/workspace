package streamsCon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Arrlist {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<>();
		ar.add(20);ar.add(43);ar.add(84);ar.add(68);ar.add(40);ar.add(31);ar.add(51);
		ar.add(79);
		ar.add(66);
		System.out.println(ar);
		List<Integer> l = ar.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(l); //adding 10 to all elements so using map . Mapping
		List<Integer> l2 = ar.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2); // Performing True/ false to get result so using filter  
		long count= ar.stream().filter(i->i<35).count();
		System.out.println(count); // just counting with filtered values
		//Sorting operations
		List<Integer> l3=ar.stream().sorted((i,j)->(i<j)?1:(i>j)?-1:0).collect(Collectors.toList());
		System.out.println(l3);
		List<Integer> l4 =ar.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList()) ;
		List<Integer> l5 =ar.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList()) ;
		System.out.println(l4+"..Decending.."+l5);
		
		ArrayList<String> s1= new ArrayList<>();
		s1.add("Harish Ray");s1.add("Mahesh Kumar");s1.add("Vinay Raj");s1.add("Suman Lokesh");s1.add("Anusha Nadig");
		System.out.println(s1);
		List<String> str = s1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(str);//Natural sorting
		List<String> str1 = s1.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(str1);
		
		Comparator<String> c = (k1, k2) -> {
			int g1 = k1.length();
			int g2 = k2.length();
			if (g1 < g2)
				return -1;
			else if (g1 > g2)
				return 1;
			else
				return k1.compareTo(k2);
		};
		List<String> str2 = s1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(str2);
		
		Optional<Integer> m= ar.stream().sorted().min((a,b)->a.compareTo(b));
		System.out.println(m);
		Integer k=ar.stream().sorted().max((a,b)->a.compareTo(b)).get();
		System.out.println(k);
		
		s1.stream().forEach(System.out::println);
	}
}
