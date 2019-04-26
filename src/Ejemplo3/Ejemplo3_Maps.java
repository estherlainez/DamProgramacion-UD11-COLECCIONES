package Ejemplo3;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo3_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Son estructuras dinamicas cuyods nodos son pares clave/valor en vez de
		 * valores individuales
		 * 
		 * Usamos 3 interfaces de map:
		 * 
		 * HashMap:
		 * TreeMap:
		 * LinkedHashMap:
		 * diferencias similares a hashTree, treeSet y linkedHashSet
		 * 
		 * En un mapa se insertan nodos, llamados entradas, que constan de una clve(que no
		 * se puede repetir y un valor asociado que si puede ser repetido).
		 * 
		 * la clave y el valor deben ser clases, no pueden ser tipos primitivos.
		 * 
		 * 3 operaciones basicas: insercion, lectura y eliminacion
		 * 
		 * Sintaxis: Map <K,V> m = new HashMap();
		 */
		/*Ejemplo: guardar las estaturas de los alumnos asociados a los nombres.*/
		
		Map <String, Double> m= new HashMap();
		//vamos a insertar
		m.put("Paqui",1.67);
		m.put("Esther",1.60);
		m.put("Jorge",1.75);
		m.put("Eduardo",1.70);
		
	}

}
