package super_this;

public class AnimalMain {
 @SuppressWarnings("unused")
public static void main(String[] args) {
	Cat c=new Cat();
	Animal a=new Animal();
	Dog d= new Dog("Cherry",9,"Buns");
	
	System.out.println("I'm cat & my name is : "+c.getName()+" with age : "+ c.getAge());
	c.makeSound();
	System.out.println(" I am dog : "+ d.animalName+" : " +d.years+ " : "+d.food);
	d.makeSound();
	Animal a1=new Animal("Animals",15);
	System.out.println(a1.animalName +"   age "+a1.years);
	
	Donkey don= new Donkey("Shyam",6);
	don.setColour("black");
	System.out.println("I'm donky : "+don.animalName+" : "+don.getColour()+" "+don.years);
}
}
