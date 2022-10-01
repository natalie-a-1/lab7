
public class Circle extends Ellipse {

	public Circle(double a) {
		
		super(a, a);
		
	}
	
	//collaborated with Keon
	public double getRadius() {
		
		return Math.sqrt(super.getArea()/Math.PI);
		
	}

}
