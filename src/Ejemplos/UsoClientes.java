package Ejemplos;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;



public class UsoClientes {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		
		int opcion=0,posicion=0,limite=10;
		
		
		ArrayList <Clientes> listaClientes = new ArrayList<>();
		Clientes p = null;
		File file = new File("c:\\archivos\\DatosClientes.dat");
		int i=0;
		
		if(file.exists()) {
			try {
				ObjectInputStream stream= new ObjectInputStream(new FileInputStream(file));
				while(true) {
			
					p =(Clientes) stream.readObject();			
					listaClientes.add(p);
					posicion++;

				}
			}catch(EOFException e) {
				System.out.println("Fin del fichero. Hemos recuperado "+listaClientes.size());
			}catch(IOException ex) {
				System.out.println("Error");
		
			}

		}else {//<<<<<<<<<seria una manera equivalente>>>>>>>>>>
			Clientes a= new Clientes(1,"Paqui","666555444");
			listaClientes.add (a);
			//listaClientes.add(new Clientes(1,"Paqui","666555444"));	
			Clientes s= new Clientes(2,"Pepa","666777987");
			//listaClientes.add(new Clientes(2,"Pepa","666777987"));
			listaClientes.add(s);
			Clientes f= new Clientes(3,"Maria","654321234");
			//listaClientes.add(new Clientes(3,"Maria","654321234"));
			listaClientes.add(f);
			Clientes g= new Clientes(4,"Pilar","609878009");
			listaClientes.add(g);
			//listaClientes.add(new Clientes(4,"Pilar","609878009"));

		}
	
		
		do {
			System.out.println("MENU");
			System.out.println("1.Añadir nuevo cliente");
			System.out.println("2.Insertar nuevo cliente por posicion");
			System.out.println("3.Ordenar Clientes por nombre");
			System.out.println("4.Ordenar Clientes por ID");
			System.out.println("5.Modificar datos");
			System.out.println("6.Dar de baja un cliente");
			System.out.println("7.Listar los clientes");
			System.out.println("8.Borrado de clientes multiple");
			System.out.println("9.Salir");
			System.out.println("Elija la opcion que desee realizar: ");
	
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("1.Añadir nuevo cliente");
				Clientes j=Datos.ObternerClienteTeclado(teclado);
				listaClientes.add(j);
		
				break;
			
			case 2:
				System.out.println("2.Insertar nuevo cliente por posicion");
				Datos.InsertarPorPosicion(teclado,listaClientes);
				
				//System.out.println(listaClientes);
				break;
				
			case 3:
				System.out.println("3.Ordenar Clientes por nombre");
				Datos.OrdenarPorNombre(listaClientes);
				
				break;
			case 4:
				System.out.println("4.Ordenar Clientes por ID");
				Datos.OrdenarPorID(listaClientes);
				
				break;
				
			case 5:
				System.out.println("Modificar datos");
				Datos.ModificarDatos(teclado, listaClientes);
				

				break;
			case 6:
				System.out.println("Dar de baja un cliente");
				System.out.println("¿Que cliente va a quitar de la lista? \nIntroduzca nombre: ");
				teclado.nextLine();
				String nombreBorrar=teclado.nextLine();

				Clientes objetoBorrar= Datos.buscarClientePorNombre(nombreBorrar,listaClientes);
				
				boolean borrar=Datos.BorrarCliente(objetoBorrar, listaClientes);
				
				break;
			case 7:
				System.out.println("Listar los clientes");
				Datos.mostrtarLista(listaClientes);
				
				break;
				
			case 8:
				System.out.println("8.Borrado de clientes multiple");
                  //paso 1: crear lista de los elelmentos que voy a borrar
                  ArrayList <Clientes> listaBorrados =new ArrayList<>();

                  String mas="si";
                  while (mas.equals("si")) {
                           System.out.print("Introduzca el nombre que quiere borrar: ");
                            nombreBorrar=teclado.nextLine();
                           teclado.nextLine();
                           p=Datos.buscarClientePorNombre(nombreBorrar, listaClientes);

                           if (p!=null) {//significa que hemos encontrado el clietne
                                    listaBorrados.add(p);                                                           
                           }

                           for (Clientes e:listaClientes) {
                                    System.out.println(e.toString());
                           }

                           System.out.println("Quiere borrar algun cliente mas?(si/no)");

                           mas=teclado.nextLine();

                  }

                  System.out.println(listaBorrados);

                  for (Clientes e:listaBorrados) {
                           System.out.println(e.toString());
                  }

                  listaClientes.removeAll(listaBorrados);

                  break;

   
			case 9:
				try {
					
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\archivos\\DatosClientes.dat"));
						
					for (Clientes m: listaClientes) {	
							out.writeObject(m);
					} 
					
					out.close();
					
				}catch (IOException x) {
						x.printStackTrace();
				}

					
				
				System.out.println("Hasta pronto!");
				break;
			
			}
		
		}while(opcion!=9);
	}

}



