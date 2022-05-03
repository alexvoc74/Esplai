
public class incrementales {
	 static int numero = 0;

	static void Incrementales() {
		numero++;
	}
	static void Decrementar() {
		numero--;
		if(numero == 0) {
			numero--;
			numero--;	
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Incrementales();
		System.out.println(numero);
		Decrementar();
		System.out.println(numero);
	}

}
