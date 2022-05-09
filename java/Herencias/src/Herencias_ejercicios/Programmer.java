package Herencias_ejercicios;

public class Programmer extends Employee {
	float bonus= (int)(this.salary*0.3);

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
}