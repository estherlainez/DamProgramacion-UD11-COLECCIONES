package OtrosEjemplos;
import java.util.*;
public class Prueba_Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*  clave,   valor                */
		HashMap<String,Empleado> personal= new HashMap<String,Empleado>();
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Esther"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		//para borrar a un elemento del mapa
		personal.remove("147");
		System.out.println(personal);
		
		//para sustituir un elemento con la misma clave
		personal.put("148", new Empleado("Natalia"));

		System.out.println(personal);
		//La interfaz entry, nos devuelve una coleccion de tipo set y
		//nos imprime la coleccion
		
		System.out.println(personal.entrySet());
		
		//para recorrer el mapa con un for each
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			String clave=entrada.getKey();
			Empleado valor= entrada.getValue();
			System.out.println("Clave: "+clave+", Valor: "+valor);
		}
	}

}

	class Empleado{
		public Empleado(String n) {
			nombre=n;
			sueldo=2000;		
		}
		
		public String toString() {
			return "[Nombre= "+nombre+", Sueldo= "+sueldo+"]";
		}
		
		private String nombre;
		private double sueldo;
	}
