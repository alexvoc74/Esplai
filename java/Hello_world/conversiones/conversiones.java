package conversiones;

public class conversiones {

	static byte Bytes = 1;
	static short shortn = Bytes;
	static int intn= shortn;
	static long largo = intn;
	static float floatn = largo;
	static double doublen = floatn;
	
	static byte cien = 100;
	
	static byte resultado = (byte) (cien * 2);
	
	
	
	
	static double doublen1 = doublen;
	static float floatn1 = (float) doublen1;
	static long largo1 = (long) floatn1;
	static int intn1 = (int) largo1;
	static short shortn1 = (short) intn1;
	static byte byten1 = (byte) shortn1;
	
	static void ejer1() {
		System.out.println("Bytes: " + Bytes);
		System.out.println("Short: " + shortn);
		System.out.println("Integer: " + intn);
		System.out.println("Long: " + largo);
		System.out.println("Float: " + floatn);
		System.out.println("Double: " + doublen);
	}
	
	static void ejer2() {
		System.out.println("");
		System.out.println("Double: " + doublen1);
		System.out.println("Float: " + floatn1);
		System.out.println("Long: " + largo1);
		System.out.println("Integer: " + intn1);
		System.out.println("Short: " + shortn1);
		System.out.println("Bytes: " + byten1);
		System.out.println(resultado);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejer1();
		ejer2();
	}

}
