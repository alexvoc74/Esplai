
public class estructuras_condicionales {
	
	static int aleatorio = (int) (Math.round(Math.random()));

	static void red_black() {
		if(aleatorio == 0) {
			System.out.println("rojo");
		}
		if(aleatorio == 1) {
			System.out.println("negro");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		red_black();
	}

}
