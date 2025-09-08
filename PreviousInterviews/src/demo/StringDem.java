package demo;

public class StringDem {
	public static void main(String[] args) {
		String input= "aman";
		String s = new String ("AMAN");
		s.toLowerCase();
		if(input==s) {
			System.out.println("Welcome1"+s);
		}else if(input.equals(s)){
			System.out.println("Welcome2"+s);
		}else {
			System.out.println("Welcome");
		}
		
	}
}
