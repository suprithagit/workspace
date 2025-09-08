package lamda_Practice;

public class FunMain {

	public static void main(String[] args) {
		int v1=10;
		int v2= 5;
		
		FunInt n1=(a,b)->{return (a+b);};
		FunInt n2=(a,b)->a*b;
		
		System.out.println(n1.maths(v1, v2));
		System.out.println(n2.maths(v1, v2));
		int result = n1.maths(v1, v2);
		System.out.println(result);
		
		
	}
}
