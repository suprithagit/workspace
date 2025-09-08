package stringsConcept;

public class CharToString {
	public static void main(String[] args) {

		char[] arr = { 'g', 'o', 'a', 't' };

        // Storing it in a string
        // using copyValueOf() over string
		String str = String.copyValueOf(arr);
		System.out.println(str);

	}
}