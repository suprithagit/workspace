package methodTypes;

public class House {
	static int z;

	public static void main() {
		System.out.println("I'm in home");
	}

	public static int sum(int x, int y) {
		System.out.println("The sum is");
		return x + y;
	}

	public static int square(int a) {
		z = a * a;
		return z;
	}

	public int rooms() {
		House b = new Bedroom();
		b.items();
		System.out.println(b.rooms());
		return 2;
	}

	private void items() {
		// TODO Auto-generated method stub
		int fan = 1;
		int lights = 2;
		System.out.println(fan + "...." + lights);
	}

}
