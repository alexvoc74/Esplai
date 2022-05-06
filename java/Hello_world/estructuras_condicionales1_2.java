
public class estructuras_condicionales1_2 {

	static int aleatorio = (int) (Math.round(Math.random()));

	static void red_black() {
		if(aleatorio == 0) {
			System.out.println("rojo");
		}
		else if(aleatorio == 1) {
			System.out.println("negro");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		red_black();
	}

}
