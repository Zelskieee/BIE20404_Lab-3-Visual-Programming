package Question1;

// Car class  extends the Vehicle class
public class Car extends Vehicle { //Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )
	
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
