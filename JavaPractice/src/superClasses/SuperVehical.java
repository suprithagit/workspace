package superClasses;
/*
 * super.facilities();
 * System.out.println(super.maxSpeed);
 */
public class SuperVehical {
public static void main(String[] args) {
	Car c = new Car();
	Bike b = new Bike();
	b.speed();
	System.out.println(b.maxspeed);
	c.facilities();
}
}
class Vehical{
	int maxSpeed = 300;
	public void facilities() {
		System.out.println("Conforts");
	}
}

class Car extends Vehical{
	public void facilities() {
		System.out.println("AC");
		super.facilities();
	}
}
class Bike extends Vehical{
	int wheels = 2;
	int maxspeed= 200;
	public void speed() {
		System.out.println(super.maxSpeed);
	}
}