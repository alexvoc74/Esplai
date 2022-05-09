package clases;

import java.util.Scanner;

public class car {

	private int fuel;
	private int speed;
	private String combustible;
	
	

	public car(int fuel, int speed, String combustible) {
		super();
		this.fuel = fuel;
		this.speed = speed;
		this.combustible = combustible;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	public void drive() {
		int autopista_gasto = 25;
		
		if(getSpeed() > autopista_gasto) {
			setFuel(getFuel() - autopista_gasto);
			System.out.println();
			System.out.println("Estás conduciendo por autopista, el gasto es 25%");
			System.out.println("Te queda " + getFuel() +  "% restante");
		}
		
		if(getFuel() <= 0 ) {
			Scanner sc = new Scanner(System.in);  
			
			System.out.println();
			System.out.println("Quieres pasar por la gasolinera?: Si/No");
			String answer = sc.nextLine();
			Boolean yn = (answer.equalsIgnoreCase("Si") ? true : false);
			
			if(answer.equalsIgnoreCase("Si")) {
				yn = true;
				refuel();
			}
			else {
				yn = false;
				System.out.println("LLAMA AL SEGURO PENDEJO");
				System.exit(0);
			}
		}
	}

	public void getInfo() {
		System.out.println(this.fuel + "" + this.speed);
		
	}


	public int getFuel() {
		return fuel;
	}


	public void setFuel(int fuel) {
		
			this.fuel = fuel;			
		
	}


	public int getspeed() {
		return speed;
	}


	public void setspeed(int speed) {
		this.speed = speed;
	}
	
	public void refuel() {
		
		if(getFuel() ==100) {
			System.out.println("Tienes el tanque lleno");
			
		}
		else {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nQue tipo de combustible quieres poner?:");
			System.out.println();
			System.out.println("Diesel");
			System.out.println("Sin Plomo 95");
			System.out.println("Sin Plomo 98");
			System.out.println();

			
			combustible = sc.nextLine();
			
			if(combustible.equals("Diesel")) {
				System.out.println();
				System.out.println("Has optado por Diesel");
				System.out.println();
				
				System.out.println("Que cantidad quieres repostar?:");
				int diesel = sc.nextInt();
				
				if(diesel <= (100 - getFuel())) {
					System.out.println();
					System.out.println("Combustible actual: " + getFuel() + " y le hechamos " + diesel);
					setFuel(diesel + getFuel());
					System.out.println("Combustible actual: " + getFuel());
					
				}
				else {
					System.out.println("No te cabe tanto fiera, la capacidad es 100");
					refuel();
				}
			}
			else if(combustible.equals("Sin Plomo 95")) {
				System.out.println();
				System.out.println("Has optado por Sin Plomo 95");
				System.out.println();
				System.out.println("Que cantidad quieres repostar?:");
				int plomo_95 = sc.nextInt();
				
				if(plomo_95 <= (100 - getFuel())) {
					setFuel(plomo_95 + getFuel());
					System.out.println();
				}
				else {
					System.out.println("No te cabe tanto fiera");
					refuel();
				}
				
			}
			else if(combustible.equals("Sin Plomo 98")) {
				System.out.println();
				System.out.println("Has optado por Sin Plomo 98");
				System.out.println();
				System.out.println("Que cantidad quieres repostar?:");
				int plomo_98 = sc.nextInt();
				
				if(plomo_98 <= (100 - getFuel())) {
					setFuel(plomo_98);
					System.out.println(getFuel());
				}
				else {
					System.out.println("No te cabe tanto fiera");
					refuel();
				}
				
				
			}
			else {
				System.out.println("\nDebes elegir una opción de repostaje correcta.");
				System.out.println();
				refuel();
			}
		}
		}
		
}
