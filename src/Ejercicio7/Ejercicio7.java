package Ejercicio7;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realizar un programa que guarde en un map el nombre de usuario asociado
		 * a un objeto Persona(Puedes usar clase desarrollada en ejercicios anteriores).
		 * Este mapa debe poder añadir nuevos usuarios, eliminar un usuario segun una clave 
		 * leida por teclado y modificar un usuario en caso de que este presente en el mapa.
		 * */
		 
		Scanner teclado= new Scanner(System.in);
		
		//declaramos el map
		Map<String,Persona> m= new TreeMap();
		//insertamos 3 personas en el map
		Persona p1= new Persona("Paqui","garciacarricondo@iestubalcain.net", "user1","12345678");
		Persona p2= new Persona("Esther","esther.lainez.lainez@iestubalcain.net", "user2","12345678");
		Persona p3= new Persona("Jorge","jorgerivas@iestubalcain.net", "user3","12345678");
		
		m.put("pCarricondo", p1);
		m.put("eLinez", p2);
		m.put("jRivas", p3);
		System.out.println(m);
		int opcion;
		do {
			System.out.println("Menu");
		
			System.out.println("1. Insertar nuevo elemento en map");
			System.out.println("2.Modificar en map");
			System.out.println("3.Borrar en map");
			System.out.println("4.Salir");
			System.out.println("Introducir opcion: ");
			
			 opcion=teclado.nextInt();
			 teclado.nextLine();
			switch(opcion) {
			
			case 1:{
				System.out.println("1. Insertar nuevo elemento en map");
				Persona p4= new Persona("Javi","falceshernandez@iestubalcain.net", "user4","12345678");
				m.put("jFalces", p4);
				System.out.println(m);
			}
				break;
			case 2:{
				System.out.println("2.Modificar en map");
				/*1)Leemos por teclado la clave que queremos modificar
				 * 2) Si existe
				 * m.put(objeto con campo usuario modificado);
				 * 3)enviamos mensaje
				 */
			Set <String> arbolClaves=m.keySet();
			System.out.println(arbolClaves);
				System.out.println("Introduzca la clave que quiere modificar");
				String claveModificar= teclado.nextLine();
				if(m.containsKey(claveModificar)){
					
					Persona p= m.get(claveModificar);
					System.out.println("Introduzca el nuevo usuario que quiere modificar");
					String nuevoUser= teclado.nextLine();
					p.setUsuario(nuevoUser);
					m.put(claveModificar, p);
					System.out.println(m);
				}else {
					System.out.println("Este usuario no existe");
				}
				
			}
				break;
			case 3:{
					System.out.println("Introduzca la clave que quiere borrar");
					String claveBorrar= teclado.nextLine();
					if(m.containsKey(claveBorrar)){
						m.remove(claveBorrar);
						System.out.println(m);
					}else {
						System.out.println("Este usuario no existe");
					}
			}
				break;
			case 4:{
				System.out.println("4.Salir");
			}
				break;
				
			
			}
			
			
		
			
			
		}while (opcion!=5);
	}

}
