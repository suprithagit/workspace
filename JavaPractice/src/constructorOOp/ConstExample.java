package constructorOOp;

public class ConstExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d1 = new Dog(4,1,"Black");
		Dog d2 = new Dog(4);
		System.out.println(d1+"  "+ d2);
		d.setColour("Brown");
		System.out.println(d+ "  "+d.getColour());
		System.out.println("------------Constructor Chaining-----------");
		CatChain c = new CatChain();
		System.out.println(c);
		CatChain c1 = new CatChain("Bengaluru");
	
	}

}
