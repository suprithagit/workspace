package super_this;

public class Cat extends Animal{

	String name ;
	int age;
	
	public Cat() {
		this("Belly",4);
		super.makeSound();
		System.out.println("I'm from cat Constructor");
	}
	
	public Cat(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("Cat linkes to eat cakes");
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Meow Meow Mewo...!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
    
}
