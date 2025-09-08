package hashMaps;

import java.util.HashMap;

public class HashMain {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Supritha", "Chitradurga");
		hashMap.put("Suraj", "Jaipur");
		hashMap.put("Avinash", "Keragodu");
		System.out.println(hashMap);
		System.out.println(hashMap.get("Suraj"));
		
		hashMap.entrySet().forEach(System.out::println);
		System.out.println("sort");
		hashMap.entrySet().stream().sorted((e1,e2)->e2.getKey().toString().compareTo(e1.getKey().toString())).forEach(System.out::println);
		
		
		HashMap<Students,String> map = new HashMap<>();
		Students student=new Students("Harita");
		map.put(student, "Bengaluru");
		System.out.println(map);
		System.out.println(map.get(student));
		
	}
}
