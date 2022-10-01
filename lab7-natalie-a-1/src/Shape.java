
public abstract class Shape implements Comparable<Shape> {
	
	private int id;
	private static int nextID = 0;
	public abstract double getPerimeter();
	public abstract double getArea();
	
	Shape() {
		id = nextID;
		nextID++;
	}
	
	public int getID() {
		return this.id;
	}
	
	//Collaborated with Keon 
	public int compareTo(Shape other) {
		
		int comparison_name = getClass().getName().compareTo(other.getClass().getName());
		int comparison_perimeter = Double.compare(getPerimeter(), other.getPerimeter());
		int comparison_area = Double.compare(getArea(), other.getArea());
		
		//checking to see if names are equal
		if (comparison_name == 0) {
			
			//checking if perimeter is equal
			if (comparison_perimeter == 0) {
				
				//checking if area is equal
				if (comparison_area == 0) {
					
					return 0;
				}
				
				//checking if area is greater than other area
				else if (comparison_area > 0) {
					
					return 1;
				}
				
				else {
					return -1;
				}
			}
			
			//checking if perimeter is greater than other perimeter
			else if (comparison_perimeter > 0) {
				
				return 1;
			}
			else {
				return -1;
			}
			
		}
		
		//if perimeter is greater than other perimeter
		else if (comparison_name > 0) {
			
			return 1;
		}
		
		//if perimeter is less than other perimeter
		else {
			
			return -1;
			
		}
	}
	

	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}