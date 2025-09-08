package stringsConcept;

public class StringConcat {
	public static void main(String[] args) {

		String s1 = "garuda";
		String s2 = "Palli";
		System.out.println(s1 + "Hari");
		String s3 = s1.concat(s2);
		String s4 = s1.concat("Halllari");
		System.out.println(s3);
		System.out.println(s4);
		
		//Substring
		String a1="012345678";
		String a2=a1.substring(2, 6); //starts from 2 and ends at 6-1=5
		System.out.println(a2); //new array is created and refers to new array
		
		//Substring methods
		
		
	}
}