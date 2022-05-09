package Herencia2;

import java.util.Scanner;

public class Empleado extends Persona {

	private String tipoContrato;
	private float sueldo;
	
	public void calcularSueldo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un codigo:");
		sueldo = sc.nextFloat();
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @param sueldo
	 */
	public Empleado(float sueldo) {
		super();
		this.sueldo = sueldo;
	}

}
