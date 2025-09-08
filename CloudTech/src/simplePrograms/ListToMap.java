package simplePrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Convert list to map without using new keyword
public class ListToMap {
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(2,1,4,6,7,2,3);
		Map<Integer, Integer> result= num.stream().distinct().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		System.out.println(result);
		
		List<String> str= Arrays.asList("abc","aab","aac","aad","abc");
		Map<String, String> strResult= str.stream().distinct().collect(Collectors.toMap(String::toString, String::toString));
		System.out.println(strResult);
		//using new Key word
		Map<Integer, Integer> maps= new HashMap<>();
		for (Integer integer : num) {
			maps.put(integer, integer);
		}
		System.out.println(maps);
	}
}
