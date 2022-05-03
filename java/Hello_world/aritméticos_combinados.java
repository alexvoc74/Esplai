
public class aritméticos_combinados {
	 static int numero = 25;
	 static int suma = 5;
	 static int resta = 15;
	 static int dos = 2;
	 static int resto = 3;
	 
	static void Suma_combinada() {
		System.out.print("Suma combinada entre " + numero + " + " + suma + " = ");
		numero += suma;
		System.out.println(numero);
	}
	static void Resta_combinada() {
		System.out.print("Resta combinada entre " + numero + " - " + resta + " = ");
		numero -= resta;
		System.out.println(numero);
		
	}
	static void Multiplicar() {
		System.out.print("Multiplicación  entre " + numero + " * " + dos + " = ");
		numero *= dos ;
		System.out.println(numero);
		
	}
	static void Dividir() {
		System.out.print("Division entre " + numero + " / " + dos + " = ");
		numero /= dos;
		System.out.println(numero);
		
	}
	static void Resto() {
		System.out.print("Resto entre " + numero + " % " + resto + " = ");
		numero %= resto;
		System.out.println(numero);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma_combinada();
		Resta_combinada();
		Multiplicar();
		Dividir();
		Resto();
		
	}

}
