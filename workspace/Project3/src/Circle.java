

class Circle
{
	String m_color = null;
	double m_radius = -1;
	
	Circle(double radius)
	{
		m_radius = radius;
		m_color = "grey";
		
	}
	Circle(double radius, String color)
	{
		m_radius = radius;
		m_color = color;
	}
	double CalculateArea()
	{
		double area = 3.14* m_radius* m_radius;
		return area;
	}
	void PrintColor()
	{
		System.out.println("my color is:" + m_color);
	}


public static void main(String [] args) 
{
	Circle bigCircle = new Circle (10);
	bigCircle.CalculateArea();
	System.out.println("Big Circle's area is: " + bigCircle.m_radius);
	bigCircle.PrintColor();
	
	Circle smallCircle = new Circle (5, "blue");
	smallCircle.CalculateArea();
	System.out.println("Small Circle's area is: " + smallCircle.m_radius);
	smallCircle.PrintColor();
}

	
}
