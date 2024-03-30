package Question2;
// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

// Rectangle class implements interface Polygon
class Rectangle implements Polygon
{
	private double length;
	private double width;
	private double perimeter;
	private double area;

	// Declare parameterized constructor of Rectangle
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	// Declare setter method for Rectangle perimeter
	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}

	// Declare getter method for Rectangle perimeter
	public double getPerimeter()
	{
		return this.perimeter = 2 * (this.length + this.width);
	}

	// Declare setter method for Rectangle area
	public void setArea(double area)
	{
		this.area = area;
	}

	// Declare getter method for Rectangle area
	public double getArea()
	{
		return this.area = this.length * this.width;
	}
}
