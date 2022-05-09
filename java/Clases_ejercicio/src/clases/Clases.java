package clases;

public class Clases {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car coche = new car(50,120, "Diesel");
		
		coche.refuel();
		coche.drive();
		coche.drive();
		coche.drive();
		
		System.out.println("\n" + coche.getFuel() + "% del depósito");
		System.out.println("Vas a " + coche.getspeed() + "km/h");
		
	}

}
