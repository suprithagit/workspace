package StreamApIs;

public class CountNumbers {
	public static void main(String[] args) {
		int i = 12345;
		String str=Integer.toString(i);
		System.out.println(str.length());
		
		System.out.println("-------By using while Loop-------");
		int count=0;
		while (i>0) {
			count++;
			i=i/10;
		}
		System.out.println(count);
	}
}
