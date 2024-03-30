
// Abstract class
abstract class Vehicle { //Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

	// Declare the variable with protected access modifier 
	protected int seater;
	protected int wheel; 
	protected int door;
	protected String model;
	protected double price;
	protected double length;
	protected double width;

	// Define setter and getter for Vehicle class
	public int getSeater() {
		return seater;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSpace() {
		return length * width;
	}
	public void setSpace(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public abstract double addFuel() ;// Declare as abstract method
}

// Car class  extends the Vehicle class
class Car extends Vehicle {
	
	private double totalFuel;
	private double currFuel;// Declare private variable of Car class

	Car(double t, double c) {
		totalFuel = t;
		currFuel = c;
	}// Define parameterized constructor for Car class

	public double addFuel() {
		return totalFuel - currFuel;
	}// addfuel method for calculate used fuel of Car
}

//Van class  extends the Vehicle class
class Van extends Vehicle {
	
	private double totalFuel;
	private double currFuel;// Declare private variable of Van class

	Van(double t, double c) {
		totalFuel = t;
		currFuel = c;
	}// Define parameterized constructor for Van class

	public double addFuel() {
		return totalFuel - currFuel;
	}// addfuel method for calculate used fuel of Van
}

// Main class 
public class MyMainClass {

	// Main method 
	public static void main(String[] args) {

		Car Lexus = new Car(50.1,20.5);// Create object or instance of Car
		
		// Set the value
		Lexus.setWheel(4);
		Lexus.setSeater(4);
		Lexus.setDoor(4);
		Lexus.setModel("Lexus NX 350 F Sport");
		Lexus.setPrice(375888);
		Lexus.setSpace(1.8,1.5);

		// Output of Lexus car
		System.out.println("\t - Car - ");
		System.out.println("The brand of the car : " + Lexus.getModel());
		System.out.println("The wheel quantity : " + Lexus.getWheel());
		System.out.println("The seater quantity : " + Lexus.getSeater());
		System.out.println("The door quantity : " + Lexus.getDoor());
		System.out.printf("The prices: RM %.2f \n", Lexus.getPrice());
		System.out.println("Used fuel : " + Lexus.addFuel() + " litres ");
		System.out.println("Boot size : " + Lexus.getSpace() + " metre^2 ");		
		
		Van Toyota = new Van(70.5,35.6);// Create object or instance of Van
		
		// Set the value
		Toyota.setWheel(4);
		Toyota.setSeater(6);
		Toyota.setDoor(4);
		Toyota.setModel("Toyota Hiace");
		Toyota.setPrice(200000.50);
		Toyota.setSpace(1.5,0.9);
		
		// Output of Toyota van
		System.out.println("\n\t - Van - ");
		System.out.println("The brand of the car : " + Toyota.getModel());
		System.out.println("The wheel quantity : " + Toyota.getWheel());
		System.out.println("The seater quantity : " + Toyota.getSeater());
		System.out.println("The door quantity : " + Toyota.getDoor());
		System.out.printf("The prices : RM %.2f \n", Toyota.getPrice());
		System.out.println("Used fuel : " + Toyota.addFuel()+ " litres ");
		System.out.println("Sliding door size : " + Toyota.getSpace() + " metre^2 ");
	}

}