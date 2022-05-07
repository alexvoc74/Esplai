package Loops;

public class Funciones_loops {
	
	static String javaa = "javaa";

	 /*static String JavaorNull(String java) {
		
		if(java.isEmpty() || java.isBlank()) {
			return null;
		}
		else {
			return java;
		}
	}*/
	
	static void Javaorrnull(String javaa) {
		if(javaa == "javaa") {
			
			System.out.println(javaa); 
			
		}
		else {
			javaa = null;
			System.out.println(javaa); 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Funciones_loops main = new Funciones_loops();
		//System.out.println(main.JavaorNull("java"));
		//System.out.println(main.JavaorNull("")); 
		
		Javaorrnull(javaa);
	}

}
