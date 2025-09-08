package simplePrograms;

public class MainMethod {
	public static void l1(String[] args) {
		System.out.println("I'm not in main");
	}
	
	public static void main(String[] args) {
		System.out.println("I'm in main");
		MainMethod m= new MainMethod();
		m.l1(args);
	//	m.main("");
	}
//	public static void main(String args[]) {
//		System.out.println("I'm in main2");
//		MainMethod m= new MainMethod();
//	
//	}
	
}
