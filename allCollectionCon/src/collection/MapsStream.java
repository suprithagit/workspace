package collection;

import java.util.HashMap;
import java.util.Map;
public class MapsStream {
	public static void main(String[] args) {
		Map<Books,Integer> maps = new HashMap<>();
		Books b1=new Books(101, "java", "Durga", 200);
		Books b2=new Books(104, "j2ee", "Durga", 300);
		Books b3=new Books(106, "Sql", "Mahesh", 100);
		Books b4=new Books(103, "Spring", "Durga", 150);
		
		maps.put(b1, 1);
		maps.put(b2, 4);
		maps.put(b3,5);
		maps.put(b4, 9);
		
		maps.entrySet().stream().forEach(System.out::println);
		maps.forEach((a,b)->System.out.println("----"+a+"----------- "+b));
		
		  
		
	}
}
