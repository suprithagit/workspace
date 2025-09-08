package preInterview;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RmoveDupArLiat {
	//Remove duplicates form ArrayList
public static void main(String[] args) {
	List<Integer> numList=Arrays.asList(11,12,4,3,5,1,3,4,5);
	List<Integer> c=numList.stream().sorted().distinct().collect(Collectors.toList());
  System.out.println(c);
	Set<Integer> s=numList.stream().collect(Collectors.toSet());
  System.out.println(s);
  }
}
