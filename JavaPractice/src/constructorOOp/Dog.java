package constructorOOp;

public class Dog {
	int legs;
	int tails;
	String colour;

	public Dog() {
		System.out.println("I'm barking");
	}

	public Dog(int legs, int tails, String colour) {
		super();
		this.legs = legs;
		this.tails = tails;
		this.colour = colour;
		System.out.println("I'm a dog with tail and legs");
	}
	
	public Dog(int legs) {
		super();
		this.legs = legs;
		System.out.println("I'm dog with legs");
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTails() {
		return tails;
	}

	public void setTails(int tails) {
		this.tails = tails;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", tails=" + tails + ", colour=" + colour + "]";
	}
	
	
}
