package super_this;

public class Dog extends Animal{
 String food;
 
 public Dog() {
 }
  
 public Dog(String name,int age,String food) {
	 super(name, age);
	 this.food=food;
	 System.out.println("I'm from Doggy Con");
 }
 
 @Override
 public void makeSound() {
	 super.makeSound();
	 System.out.print(" Bark Bow Bow Bow \n");
	 eat();
 }
 
}
