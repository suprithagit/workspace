package StreamApIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2,3,4,6);
	List<String> s1=Arrays.asList("Vijay","Ajay","Savi","Pavi");
	List<Integer> num=Arrays.asList(122,144,166,188);
	//Adding all collection into single collection
	List<List<Integer>> finalList= Arrays.asList(l1,num);
	System.out.println(finalList);
	//flatmap creating each collection inside with stream
	//finalList.stream().flatMap(x->x.stream()).forEach(x->System.out.println(x));
	List<Integer> reault= finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	System.out.println(reault);
	//reault.stream().map(n->n+10).forEach(n->System.out.println(n));
}
}
