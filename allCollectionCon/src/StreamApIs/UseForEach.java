package StreamApIs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UseForEach {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 5, 12, 2, 12, 45, 15);
		System.out.println(ints);
		// Internal for Each
		ints.forEach(n -> System.out.println(n));
		// External for Each
		for (int i = 0; i < ints.size(); i++) {
			System.out.print(ints.get(i) + " , ");
		}

		System.out.println("for each");
		for (Integer n : ints) {
			System.out.print(n + " ,");
		}

	}

}
