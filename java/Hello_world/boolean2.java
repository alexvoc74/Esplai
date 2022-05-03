
public class boolean2 {
	
	static int random = (int) (Math.random()*100+1);
	static int aleatorio = (int) (Math.round(Math.random()));
	
	static void ParImpar(int par) {
		if((par%2) == 0) {
			System.out.println("El resto es par\n");
		}
		else {
			System.out.println("El numero es impar\n");
		}
	}
	
	static void White_black() {
		if(aleatorio == 0) {
			System.out.println("blanco");
		}
		else {
			System.out.println("negro");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(random);
		ParImpar(random);
		White_black();
	}

}
