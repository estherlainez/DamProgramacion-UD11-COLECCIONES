package Ejercicios;

import java.util.TreeSet;

public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet <Integer> t1= new TreeSet();
		TreeSet <Integer> t2= new TreeSet();
		TreeSet <Integer> t3= new TreeSet();
		TreeSet <Integer> t4= new TreeSet();
		TreeSet <Integer> t5= new TreeSet();
		
		
		t1=DatosEj.CrearConjuntoconLimite((int) (Math.random()*10), 50);	
		t2=DatosEj.CrearConjuntoconLimite((int) (Math.random()*20), 100);
		t3=DatosEj.CrearConjuntoconLimite((int) (Math.random()*30), 150);
		t4=DatosEj.CrearConjuntoconLimite((int) (Math.random()*40), 200);
		t5=DatosEj.CrearConjuntoconLimite((int) (Math.random()*50), 250);
		
	}

}
