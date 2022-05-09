package Herencia2;

import java.util.Scanner;

public class Cliente extends Persona{

	private String categoria;
	private int codigo;
	

	public void generarCodigo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un codigo:");
		codigo = sc.nextInt();
		
	}
}
