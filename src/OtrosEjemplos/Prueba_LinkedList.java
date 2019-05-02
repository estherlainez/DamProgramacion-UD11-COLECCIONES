package OtrosEjemplos;

import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> personas= new LinkedList<String>();
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		//añado elemento a la segunda posicion con el iterador
		
		ListIterator<String> it= personas.listIterator();
		it.next();
		it.add("Juan");
		
		for (String persona: personas ) {
			System.out.println(persona);
		}
	}

}
