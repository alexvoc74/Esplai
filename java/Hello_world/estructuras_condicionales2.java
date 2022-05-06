import java.util.Scanner;

public class estructuras_condicionales2 {

	static double dato;
	
	static void temperatura(double dato) {
		int frio = 10;
		int templado = 20;
		double oceanico = 13.5;
		double Mediterraneo = 16.5;
		double Ecuatorial = 23.5;
		double Tropical = 26.5;
		
		
		if(dato < frio) {
			System.out.println("\nClimas frios");
			if(dato >= 5) {
				System.out.println("Tipo alta montaña");
			}
			if(dato < 5) {
				System.out.println("Tipo Polar");
			}
		}
		if(dato >= frio && dato < templado) {
			System.out.println("\nClimas templados");
			
			if(dato >= frio && dato < oceanico) {
				System.out.println("Tipo oceanico");
			}
			if(dato >= oceanico && dato < Mediterraneo) {
				System.out.println("Tipo Mediterraneo");
			}
			if(dato >= Mediterraneo && dato < templado) {
				System.out.println("Tipo Continental");
			}
		}
		
		if(dato >= templado) {
			System.out.println("Clima cálido");
			
			if(dato >= templado && dato < Ecuatorial) {
				System.out.println("Tipo Ecuatorial");
			}
			if(dato >= Ecuatorial && dato < Tropical) {
				System.out.println("Tipo Tropical");
			}
			if(dato >= Tropical) {
				System.out.println("Tipo Desértico");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner readme = new Scanner(System.in);

		System.out.print("Introduce una temperatura: ");
		dato = readme.nextDouble();
		System.out.println("Has introducido " + dato + "ºC");
		
		temperatura(dato);
		
		
	}

}
