package lamda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Lamda_hello {
public static void main(String[] args) {
	
	BiConsumer<Integer, Integer> biConsumer=(a,b)->System.out.println(a+b);
	biConsumer.accept(30, 40);
	
	Predicate<Integer> predicate= a ->(a%2==0);
	System.out.println("We are calling boolean : "+predicate.test(10));
	
	Comparator<String> comparator = (s1,s2)-> s1.compareToIgnoreCase(s2);
	comparator.compare("suhsa", "Suhas");
	System.out.println(comparator.toString());
	
	List<Integer> values= Arrays.asList(1,2,5,7,9,28,54);
	for(int i:values) {
		System.out.print(" "+i);
	}
	values.forEach(j->System.out.print(" "+j));
	values.forEach(System.out::println); // calling by object reference, no need to use variable
	
	values.forEach(Lamda_hello::doubleit);
	
	}
     //doubling values
		public static void doubleit(int i) {
			System.out.print( " "+i*2);
		}

}
