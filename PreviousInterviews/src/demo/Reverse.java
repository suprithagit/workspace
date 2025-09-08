package demo;

public class Reverse {

	public static void main(String[] args) {
		//reverse without using third variable
		int a=20;
		int b=50;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"   b="+b);
		
		int c=20;
		int d=60;
		int e=c+d;
		c=e-c;
		d=e-d;
		System.out.println(c+"   "+d);
		
	}
}
