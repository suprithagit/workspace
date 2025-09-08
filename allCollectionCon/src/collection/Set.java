package collection;

import java.util.HashSet;
import java.util.Iterator;


public class Set {
	public static void main(String[] args) {
		java.util.Set<Books> books = new HashSet<>();

		Books b1 = new Books(101, "Java", "BPB", 200);
		Books b2 = new Books(102, "DataStructure", "Forn", 150);
		Books b3 = new Books(102, "Operating System", "Galvin", 600);

		books.add(b1);
		books.add(b2);
		books.add(b2);
		books.add(b3);
		for (Books b : books) {
			System.out.println(b);
		}
		System.out.println("----------using iterator----------");
		
		  Iterator<Books> itr=books.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  System.out.println("---------Streams----------");
		  books.stream().forEach(System.out::println);
	}

}
