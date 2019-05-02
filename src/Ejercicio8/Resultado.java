package Ejercicio8;

public class Resultado {
	int local;
	int visitante;
	
public Resultado() {
					
	}
	
	
	public Resultado(int local, int visitante) {
		
		this.local = local;
		this.visitante = visitante;
		
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		this.local = local;
	}
	public int getVisitante() {
		return visitante;
	}
	public void setVisitante(int visitante) {
		this.visitante = visitante;
	}


	@Override
	public String toString() {
		return "Resultado [local=" + local + ", visitante=" + visitante + "]";
	}
	
	
	
	
}