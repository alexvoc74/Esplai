package Loops;

public class random_lucky {

	static int random = (int) (Math.random()*100);
	
	static boolean lucky() {
		if((random & 1) == 1) {
			System.out.println(random + " Par");
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(random + " Impar");
			System.out.println(false);
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lucky();
	}

}
