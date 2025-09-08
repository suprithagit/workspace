package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListmain {
	public static void main(String[] args) {
		List<Books> books = new LinkedList<>();
		   //Creating list of Books  
	   
	    //Creating Books  
	    Books b1=new Books(101,"Java","BPB",200);  
	    Books b2=new Books(102,"DataStructure","Forn",150);  
	    Books b3=new Books(103,"Operating System","Galvin",600);  
	    //Adding Books to list  
	    books.add(b1);  
	    books.add(b2);  
	    books.add(b3);  
	    //Traversing list  
	    for(Books b:books){  
	    System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+ b.getPrice());  
	    } 
	    
	    List<Books> book = Arrays.asList(new Books(109,"Java","BPB",200), 
	    new Books(105,"DataStructure","Forn",150), 
	    new Books(106,"Operating System","Galvin",600));
	    
	    book.stream().forEach(System.out::println);
	    System.out.println("Sort and print");
	    List<Books> bsort= book.stream()
	    		.sorted((e1,e2)->e2.getAuthor().toString().compareTo(e1.getAuthor().toString()))
	    		.collect(Collectors.toList());
	    bsort.stream().forEach(n->System.out.println(n));
	    bsort.stream().forEach(System.out::println);
	 }
	
}
