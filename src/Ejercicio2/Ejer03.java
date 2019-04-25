package Ejercicio2;
import java.util.*;
public class Ejer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		/*Implementar un metodo union de dos conjuntos,que devuelva un nuevo conjunto
		 * con todos los elementos que pertenezcan, al menos a uno de los dos conjuntos
		 */
		
		TreeSet <Integer> cjto1= new TreeSet();
		cjto1=DatosEj2.CrearConjunto ((int) (Math.random()*100));
		System.out.println(cjto1);
		
		
		TreeSet <Integer> cjto2= new TreeSet();
		cjto2=DatosEj2.CrearConjunto((int) (Math.random()*100));
		System.out.println(cjto2);
		
		TreeSet <Integer> conjuntoFinal= new TreeSet();
		conjuntoFinal=DatosEj2.conjuntoFinal(cjto1, cjto2);
	
		System.out.println("El resultado seria: "+conjuntoFinal);
		
	}

}
