package Ejercicios;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;



public class DatosEj {
	public static TreeSet CrearConjunto(int numero) {
		System.out.println("El numero de elementos sera de: "+numero);
		TreeSet <Integer> cjto= new TreeSet();
		for(int i=1;i<=numero;i++) {
			numero=(int)(Math.random()*100);
			cjto.add(numero);
			
		}
		System.out.println(cjto+"\n");
		return cjto;
	}
	
	public static TreeSet CrearConjuntoconLimite(int numeroElementos,int limite) {
		System.out.println("El numero de elementos sera de: "+numeroElementos);
		int numero=0;
		TreeSet <Integer> cjto= new TreeSet();
		for(int i=1;i<=numeroElementos;i++) {
			numero=(int)(Math.random()*limite);
			cjto.add(numero);
			
		}
		System.out.println(cjto+"\n");
		return cjto;
	}
	
	
	public static TreeSet conjuntoFinal(TreeSet <Integer> cjto1, TreeSet <Integer> cjto2) {

		TreeSet <Integer> conjuntoFinal= new TreeSet();
		conjuntoFinal.addAll(cjto1);
		conjuntoFinal.addAll(cjto2);
	
		return conjuntoFinal;
	}
	public static  TreeSet ElementosComunes(TreeSet <Integer> cjto1, TreeSet <Integer> cjto2) {
		TreeSet <Integer> intersecion = new TreeSet<>();
		/******  ITERATOR CON FOR  ********
		for(Iterator it=cjto1.iterator();it.hasNext();) {

			Integer d=(Integer) it.next();
			if(cjto2.contains(d)) {
				intersecion.add(d);
			}
		}
		*/
		Iterator <Integer>it=cjto1.iterator();
		while(it.hasNext()) {
			Integer e=(Integer) it.next();
			if(cjto2.contains(e)) {
				intersecion.add(e);
			}
		}
		return intersecion;
	}
	
	
	public static  TreeSet<Integer> insercion (TreeSet cjto1,TreeSet cjto2){
		TreeSet <Integer> copia = new TreeSet<>();
		copia.retainAll(cjto2);
		
		return copia;
		
	}
	

}
