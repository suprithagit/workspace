package methodTypes;

public class Shape {

	public void draw() {
		System.out.println("Strat drawing");
	}
	
}
 class Square extends Shape{
	@Override
	 public void draw() {
		 System.out.println("draw square");
	 }
	 
 }