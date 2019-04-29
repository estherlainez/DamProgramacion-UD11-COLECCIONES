package Ejemplo3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		
		/*Map <Tipo_Klave, Tipo_Valor> nombreMap = new HashMap();*/
		Map <String, Double> m= new HashMap();
		
		//vamos a insertar
		m.put("Paqui",1.67);
		m.put("Maria",1.79);
		m.put("Luisa",1.70);
		m.put("Carlos",1.68);
		
		System.out.println(m);
		
		/*Si queremos modificar, insertamos otra vez el nodo con la misma clave y el nuevo valor*/
		
		m.put("Paqui", 1.89);	
		System.out.println(m);
		
		//Si queremos eliminar un nodo:
		m.remove("Paqui");
		System.out.println(m);
		
		//Elimina todas las entradas dejando el mapa vacio
		//m.clear();
		//System.out.println(m);
		
		//Devolver el valor asciado con una clave concreta.
		//Ejemplo: mostrar la estatura de Paqui
		//Devuelve null si no encurentra el valor de la clave
		
		Double estatura = m.get("Maria");
		System.out.println(estatura);
		
		
		//Metodo para saber si una detertminada clave esta presente en el mapa. devuelve true o false
		
		//boolean contains (Key);
		boolean esta= m.containsKey("Paqui");
		System.out.println(esta);
		
		//Este metodo es muy util para comparar si una clave ya esta añadida
		if(m.containsKey("Paqui")) {
			System.out.println("Esa clave ya esta añadida");			
		}else {
			m.put("Paqui", 1.87);
		}
		
		if(m.containsKey("Paqui")) {
			System.out.println(estatura=m.get("Paqui"));		
		}
		
		//Analogamente, para saber si hay alguna entrada con un valor predeterminado.
		if(m.containsValue(1.87)) {
			System.out.println(m.containsValue(1.87));
		}
		
		//Vamos a obtener un arbol de las claves presentes en un mapa
		
		//Set <k> keySet();
		Set <String> conjuntoClaves=new HashSet();
		conjuntoClaves=(m.keySet());
		System.out.println(conjuntoClaves);
		
		//Vamos a obtener un arbol con los valores presentes en el mapa
		Collection <Double> valores = m.values();
		System.out.println(valores);
		
		/*Disponemos de otra funcionalidad para obtener las entradas (par clave/valor)
		y poder manejar esos datos.*/
		
		//Convertimos el map en un arbol o conjunto
		
		Set<Map.Entry<String, Double>> conjuntoMap=m.entrySet();
		System.out.println(conjuntoMap);
		
		/*Inconveniente de los mapas es que no son iterables*/

		
		
	}

}
