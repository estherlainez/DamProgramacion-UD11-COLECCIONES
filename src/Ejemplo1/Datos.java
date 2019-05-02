package Ejemplo1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Datos {
	Scanner teclado=new Scanner(System.in);
	
	public static void mostrtarLista(ArrayList<Clientes> c) {
		for(Clientes e:c) {
			System.out.println(e.toString());
		}
	}
	
	
	public static  Clientes buscarClientePorNombre(String n, ArrayList <Clientes> c) {

		for(Clientes d: c) {
			if(d.getNombre().equals(n)) {
				return d;
			}
		}
		return null;
	}
	
	
	public static boolean BorrarCliente(Clientes d,ArrayList <Clientes> c) {
		
		boolean borrar=false;
		if(c.contains(d)) {
			c.remove(d);
			borrar=true;		
		}
		
		return borrar;		
	}
	
	
	public static Clientes ObternerClienteTeclado(Scanner teclado) {
		System.out.println("¿Que cliente va a añadir?");
		System.out.println("Introduzca id:");
		int id=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca nombre:");
		String nombre=teclado.nextLine();
		System.out.println("Introduzca telefono:");
		String telefono=teclado.nextLine();
		Clientes p= new Clientes(id,nombre,telefono);
		return p;		
	}
	
	
	public static void InsertarPorPosicion(Scanner teclado, ArrayList<Clientes>c) {
		Clientes r=Datos.ObternerClienteTeclado(teclado);
		System.out.println("Inserte la posicion a insertar, tiene que ser menor que"+c.size());
		int posi= teclado.nextInt();
		c.add(posi, r);
	}
	
	
	public static Clientes ModificarDatos( Scanner teclado, ArrayList<Clientes>c) {

		System.out.println("Que cliente  va a modificar?");
		teclado.nextLine();
		String nombreModificar=teclado.nextLine();
		System.out.println("Introduzca los nuevos datos.\nNombre");
		String nombreNuevo=teclado.nextLine();
		System.out.println("Telefono");
		String telefonoNuevo=teclado.nextLine();
		
		
		Clientes objetoModificar=null;
		
		for(Clientes d: c) {
			if(d.getNombre().equals(nombreModificar)) {
				objetoModificar=d;
				d.setNombre(nombreNuevo);
				d.setTelefono(telefonoNuevo);
			}
			
		}
		return objetoModificar;
		
	}
	
	public static void OrdenarPorNombre(ArrayList<Clientes>c) {
		Collections.sort(c, new Comparator() {
			public int compare(Object o1, Object o2) {
				Clientes Ob1 = (Clientes)o1;
				Clientes Ob2 = (Clientes)o2;
				if(Ob1.nombre.compareTo(Ob2.nombre)<0)return -1;
				if(Ob1.nombre.compareTo(Ob2.nombre)>0)return 1;
				return 0;
			}
		});
		System.out.println(c.toString());
	}
	
	
	public static void OrdenarPorID(ArrayList<Clientes>c) {
		Collections.sort(c, new Comparator() {
			public int compare(Object o1, Object o2) {
				Clientes Ob1 = (Clientes)o1;
				Clientes Ob2 = (Clientes)o2;
				if(Ob1.getId()<(Ob2.getId()))return -1;
				if(Ob1.getId()>(Ob2.getId()))return 1;
				return 0;
			}
		});
		System.out.println(c.toString());
	}

}
