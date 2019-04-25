package Ejemplos;

import java.util.Comparator;


public class Clientes implements java.io.Serializable, Comparator {

	int numClientes;
	int limite=10;
	Clientes clientes[];
	String nombre;
	String telefono;
	int id;
	private static int identificador=1;
	
	Clientes(String n,String tel){
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
	public int compare(Object o1, Object o2) {
			Clientes Ob1 = (Clientes)o1;
			Clientes Ob2 = (Clientes)o2;
			if(Ob1.nombre.compareTo(Ob2.nombre)<0)return -1;
			if(Ob1.nombre.compareTo(Ob2.nombre)>0)return 1;
			return 0;
	}
	
	
	
}