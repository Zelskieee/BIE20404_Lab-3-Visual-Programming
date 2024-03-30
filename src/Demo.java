interface Polygon
{
	abstract void setPerimeter(double perimeter);
	abstract double getPerimeter();
	abstract void setArea(double area);
	abstract double getArea();
}

class Circle
{
	private double radius;
    private double perimeter;
    private double area;

	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void setPerimeter(double perimeter)
	{
		 this.perimeter = perimeter;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}

	public double getArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
}

class Rectangle implements Polygon
{
	private double length;
	private double width;
	private double perimeter;
	private double area;

	Rectangle(double length, double width)
	{
		this.length = length;
        this.width = width;
	}

	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}
	
	public double getPerimeter()
	{
		return 2 * (this.length + this.width);
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public double getArea()
	{
		return this.length * this.width;
	}
}

class Triangle implements Polygon
{
	private double base;
    private double height;
	private double perimeter;
	private double area;

	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}
	
	public double getPerimeter()
	{
		return this.perimeter = this.base + 2 * Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.height, 2));
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}

	public double getArea()
	{
		return 0.5 * this.base * this.height;
	}
}

class Demo {
    public static void main(String[] args) {
        
    	Circle circle = new Circle(5);
        
        System.out.printf("\nCircle circumference: %.2f cm", circle.getPerimeter());
        System.out.printf("\nCircle area: %.2f cm^2", circle.getArea());

        Rectangle rectangle = new Rectangle(7,6);
        
        System.out.printf("\nRectangle perimeter: %.2f cm", rectangle.getPerimeter());
        System.out.printf("\nRectangle area: %.2f cm^2", rectangle.getArea());

        Triangle triangle = new Triangle(5,4);
        
        System.out.printf("\nTriangle perimeter: %.2f cm", triangle.getArea());
        System.out.printf("\nTriangle area: %.2f cm^2", triangle.getArea());
    }
}