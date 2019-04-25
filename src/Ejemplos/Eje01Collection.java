package Ejemplos;
import java.util.ArrayList;

import java.util.Iterator;
public class Eje01Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sintaxis: ArrayList <Clase de objeto que voy a meter dentro> nombreColeccion = new ArrayList<>();
		ArrayList <Integer> listaEnteros = new ArrayList<>();
		/* añadir un elemento entero */
		
		listaEnteros.add(44);
		listaEnteros.add(58);
		listaEnteros.add(23);
		listaEnteros.add(12);
		listaEnteros.add(3);
		listaEnteros.add(30);
		
		//Recorrer una coleccion con for each
		for(Integer e: listaEnteros) {
			System.out.print("valor:"+ " "+e+"   ");
		}
		System.out.println("\n");
		
		//saber el tamaño de una coleccion

				int numero;
				System.out.println("tamaño: "+listaEnteros.size());
				
				//recorrer una coleccion. Iterador
				
				Iterator it=listaEnteros.iterator();
				while(it.hasNext()) {
					System.out.println("valor: "+it.next()+" ");
				}
				System.out.println("\n");
				
				//Eliminar un elemneto en concreto
				
				if(listaEnteros.contains(3)) {
					listaEnteros.remove(3);
					System.out.println("Hemos borrado");
					
				}
				
				//Usar el metodo IsEmpty (). Usar el metodo clear;
				if(!listaEnteros.isEmpty()) {
					System.out.println("La coleccion esta vacia");
				}else {
					listaEnteros.clear();
				}
				
				//Ejemplo: metodos globales

				ArrayList <String> listaChicos = new ArrayList<>();
				listaChicos.add("Pepe");
				listaChicos.add("Julian");
				listaChicos.add("Roberto");
				listaChicos.add("Raul");
				
				ArrayList <String> listaChicas = new ArrayList<>();
				listaChicas.add("Maria");
				listaChicas.add("Juana");
				listaChicas.add("Luisa");
				listaChicas.add("Patricia");
				
				//Añadir todos los elementos de una lista a otra, siempre que sean del mismo tipo
				ArrayList <String> listaCadenas = new ArrayList<>();
				
				listaCadenas.addAll(listaChicas);
				listaCadenas.addAll(listaChicos);
				for(String e:listaCadenas) {
					System.out.println(" "+e+" ");
				}
	
				System.out.println("\n");
				
				/*Eliminar todos los elementos que estan en una colleccion
				  removeAll() Si los elementos de la colecion pasada como parametro
				  estan en nuestra coleccion, se eliminan, el resto se quedan
				  */
				listaCadenas.removeAll(listaChicos);
				for(String e:listaCadenas) {
					System.out.println(" "+e+" ");
				}
				System.out.println("\n");
				/*boolean containsAll (Collection <?< otra) Si la colecion contiene todos los elementos
				 * de otra colecion devuelve verdadero
				 * Ejemplo: Si no estan los hombres les añadimos, y si no estan las mujeres les añadimos
				 * 
				 */
				if(!listaCadenas.containsAll(listaChicos)) {
					listaCadenas.addAll(listaChicos);
				}else {
					System.out.println("Ya estan los chicos ");
				}
				
				if(!listaCadenas.containsAll(listaChicas)) {
					listaCadenas.addAll(listaChicas);
				}else {
					System.out.println("Ya estan las chicas ");
				}
				
				for(String e:listaCadenas) {
					System.out.println(" "+e+" ");
				}
				System.out.println("\n");
				
				/*boolean retainAll (Collection <?> otra)
				 * Si los elementos de la coleccion pasada como parametro en nuestra collecion,
				 * se dejan, el resto se eliminan
				 */
				listaCadenas.retainAll(listaChicos);
				for(String e:listaCadenas) {
					System.out.println(" "+e+" ");
				}
				System.out.println("\n");
				listaCadenas.addAll(listaChicos);//¿Como restauramos la coleccion?
				
				/*T[] toArray (T[] array)
				 * Convierte la coleccion en un array de objetos. 
				 * El array devuelto contiene todos los elementos dre la coleccion y es del mismo tipo
				 * (de hecho es la unica utilidad que tiene este argumento,
				 * la de decir el tipo de array que se ha de devolver)
				 * */
				  String[] miarray = new String[listaCadenas.size()];
				  miarray = listaCadenas.toArray(miarray);
				  
				  
				  /*METODOS ESPECIFICOS DE LA CLASE LIST
				   *vistos los metodos de la clase collection, vemos los metodos especificos de la clase
				   *ArrayList.
				   *Las listas se caracterizan por permitir elementos repetidos, y la importancia del
				   *orden de los elementos, por tanto, podemos acceder a los diferentes elementos a traves 
				   *de su posicion.
				   *Tomamos como referencia lo aprendido de los Arrays y vemos los metodsos que nos proporciona
				   *esta clase
		
				   * 
				   */
				 ArrayList <Integer> listaEnteros1 = new ArrayList<>();
				 	listaEnteros1.add(44);
					listaEnteros1.add(58);
					listaEnteros1.add(23);
					listaEnteros1.add(12);
					listaEnteros1.add(3);
					listaEnteros1.add(30);
					listaEnteros1.add(443);
					listaEnteros1.add(588);
					listaEnteros1.add(236);
					listaEnteros1.add(152);
					listaEnteros1.add(53);
					listaEnteros1.add(350);
				 
					
				/*get(int posicion) devuelve el elemento que hay en la posicion que se le pase
				 *por parametro. Al igual que en arrays, los indices comienzan de 0 a n
				 */
				Integer valor=listaEnteros1.get(5);
				System.out.println("El valor de la posicion 5 es "+valor);
				System.out.println("El primer elemento de la lista es: "+listaEnteros1.get(0));
				System.out.println("El ultimo elemento de la lista es: "+listaEnteros1.get(listaEnteros1.size()-1));
				
				/*3 formas de ver por pantalla todos los elementos de una lista
				 * basica, for-each,for

				 */
				System.out.println(listaEnteros1);//imprimimos de forma basica
				
				int sumador=0;
				for(int i=0;i<listaEnteros1.size()-1;i++) {
					System.out.print(listaEnteros1.get(i)+"\t");//imprimimos con get
					sumador=sumador+listaEnteros1.get(i);
				}
				System.out.println("La suma es "+sumador);
				System.out.println();
				
				for(Integer e: listaEnteros1) {
					System.out.print(" Imprimimos con foreach "+e+" ");
					sumador=sumador+e;
				}
				
				System.out.println("La suma es "+sumador);
				System.out.println();
				
				/*set (int indice, Clase objeto) guarda el elemento objeto de la clase que se compone
				 *nuestra lista en la posicion del indice pasado como parametro.
				 */
				
				System.out.println(listaEnteros1);
				Integer valor2=22;
				listaEnteros1.set(3, valor2);
				System.out.println(listaEnteros1);
					
				/*add (int indice,Clase objeto) para guardar un elemento en una posicion concreta*/
				listaEnteros1.add(0, valor2);
				System.out.println(listaEnteros1);
				
				/*boolen addAll (int indice, Collection c) inserta todos los elementos de la coleccion
				 *c en la lista que invoca al metodo, empezando por el lugar indice y desplazando hacia todos los nodos de 
				 *la lista original a partir del indice, incluido este
				 */
				
				ArrayList <String>listaChicos1 = new ArrayList <>();
				
				listaChicos1.add("Pepe");
				listaChicos1.add("Julian");
				listaChicos1.add("Roberto");
				listaChicos1.add("Raul");
				

				ArrayList <String>listaChicas1 = new ArrayList <>();
				
				listaChicas1.add("Maria");
				listaChicas1.add("Juana");
				listaChicas1.add("Luisa");
				listaChicas1.add("Patricia");
				
				ArrayList <String>listaCadenas1 = new ArrayList <>();
				
				listaCadenas1.addAll(0,listaChicas1);
				listaCadenas1.addAll(2,listaChicos1);
				System.out.println(listaCadenas1);
				
				/*remove (int indice) borra el elemento que hay en esa posicion indice. 
				 */
				listaCadenas1.remove(0);
				System.out.println(listaCadenas1);
				
				/*int indexOf (Clase Objeto) devuelve el indice de la primera ocurrencia del
				 * objeto en la lista. Si no esta, devuelve -1;
				 */
				int donde=listaCadenas1.indexOf("Patricia");
				System.out.println("Patricia esta en la posicion "+donde);
				
				/*equals (Clase otraLista) te dice si dos listas son iguales, esto es:
				 * tienen los mismos elementos en la misma posicion
				 */
				
				listaCadenas1.clear();
				listaCadenas1.addAll(listaChicos);
				boolean iguales= listaChicos1.equals(listaCadenas1);
				System.out.println(iguales);
	}

}
