package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Q> How to Delete an elementString from using Collection */

public class StringDeletion {

	public static void main(String[] args) {
		String str[]= {"Ball","Dall","Call","Stall","Scroll"};
		/* Converting to collection*/
		List<String> lal=new ArrayList(Arrays.asList(str));
		System.out.println(lal);
		lal.remove("2");
		System.out.println(lal);
		
	}
}
