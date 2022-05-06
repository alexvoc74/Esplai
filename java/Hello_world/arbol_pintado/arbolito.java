package arbol_pintado;

public class arbolito {

	static String GREEN_BACKGROUND = "\033[42m";
	static String Color_Off= "\033[0m";
	static String BLACK = "\033[40m";
	
	static void arbol() {
		for (int i = 0; i < 10; i++) {
			   for (int j = 0; j < 10 - i; j++)
			    System.out.print(" " + Color_Off);
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print(Color_Off + GREEN_BACKGROUND + "*" + Color_Off);
			   System.out.println();
			   
	}
		for(int o = 0; o < 2; o++) {
			for (int j = 0; j < 3; j++)
				for(int k = 0; k < (2*j+1); k++)
			   System.out.print(Color_Off + " ");
			   System.out.print(BLACK + "***" + Color_Off);
			   System.out.println();
		   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		arbol();
	}

}
