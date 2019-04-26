package Ejercicio5;

import java.io.Serializable;
import java.util.Comparator;


public class Clientes implements Serializable,Comparable {

	int numClientes;
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
	
	 Clientes (int identificador,String n,String tel){
		this.nombre=n;
		this.telefono=tel;
		this.id=identificador;
	//	identificador ++;
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
	public int compareTo(Object Ob1) {
		System.out.println(((Clientes) Ob1).getId());
		System.out.println(this.getId());

		if (((Clientes) Ob1).getId()<this.getId()) return -1;
		if (((Clientes) Ob1).getId()>this.getId()) return 1;
		return 0;
	}
	
	
	
}