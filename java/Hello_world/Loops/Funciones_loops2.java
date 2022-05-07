package Loops;
import java.util.Scanner;

public class Funciones_loops2 {

	static String password = "1234";
	static String  admin = "admin";
	
	static void Login() {
		Scanner user = new Scanner(System.in);
		// Create a Scanner object
	    System.out.println("Introduce un usuario: ");

	    String userName = user.nextLine();
	    
	    
	    System.out.println("Introduce una contraseña: ");
	    String contraseña = user.nextLine();// Read user input
	    
	    int count = 10;
	    
	    while(count >= 0) {
	    	if(!userName.equals(admin) || !contraseña.equals(password)) {
		    	System.out.println("Login false");
		    	count = count-1;
		    	System.out.println("\nTe quedan " + count + " intentos");
		    	
		    	System.out.println("Introduce un usuario: ");
			    userName = user.nextLine();
			    
			    System.out.println("Introduce una contraseña: ");
			    contraseña = user.nextLine();// Read user input
		    	
		    }
		    
		    else {
		    	System.out.println("\nLogin true");
		    	System.out.println("\nBienvenido a casa Tony");
		    	break;
		    }
	 	     count--;
	    }
	    
	    if(count < 0) {
	    	System.out.println("Has superado el límite de 10 intenos. Vuelve a intentarlo mañana.");
	    	System.exit(0);
	    }
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login();
	}

}
