package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharString {

public static void main(String[] args) {
 System.out.println("I 'm in ");
 String s="mada";
 StringBuffer bf= new StringBuffer();
 StringBuffer bf1= new StringBuffer("ragav").reverse();
 for(int i=s.length()-1;i>=0;i--) {
	 bf.append(s.charAt(i));
 }
 System.out.println(bf);
 System.out.println(bf1);
 
 //Join
 String date=String.join("/", "30","11","2034");
 System.out.println(date);
 
 //Remove Duplicate
 List<Character> sh=new ArrayList<>();
 for(int i=s.length()-1;i>=0;i-- ) {
	 sh.add(s.charAt(i));
 }
 sh.stream().distinct().forEach(System.out::println);
 
 //count duplicates
 Map<Character,Long> res= sh.stream().sorted().collect(
		 Collectors.groupingBy((n->n),Collectors.counting()));
 System.out.println(res);
 
 //Anagram ==>Same Letters
 String q="listen";
 String r="silent";
 List<Character> qList= q.chars()
         .mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
 List<Character> rList= r.chars()
         .mapToObj(c -> (char) c)
         .sorted().collect(Collectors.toList());
 
 if (qList.equals(rList)) {
     System.out.println("The strings are anagrams.");
 } else {
     System.out.println("The strings are not anagrams.");
 }
 
 //Another way
 char[] p1=q.toCharArray();
 char[] p2=r.toCharArray();
 Arrays.sort(p1);
 Arrays.sort(p2);

 System.out.println(p1.length+"  "+p2.hashCode());
 if (p1.equals(p2)) {
     System.out.println("The strings are anagrams.");
 } else {
     System.out.println("The strings are not anagrams.");
 }
 

}

}
