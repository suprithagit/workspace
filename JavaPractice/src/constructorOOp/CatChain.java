package constructorOOp;

public class CatChain {

//	public CatChain() {
//		super();
//		// TODO Auto-generated constructor stub
//		System.out.println("I'm for constructot chaining");
//		this("Pershian");
//	}
	public CatChain() {
		this("Pershian");
		System.out.println("I'm for Constructor chaining with this() method ");
	}

	public CatChain(String name) {
		// TODO Auto-generated constructor stub
		this(145668);
		System.out.println("I'm from " + name);
	}

	public CatChain(int phNumber) {
      System.out.println("Please call me"+ phNumber);
	}

	@Override
	public String toString() {
		return "CatChain []";
	}

}
