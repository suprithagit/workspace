package super_this;

public class Donkey extends Animal{

	private String colour;
	
	public Donkey() {
	}
	
	Donkey(String name,int age){
		super(name,age);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
