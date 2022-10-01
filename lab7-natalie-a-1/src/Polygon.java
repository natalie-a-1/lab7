
public abstract class Polygon extends Shape {
	
	private double perimeter;
	
	protected Polygon(double... sides) throws IllegalArgumentException {
		
        if (sides == null) {
            throw new IllegalArgumentException("null sides");
        }
        else if (sides.length < 3) {
            throw new IllegalArgumentException("Invalid number of sides: " + sides.length);
        }
        
        boolean temp = false;
        
        int tempo = 0;
        
        for (int i = 0; i < sides.length; i++) {
        	
            if (sides[i] <= 0) {
            	
                temp = true;
                
                tempo = i;
                
                break;
            }
        }
        if (temp == true) {
            throw new IllegalArgumentException("Nonpositive side: " + sides[tempo]);
        }
        
        double temp3 = 0;
        
        for (int i = 0; i < sides.length; i++) {
        	
            temp3 = temp3 + sides[i];
            
        }
        for (int i = 0; i < sides.length; i++) {
        	
            if (sides[i] >= (temp3 - sides[i])) {
            	
                throw new IllegalArgumentException("Polygon inequality violated: " + sides[i] + " >= " + (temp3-sides[i]));
            }
        }
        perimeter = temp3;

    }

    public double getPerimeter() {
    	
        return perimeter;
    }

}
