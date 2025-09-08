package super_this;

public class Animal {

	String animalName;
	int years;
	
	public Animal() {}
	
	public Animal(String name,int age) {
		this.animalName=name;
		this.years=age;
	}
 
	public void makeSound() {
		System.out.println("I Sound like :::: ");
	}
	
	 public void eat() {
		 System.out.println("I like to eat :::");
	 }
	 
}
