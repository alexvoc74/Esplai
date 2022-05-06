package printF;

public class printf {

	static String format = "%s\t\t%s\t%s\t\n";
	static String format2= "%s\t\t%s%s\n";
	static String reverse= "%3$s,%2$s,%1$s%n";
	static String format3= "       %d\n";
	static String format4= "%09d\n";
	static String format5= "%015.2f\n";
	static double decimal = 17.1829327;
	static String no_espacios = "%s%s%s\n";
	
	
	static void tabulador() {
		
		System.out.printf(format ,"NOMBRE" ,"APELLIDO1","APELLIDO2");;
	}
	
	static void tab2() {
		System.out.printf(format2 ,"NOMBRE" ,"APELLIDO1","APELLIDO2");;

	}
	
	static void tab_reverse() {
		System.out.printf(reverse ,"NOMBRE" ,"apellido1","apellido2");;

	}
	static void ceros() {
		System.out.printf(format4 , 22);

	}
	static void World() {
		System.out.printf(no_espacios, "THE", "WORLD", "CHICO");
	}
	
	static void twenty_two() {
		System.out.printf(format3 ,22);

	}
	static void decimal() {

		System.out.printf(format5, decimal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tabulador();
		tab2();
		tab_reverse();
		twenty_two();
		ceros();
		decimal();
		World();
	}

}
