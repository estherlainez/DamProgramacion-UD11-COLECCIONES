package OtrosEjemplos;
import java.util.*;
public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El treeSet implemente la interfaz comparable
		//La lista se mostrara en este caso por orden alfabetico
		//String implementa el compareTo para ordenar los objetos
		//por orden alfabetico
		
		TreeSet<String> ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		ordenaPersonas.add("Esther");
		
		for(String s: ordenaPersonas) {
			System.out.println(s);
		}
		
		//si lo que le paso son objetos, me creo una clase y me hare
		//en la clase el metodo comparable
		Articulo primero= new Articulo(1,"Primer Articulo");
		Articulo segundo= new Articulo(2,"Segundo Articulo");
		Articulo tercer= new Articulo(3,"Este es el Tercer Articulo");
		
		TreeSet<Articulo> ordenarArticulos=new TreeSet<Articulo>();
		ordenarArticulos.add(tercer);
		ordenarArticulos.add(primero);
		ordenarArticulos.add(segundo);
		
		for(Articulo art: ordenarArticulos) {
			System.out.println(art.getDescripcion());
		}
		/*
		Articulo comparadorArticulos=new Articulo();
		TreeSet <Articulo> ordenaArticulos2= new TreeSet<Articulo>(comparadorArticulos);
		*/
		//Si hago el metodo compare en una clase me creo el nuevo comparador
		//ComparadorArticulos compara_art=new ComparadorArticulos();
		
		//La forma ideal para hacer esto es en una clase anonima
		
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
				String desc1=o1.getDescripcion();
				String desc2=o2.getDescripcion();
				return desc1.compareTo(desc2);
			}
		});
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercer);
		
		for(Articulo art: ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		}
		
	}

}

class Articulo implements Comparable<Articulo>{

	public Articulo(int num, String desc) {
		num_articulo=num;
		descripcion=desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	private int num_articulo;
	private String descripcion;
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return num_articulo - o.num_articulo;
	}

	
}

