package Ejemplo2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Eje2Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Para la interfaz set, encontramos 3 implementaciones diferentes:
		 * hashSet: tiene un buen rendimiento, aunque no garantiza orden en la insercion
		 * 
		 * TreeSet: garantiza el orden basado en un valor de los elementos insertados. Este valor
		 * viene dadp `pr un valor comparador en el constructor
		 * 
		 * LinkedHashShet: garantiza el orden basado en la insercion, ya que siempre inserta los
		 * nodos al final.
		 */
		
		TreeSet<Clientes> conjunto= new TreeSet();//TreeSet garantiza el orden por interfaz comparable
		
		Clientes c1 = new Clientes(1,"Raquel","654343565");
		Clientes c2 = new Clientes(2,"Ana","666777888");
		Clientes c3 = new Clientes(3,"Esther","678567890");
		Clientes c4 = new Clientes(4,"Maria","678129890");
		
		conjunto.add(c1);
		conjunto.add(c2);
		conjunto.add(c3);
		conjunto.add(c4);//no permite elementos repetidos
		System.out.println(conjunto);
		
		conjunto.remove(c4);
		//los metodos vistos en arrayList de la clase collections son validos para los conjuntos
		System.out.println(conjunto);
		//ordena elementos Integer
		TreeSet<Integer> conjuntoEnteros= new TreeSet();
		conjuntoEnteros.add(5);
		conjuntoEnteros.add(2);
		conjuntoEnteros.add(3);
		conjuntoEnteros.add(1);
		conjuntoEnteros.add(6);
		System.out.println(conjuntoEnteros);
		
		//linkedHashSet ordena los elementos por orden de insercion
		//como ventaja no permite elementos repetidos
		LinkedHashSet<Integer> conjuntoEnteros2= new LinkedHashSet();
		conjuntoEnteros2.add(5);
		conjuntoEnteros2.add(2);
		conjuntoEnteros2.add(3);
		conjuntoEnteros2.add(1);
		conjuntoEnteros2.add(6);
		conjuntoEnteros2.add(6);
		System.out.println(conjuntoEnteros2);
		
		//conjuntos no ordenados, no garantiza el orden de los elementos
		HashSet<Clientes> cjto= new HashSet();
		cjto.add(c1);
		cjto.add(c2);
		cjto.add(c3);
		cjto.add(c4);
		cjto.add(c1);
		System.out.println(cjto);
	}

}
