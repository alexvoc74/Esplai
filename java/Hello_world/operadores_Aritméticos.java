
public class operadores_Aritméticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resta
		final int diez = 10;
		final int cinco = 5;
		final double resta = diez + cinco;
		System.out.println("Resta: " + resta);
		
		//Suma
		final int cinco_cinco = 55;
		final int cuatro_cinco = 45;
		final double suma = cinco_cinco + cuatro_cinco;
		System.out.println("Suma: " + suma);
		
		//negativo
		
		final int negative = 3;
		final int negative2 = 4;
		
		final int resta2 = negative - negative2;
		
		System.out.println("Resta negativa: " + resta2);
		
		//Multiplicar
		
		final int multiplicar = cinco * cinco;
		System.out.println("Multiplicar: " + multiplicar);
		
		//División de 25 entre 7 entero
		final int siete = 7 ;
		final int division = multiplicar / siete;
		System.out.println("Division entero: " + division);
		
		//División de 25 entre 7 real
		final float division2 = (float)multiplicar / siete;
		System.out.println("Division real: " + division2);
		
		//resto
		final int cuatro = 4;
		final int resto = multiplicar % cuatro;
		System.out.println("Calcular el resto: " + resto);
	}

}
