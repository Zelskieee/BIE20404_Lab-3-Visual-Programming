package Question1;

// Main class
public class MyMainClass { //Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

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
