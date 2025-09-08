package hashMapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapDemo {
	public static void main(String[] args) {
    Map<String, Integer> maps=new HashMap<>();
    maps.put("Arun", 3);
    maps.put("Varun", 1);
    maps.put("Tarun", 2);
    
 
    maps.entrySet().stream().sorted((e1,e2)->{return e1.getValue()- e2.getValue();}).forEach(System.out::println);
//   LinkedHashMap<String , Integer> lmap= maps.entrySet().stream().sorted((e1,e2)->{return e1.getValue()-e2.getValue();})
//    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1 ,LinkedHashMap:: new));
//   System.out.println(lmap);
	}
}
