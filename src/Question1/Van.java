package Question1;

//Van class  extends the Vehicle class
public class Van extends Vehicle { //Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )
	
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
