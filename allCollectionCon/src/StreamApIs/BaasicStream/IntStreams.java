package StreamApIs.BaasicStream;

import java.util.stream.IntStream;

public class IntStreams {
	/*IntStream sum() returns the sum of elements in this stream.
	 *  This is a special case of a reduction. 
	 *  IntStream sum() is a terminal operation 
	 *  i.e, it may traverse the stream to produce a result or a side-effect.
	 *  
	 *  IntStream range()==> return values within specified range
	 *  IntStream.of() ==> takes input as integer like +,0,-
*/
	public static void main(String[] args) {
		IntStream n1 = IntStream.range(2, 8);
		System.out.println(n1.sum()); //IntStream sum()
		// gets java.lang.IllegalStateException for below codei.e: one operation at one time
		// System.out.println(n1.count());
		IntStream n2 = IntStream.range(2, 8);
		n2.forEach(System.out::println);

		IntStream num1 = IntStream.of(10, 0, 30, -7);
		num1.forEach(System.out::println);

	}
}
