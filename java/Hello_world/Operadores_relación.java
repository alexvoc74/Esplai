
public class Operadores_relación {
	 static int num1 = 1;
	 static int num2 = 2;
	 static int num3 = 3;
	 static int num4 = 4;
	 
	 static void num_1() {
		if(num1 != num3) {
			System.out.println(num1 + " es distinto a " + num3);
		}
		if(num1 < num3) {
			System.out.println(num1 + " no es mayor a " + num3);
		}
		if(num1 <= num2) {
			System.out.println(num1 + " no es mayor o igual a " + num2);
		}
}
	
	 static void num_2() {
		
		if(num2 != num3) {
			System.out.println(num2 + " no es igual a " + num3);
		}
		if(num2 == num2) {
			System.out.println(num2 + " no es distinto a " + num2);
		}
		if(num2 <= num4) {
			System.out.println(num2 + " no es mayor o igual a " + num4);
		}
		if(num2 <= num3) {
			System.out.println(num2 + " no es mayor o igual a " + num3);
		}
		if(num2 <= num3) {
			System.out.println(num2 + " es igual y menor que " + num3);
		}
		if(num2 <= num4) {
			System.out.println(num2 + " es igual y menor que " + num4);
		}
		if(num2 >= num1) {
			System.out.println(num2 + " no es igual o menor que " + num1);
		}
		if(num2 >= num1) {
			System.out.println(num2 + " es igual y mayor que " + num1);
		}
	}
	 static void num_3() {
		if(num3 >= num1){
			System.out.println(num3 + " no es menor o igual a " + num1);
		}
}
	
	 static void num_4() {
		if(num4 != num2) {
			System.out.println(num4 + " no es igual al de " + num2);
		}
		if(num4 >= num3) {
			System.out.println(num4 + " no es menor o igual a " + num3);
		}
}
	
	 static void espacios() {
		System.out.println("");
		System.out.println("------------------------- \n");
		
}
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		num_1();
		espacios();
		num_2();
		espacios();
		num_3();
		espacios();
		num_4();
	}
}
