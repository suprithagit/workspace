package exceptionHandling;

public class MultipleExc {
	public static void main(String[] args) {
		try {

//			int a = 10;
//			int b = 0;
//			System.out.println(a / b);

			String s = new String();
			System.out.println("....."+s);
			
			int k[]=new int[5];
			for (int i = 0; i <=5; i++) {
				k[i]=i;
				System.out.println(k[i]);
			}
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException |NullPointerException e) {
			System.out.println(e);
		}

	}
}
