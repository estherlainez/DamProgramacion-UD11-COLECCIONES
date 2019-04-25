package Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un metodo de interseccion. Dados dos conjuntos como parametros 
		 * de entrada, debe devolver los elementos comunes a los dos conjuntos.
		 * Esta estructura sera ordenada
		 * 
		 * los conjuntos seran generados de forma aleatoria, el numero de 
		 * elementos sera de 1 a 50, y los valores de los elementos estaran 
		 * comprendidos entre 1 y 100.
		 * 
		 * 1) crear conjunto 1, conjunto2
		 * 2) Crear Metodo interserccion.
		 */
		
		//creo el conjunto1
		
		
		TreeSet <Integer> cjto1= new TreeSet();
		cjto1=DatosEj.CrearConjunto ((int) (Math.random()*100));
		System.out.println(cjto1);
		
		//creo el conjunto2
		TreeSet <Integer> cjto2= new TreeSet();
		cjto1=DatosEj.CrearConjunto ((int) (Math.random()*100));
		System.out.println(cjto2);
		
		
		/*     //<<<<<RESUELTO CON ITERATOR>>>>>>>>>>
		TreeSet <Integer> elementosComunes= new TreeSet();
		System.out.println("Los elementos comunes seran:");
		elementosComunes=DatosEj2.ElementosComunes(cjto1, cjto2);
		System.out.println(elementosComunes);
		*/
		TreeSet <Integer> insercion= new TreeSet();
		System.out.println("Los elementos comunes seran:");
		insercion=DatosEj.ElementosComunes(cjto1, cjto2);
		System.out.println(insercion);
	}

	

	
	
	

}
