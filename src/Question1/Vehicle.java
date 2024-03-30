package Question1;

//Abstract class
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
