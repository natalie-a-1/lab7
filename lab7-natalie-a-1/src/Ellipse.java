
public class Ellipse extends Shape {
	
	private double a;
	private double b;
	
	//collaborated with Keon
	public Ellipse(double a, double b) throws IllegalArgumentException {

        if (a <= 0 || b <= 0) {
        	
            throw new IllegalArgumentException("Nonpositive value(s) provided for the constructor");
            
        }

        else if (a < b) {
        	
            throw new IllegalArgumentException("Semi-major axis length cannot be less than semi-minor axis length");
            
        }
        else {
        	
            this.a = a;
            this.b = b;
        }
    }

    public double getArea() {
    	double temp = (Math.PI * a * b);
        return temp;
    }

    public double getPerimeter() {
    	double temp = (Math.PI)*(a + b);
        return temp;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

}
