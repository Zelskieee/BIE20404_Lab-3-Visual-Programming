package Question2;
// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

// Circle class not implements interface Polygon
public class Circle
{
	private double radius;
	private double perimeter;
	private double area;

	// Declare parameterized constructor of Circle
	public Circle(double radius)
	{
		this.radius = radius;
	}

	// Declare setter method for Circle perimeter
	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}

	// Declare getter method for Circle perimeter
	public double getPerimeter()
	{
		return this.perimeter = 2 * Math.PI * this.radius;
	}

	// Declare setter method for Circle area
	public void setArea(double area)
	{
		this.area = area;
	}
	// Declare getter method for Circle area
	public double getArea()
	{
		return this.area = Math.PI * Math.pow(this.radius, 2);
	}
}
