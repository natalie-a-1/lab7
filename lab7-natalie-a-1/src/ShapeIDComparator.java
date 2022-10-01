import java.util.Comparator;

public class ShapeIDComparator implements Comparator<Shape>{

	public int compare(Shape s1, Shape s2) {
		
		
		if (s1.getID() == s2.getID()){
			
			return 0;
		}
		
		else if (s1.getID() > s2.getID()) {
			
			return 1;
		}
		else {
			
			return -1;
		}
	}

}
