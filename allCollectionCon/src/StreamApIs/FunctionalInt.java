package StreamApIs;

public class FunctionalInt {
	public static void main(String[] args) {
		ArithematicOpe ad=(int x)-> x*x;
		int result=ad.cal(5);
		System.out.println(result);
	}
}

