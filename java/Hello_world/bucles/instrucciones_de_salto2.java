package bucles;

public class instrucciones_de_salto2 {

	static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (i<10) {
			System.out.println("Bucle WHILE: "+(i));
			i++;
			if (j < 5) {
				for (j=0;j<5;j++) {
					System.out.println("Bucle FOR: "+(j+1));
				}
			}
		}
	}

}
