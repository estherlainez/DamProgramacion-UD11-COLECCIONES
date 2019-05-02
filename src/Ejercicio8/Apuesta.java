package Ejercicio8;

public class Apuesta {
	double dineroApostado;
	Resultado r;
	
	
	public Apuesta (int local, int visitante, double ap) {
		r=new Resultado(local, visitante);
		this.dineroApostado = ap;
	}


	public double getDineroApostado() {
		return dineroApostado;
	}


	public void setDineroApostado(double dineroApostado) {
		this.dineroApostado = dineroApostado;
	}


	public Resultado getR() {
		return r;
	}


	public void setR(Resultado r) {
		this.r = r;
	}


	@Override
	public String toString() {
		return "Apuesta [dineroApostado=" + dineroApostado + ", r=" + r + "]\n";
	}

	
	
	
}

