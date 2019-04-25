package Ejemplo2;

import java.util.Comparator;


public class Clientes implements Comparable {

	int numClientes;
	int limite=10;
	Clientes clientes[];
	String nombre;
	String telefono;
	int id;
	private static int identificador=1;
	
	public Clientes(String n,String tel){
		this.nombre=n;
		this.telefono=tel;
		this.id=identificador;
		identificador ++;
	}
	
	public Clientes(int identificador,String n,String tel){
		this.nombre=n;
		this.telefono=tel;
		this.id=identificador;
		identificador ++;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Clientes.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", id=" + id + "]\n";
	}

	public void print() {
		System.out.println(nombre + " -> " + telefono + id );
		
	}

	

	@Override
	public int compareTo(Object o1) {
		Clientes Ob1 = (Clientes)o1;		
		return this.getNombre().compareTo(Ob1.getNombre());
	}
	
	
	
}