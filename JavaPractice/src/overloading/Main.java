package overloading;

public class Main {
	public static void main(String[] args) {
		Main a= new Main();
		a.calander(6,2);
		
	}
	private double calander(double a, double b) {
		double sum=a+b;
		double divide= a/b;
		double mult= a*b;
		double sub=a-b;
		return (sum+ divide+ mult + sub);
	}
}
