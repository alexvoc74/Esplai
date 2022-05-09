package Herencias_ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empleado = new Employee();
		System.out.println("Salario base: " + empleado.getSalary());
		
		
		Programmer junior = new Programmer();
		System.out.println("Bonus de este mes: " + junior.getBonus());	
		System.out.println();
		System.out.println("En total este mes te llevas: " + (empleado.getSalary() + junior.getBonus()));
		
		
	}

}
