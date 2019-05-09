package Ejercicio_06Mayo;
import java.util.*;
import java.util.Map.Entry;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Construir el mapa
		HashMap<String, Double> alumnos= new HashMap<String,Double>();
		alumnos.put("Paqui", 8.5 );
		alumnos.put("Maria", 7.5 );
		alumnos.put("Rosa", 9.5 );
		
		//Numero de entradas del mapa
		int numeroRegistros= alumnos.size();
		System.out.println("El numero de registros en el mapa es de  "+numeroRegistros);
		
		//Si existe Paqui en el mapa
		if(alumnos.containsKey("Paqui")) {
			System.out.println("Este registro ya existe");
		} 
		
		//Obtener la nota de Paqui
		Double nota = alumnos.get("Paqui");
		System.out.println("La nota de Paqui " +nota);
		
		//Le subimos un punto a la nota de Paqui
		alumnos.put("Paqui", 9.5);
		System.out.println(alumnos);
		
		//Recorro las claves		
		Set <String> alumnosClaves=new HashSet();
		alumnosClaves=(alumnos.keySet());
		System.out.println(alumnosClaves);
		
		//La mejor nota.....................
		
		//Creo un conjunto ordenado vacio y añado....
		TreeSet<String> valores= new TreeSet<String>();
		valores.add("uno");
		valores.add("dos");
		valores.add("tres");
		valores.add("cuatro");
		valores.add("cinco");
		
		System.out.println(valores);//como es treeSet y String implementa el compare me lo ordena por orden alfabetico
		
		int tamaño= valores.size();
		System.out.println("Tamaño es "+ tamaño);
		//Si claro, el metodo valores.size nos devuelve el tamaño o numero de elementos que tiene la coleccion
		
		
		
		//----------------Lista--------------------
		
		ArrayList <Pedido> listaProductos = new ArrayList<>();
		Pedido p1= new Pedido("teclado",5);
		listaProductos.add(p1);
		Pedido p2= new Pedido("raton",3);
		listaProductos.add(p2);
		Pedido p3= new Pedido("monitor",3);
		listaProductos.add(p3);
		Pedido p4= new Pedido("monitor",2);
		listaProductos.add(p4);
		
		for(Pedido e: listaProductos) {
			System.out.println(e.getProducto());
		}
		
		//Consulto si la coleccion de productos esta vacia
		if(listaProductos.isEmpty()) {
			System.out.println("La coleccion esta vacia");
		}else {
			System.out.println("La coleccion no esta vacia");
		}
		
		//consulto si esta el raton que es el producto p2
		if(listaProductos.contains(p2)) {
			System.out.println("El raton si esta");
		}
	

	
		//Imprimo el primero y el ultimo elemento de la coleccion
		System.out.println(listaProductos.get(0)+" ");
		System.out.println(listaProductos.get(3)+" ");
		
		//cambio el teclado por teclados
		Pedido cambio=new Pedido("teclados",5);
		listaProductos.set(0, cambio);
		System.out.println(listaProductos);
		
		
		//recorro con iterator
		Iterator it=listaProductos.iterator();
		while(it.hasNext()) {
			System.out.println("Producto: "+it.next()+" ");
		}
		System.out.println("\n");
		
		//borro el elemento monitor
		listaProductos.remove(p4);
		System.out.println(listaProductos);
		
		//Ordeno por nombre y muestro por pantalla
		TreeSet<Pedido> ordenaPedidos=new TreeSet<Pedido>(new Comparator<Pedido>() {
			public int compare(Pedido o1, Pedido o2) {
				String desc1=o1.getProducto();
				String desc2=o2.getProducto();
				return desc1.compareTo(desc2);
			}
		});
		ordenaPedidos.add(p1);
		ordenaPedidos.add(p2);
		ordenaPedidos.add(p3);
		ordenaPedidos.add(p4);
		
		for(Pedido p: ordenaPedidos) {
			System.out.println(p.getProducto());
		}
	}

}



class Pedido implements Comparable<Pedido>{
	private int cantidad;
	private String producto;
	public Pedido(String pro, int cant) {
		this.producto=pro;
		this.cantidad=cant;
	}
	
	public String getProducto() {
		return producto;
	}
	
	public String toString() {
		
		return "Producto [Nombre=" + producto + ", Cantidad=" + cantidad + "]";
				
	}
	
	@Override
	public int compareTo(Pedido o) {
		
		return producto.compareTo(o.getProducto());
	}

	
}