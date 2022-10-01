
public class IsoscelesTrapezoid extends Polygon{
	
	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		
        super(top, base, leg, leg);
        
        this.top = top;
        
        this.base = base;
        
        this.leg = leg;
    }
	
	//collaborated with Keon
    private double calcTriangleBase(double top, double base) {
    	
    
        triangleBase = (Math.abs(top - base))/2;
        
        return triangleBase;
    }
    
  //collaborated with Keon
    private double calcHeight(double base, double hypotenuse) {
    	
        height = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(base, 2));
        
        return height;
        
    }

	public double getTop() {
    	
        return top;
        
    }
    
    public double getBase() {
    	
        return base;
        
    }
    
    public double getLeg() {
    	
        return leg;
        
    }
    
  //collaborated with Keon
    public double getArea() {
    	
        area = (top + base) * calcHeight(calcTriangleBase(top, base), leg)/2;
        
        return area;
        
    }
    
  //collaborated with Keon
    public Rectangle getCenterRectangle() {
    	
        double temp = 0;
        
        if (top < base) {
        	
            temp = top;
        }
        
        else {
        	
            temp = base;
        }
        Rectangle output = new Rectangle(temp, calcHeight(calcTriangleBase(top, base), leg));
        return output;
    }
}
