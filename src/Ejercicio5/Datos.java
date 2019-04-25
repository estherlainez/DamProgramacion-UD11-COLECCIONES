package Ejercicio5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Datos {
	Scanner teclado=new Scanner(System.in);
	
	public static void mostrtarLista(TreeSet<Clientes> c) {
		for(Clientes e:c) {
			System.out.println(e.toString());
		}
	}
	
	
	public static  Clientes buscarClientePorNombre(String n, TreeSet <Clientes> c) {

		for(Clientes d: c) {
			if(d.getNombre().equals(n)) {
				return d;
			}
		}
		return null;
	}
	
	
	public static boolean BorrarCliente(Clientes d,TreeSet <Clientes> c) {
		
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
	
	
	
	
	
	public static Clientes ModificarDatos( Scanner teclado, TreeSet<Clientes>c) {

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
	
	public static TreeSet<Clientes> OrdenarPorID(TreeSet<Clientes>c) {
		ComparaId ordenaId=new ComparaId();
		TreeSet<Clientes> ordenId=new TreeSet();
		ordenId.addAll(c);
		return ordenId;
		
		
	}
	
	

}
