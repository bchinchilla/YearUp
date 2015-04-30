
public class CalculateArea {

	public static void main(String[] args) {
		
		double circleArea = CalculateCircleArea(5);
		System.out.println ("The area of the circle is " + circleArea);
		double rectangleArea = CalculateRectangleArea(3, 6);
		System.out.println ("The area of the rectangle is " + rectangleArea);
	
	}

	static double CalculateCircleArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
		
	}

	static double CalculateRectangleArea(int length, int breadth) {
		double area = length * breadth;
		return area;
		
	}
}
