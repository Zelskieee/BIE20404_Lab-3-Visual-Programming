package Question2;
// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

//Triangle class implements interface Polygon
public class Triangle implements Polygon
{
	private double base;
    private double height;
	private double perimeter;
	private double area;

	// Declare parameterized constructor of Triangle
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	// Declare setter method for Triangle perimeter
	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}
	
	// Declare getter method for Triangle perimeter
	public double getPerimeter()
	{
		return this.perimeter = this.base + 2 * Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.height, 2));
	}
	
	// Declare setter method for Triangle area
	public void setArea(double area)
	{
		this.area = area;
	}

	// Declare getter method for Triangle area
	public double getArea()
	{
		return this.area = 0.5 * this.base * this.height;
	}
}
