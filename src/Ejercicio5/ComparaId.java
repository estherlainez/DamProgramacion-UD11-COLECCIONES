package Ejercicio5;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparaId implements Comparator<Clientes>{


	@Override
	public int compare(Clientes c1, Clientes c2) {
		int id1=c1.getId();
		int id2=c2.getId();
		return c1.getId()-c2.getId();
	}


}
