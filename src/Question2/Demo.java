package Question2;
// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

// Demo class
public class Demo {
	// Main method
    public static void main(String[] args) {
        
    	Circle circle1 = new Circle(5);// Object or instance created of Circle
    	
        Rectangle rectangle1 = new Rectangle(7,6);// Object or instance created of Rectangle
        
        Triangle triangle1 = new Triangle(5,4);// Object or instance created of Triangle
        
        System.out.println("\t - Result (1st measure) - ");// Output
        System.out.println("+---------+------------+------------+");
        System.out.println("|         | Perimeter  |    Area    |");
        System.out.println("+---------+------------+------------+");
        System.out.printf("| Circle  | %.2f cm^2 | %.2f cm^2 |\n", circle1.getPerimeter(), circle1.getArea());
        System.out.println("+---------+------------+------------+");
        System.out.printf("|Rectangle| %.2f cm^2 | %.2f cm^2 |\n", rectangle1.getPerimeter(), rectangle1.getArea());
        System.out.println("+---------+------------+------------+");
        System.out.printf("|Triangle | %.2f cm^2 | %.2f cm^2 |\n", triangle1.getPerimeter(), triangle1.getArea());
        System.out.println("+---------+------------+------------+");

        
    	Circle circle2 = new Circle(8.5);// Object or instance created of Circle
    	
        Rectangle rectangle2 = new Rectangle(9.5,9.6);// Object or instance created of Rectangle
        
        Triangle triangle2 = new Triangle(10.2,16.8);// Object or instance created of Triangle
        
        System.out.println("\n\t - Result (2nd measure) - ");// Output
        System.out.println("+---------+------------+------------+");
        System.out.println("|         | Perimeter  |    Area    |");
        System.out.println("+---------+------------+------------+");
        System.out.printf("| Circle  | %.2f cm^2 |%.2f cm^2 |\n", circle2.getPerimeter(), circle2.getArea());
        System.out.println("+---------+------------+------------+");
        System.out.printf("|Rectangle| %.2f cm^2 | %.2f cm^2 |\n", rectangle2.getPerimeter(), rectangle2.getArea());
        System.out.println("+---------+------------+------------+");
        System.out.printf("|Triangle | %.2f cm^2 | %.2f cm^2 |\n", triangle2.getPerimeter(), triangle2.getArea());
        System.out.println("+---------+------------+------------+");


    }
}
