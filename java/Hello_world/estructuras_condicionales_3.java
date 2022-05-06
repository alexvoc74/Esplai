
public class estructuras_condicionales_3 {

	
	static void arbol() {
		for (int i = 0; i < 10; i++) {
			   for (int j = 0; j < 10 - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			   
	}
		for(int o = 0; o < 2; o++) {
			for (int j = 0; j < 3; j++)
				for(int k = 0; k < (2*j+1); k++)
			   System.out.print(" ");
			   System.out.print("***");
			   System.out.println();
		   }
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	arbol();	
	}
}
