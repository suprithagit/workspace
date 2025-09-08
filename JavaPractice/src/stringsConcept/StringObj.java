package stringsConcept;

public class StringObj {
	public static void main(String[] args) {

		String s1 = "Suhas";
		String s2 = "suhas";
		String s3 = new String("Suhas");
		String s4 = "Suhas";
		String s5 = new String("suhas");

		boolean b1 = (s1 == s4); //true
		boolean b2 = (s1 == s3); //false
		boolean b5 = (s1 == s2); //false
		
		boolean b3 = (s1.contains(s4)); //true
		boolean b4 = (s1.contains(s3)); //true
		boolean b6 = (s1.contains(s5)); //false
		boolean b11 = (s1.contentEquals(s5)); //false
		boolean b12 = (s1.contentEquals(s3)); //true
		
		boolean b7 = (s1.equalsIgnoreCase(s5)); //true
		boolean b8 = (s1.equals(s5)); //false
		boolean b9 = (s1.equals(s4)); //true
		boolean b10 = (s1.equals(s3)); //true

		System.out.println(	b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6 + " " + b7 + " " + b8 + " " + b9 + " " 
		+ b10 +" "+b11+" "+b12);

	}
}
