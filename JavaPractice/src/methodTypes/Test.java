package methodTypes;

public class Test {
	static String s;
	public static void main(String[] args) {
		System.out.println("main job"); //not printed
		s="static";
		main();
		House.main();
		System.out.println(House.sum(20, 50));
		House.z = 10;
		System.out.println(House.z);
		System.out.println(House.square(5));
		
		House h=new House();
		System.out.println("Rooms "+h.rooms());
	}

	public static void main() {
		System.out.println("Hi Supritha");
		System.out.println(s+" .....");
	}
}
