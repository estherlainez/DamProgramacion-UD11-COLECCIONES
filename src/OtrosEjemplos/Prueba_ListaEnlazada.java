package OtrosEjemplos;
import java.util.*;
public class Prueba_ListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> paises= new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList <String> capitales= new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		//añado a cada pais su capital de la lista de capitales
		
		while(iterB.hasNext()) {
			if(iterA.hasNext()) {
				iterA.next();
			}
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);
		
		//voy a eliminar los elementos pares de la lista capitales
		
		iterB=capitales.listIterator();
		while(iterB.hasNext()) {
			iterB.next();
			if(iterB.hasNext()) {
				iterB.next();
				iterB.remove();
			}
		}

		System.out.println(capitales);
		
		//aqui me cargo las capitales que me quedan
		paises.removeAll(capitales);
		System.out.println(paises);
	}

}
