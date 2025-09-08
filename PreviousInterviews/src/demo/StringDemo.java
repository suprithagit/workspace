package demo;

public class StringDemo {

	public static void main(String[] args) {
		String a=new String("abc");
		String b=new String("abc");
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		int i=9;
		System.out.println(i++);
		//It is a post increment when it sees i next time it will increment
		
	}
}
