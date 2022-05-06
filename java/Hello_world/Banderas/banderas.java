package Banderas;

public class banderas {

	static String BLUE = "\033[44m";
	static String YELLOW = "\033[43m";
	static String RED = "\033[41m";
	static String Color_Off= "\033[0m";
	static String WHITE = "\033[47m";
	static String space = "                              ";
	static String space2 = "   ";
	static String BLACK = "\033[40m"; 
	static String TEXTO = "\033[1;30;47m";
	
	
	static void Ucrania() {
		System.out.println(TEXTO + "            UCRANIA           \n");
		System.out.println(BLUE+ space);
		System.out.println(BLUE + space);
		System.out.println(BLUE+ space);
		System.out.println(BLUE + space);
		System.out.println(YELLOW + space);
		System.out.println(YELLOW + space);
		System.out.println(YELLOW + space);
		System.out.println(YELLOW + space);
	}
	
	static void Francia() {
		
		System.out.println(TEXTO + " FRANCIA \n");
		for( int i = 0; i < 3; i++ ) {

			
			System.out.print(BLUE + space2);
			System.out.print(WHITE + space2 );
			System.out.println(RED + space2);
		}
	}
	
	static void España() {
		System.out.println(TEXTO + "            ESPAÑA            \n");
		System.out.println( Color_Off  + RED + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + RED + space);
	}
	
	static void Grecia() {
		System.out.println(TEXTO + "            GRECIA            \n");
		System.out.println(BLUE + "     " + WHITE + "  " + BLUE + "     " + BLUE + "                  ");
		System.out.println(BLUE + "     " + WHITE + "  " + BLUE + "     " + WHITE + "                  ");
		System.out.println(WHITE + "            " + BLUE + "                  ");
		System.out.println(BLUE + "     " + WHITE + "  " + BLUE + "     " + WHITE + "                  ");
		System.out.println(BLUE + "     " + WHITE + "  " + BLUE + "     " + BLUE + "                  ");
		System.out.println(WHITE + "                              ");
		System.out.println(BLUE + "                              ");
		System.out.println(WHITE + "                              ");
		System.out.println(BLUE + "                              ");
		


	}
	static void Paises_Show() {
		Ucrania();
		espacio();
		España();
		espacio();
		Francia();
		espacio();
		Cataluña();
		espacio();
		Deutsch();
		espacio();
		Grecia();
	}
	
	static void Cataluña() {
		System.out.println(TEXTO + "            CATALUÑA          \n");
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + YELLOW + space);
		System.out.println( Color_Off + RED + space);
		System.out.println( Color_Off + YELLOW + space);
	}
	
	static void Deutsch() {
		System.out.println(TEXTO + "            ALEMANIA          \n");
		System.out.println(BLACK + space);
		System.out.println(BLACK + space);
		System.out.println(RED + space);
		System.out.println(RED + space);
		System.out.println(YELLOW + space);
		System.out.println(YELLOW + space);
		
	}
	
	static void espacio() {
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	public static void main(String[] args) {

		Paises_Show();
	}

}
