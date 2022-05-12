package fede_capo;

public class Main implements IPersona {

	
	static void profe() {
		Profesor profe = new Profesor();
		
		profe.setNombre("Federico");
		profe.setSalario(850);
		
		System.out.println("Tutor: " + profe.getNombre());
		System.out.println("Salario: " + profe.getSalario());
		
	}
	
	
	static void alumno() {
		Alumno alumno = new Alumno();
		
		alumno.setNombre("Raul");
		alumno.setCurso("3r ESO");
		
		System.out.println("\nAlumno: " + alumno.getNombre());
		System.out.println("Salario: " + alumno.getCurso());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		profe();
		alumno();
		
		
	}

}
