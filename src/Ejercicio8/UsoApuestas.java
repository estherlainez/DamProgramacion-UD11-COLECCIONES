package Ejercicio8;

import java.util.*;

public class UsoApuestas {

	public static void main(String[] args) {
		
		Map <String, Apuesta> m= new HashMap();
		
//insertar apuestas
		m.put("antonio", new Apuesta(3,1,30));
		m.put("enrique", new Apuesta(4,2,20));
		m.put("javi", new Apuesta(0,3,15));
		m.put("jorge", new Apuesta(2,3,10));
		m.put("paqui", new Apuesta(4,1,25));
		
				
//generar resultado
		Resultado combinacionGanadora = new Resultado (3,1);
		
//Calcular ganancia
		Apuesta Ap;
		double total=0, apuestaGanadores=0,probabilidad, dinero;
		Map <String, Apuesta> ganadores= new TreeMap();
		
		for (String clave: m.keySet()) {
			total=total+m.get(clave).dineroApostado;
			Resultado rpro=(m.get(clave)).getR();
//Buscar los ganadores
			if ((rpro.getLocal()==combinacionGanadora.getLocal())&&(rpro.getVisitante()==combinacionGanadora.getVisitante())) {
				ganadores.put(clave, m.get(clave));
				apuestaGanadores=apuestaGanadores+(m.get(clave).getDineroApostado());
			}
		}
		
		probabilidad=total/apuestaGanadores;
		for (String clave: ganadores.keySet()) {
			Ap=(ganadores.get(clave));
			dinero=Ap.getDineroApostado();
			dinero=dinero*probabilidad;
			Ap.setDineroApostado(dinero);
			ganadores.put(clave,Ap);
		}
		
			
		System.out.println("Ha/n ganado...."+ganadores);
		System.out.println("total apostado: "+total+" porcentaje: "+probabilidad + "\n");
		
//estadisticas
		//1) Calcular que equipo creen nuestros apostantes será el ganador. 
		int ganadorLocal=0,ganadorVisitante=0,empate=0,golesLocal=0,golesVisitante=0;
		for(String clave: m.keySet()) {
			Resultado rpro=(m.get(clave)).getR();
			golesLocal=golesLocal+rpro.getLocal();
			golesVisitante= golesVisitante+rpro.getVisitante();
			
			if(rpro.getLocal()>rpro.getVisitante()) {
				ganadorLocal ++;
			} else if(rpro.getLocal()<rpro.getVisitante()) {
				ganadorVisitante ++;
			}else {
				empate++;
			}
			
		}
		

		if(ganadorLocal<ganadorVisitante) {
			System.out.println("Nuestros apostantes creen que ganara el equipo visitante");
		} else if(ganadorLocal>ganadorVisitante) {
			System.out.println("Nuestros apostantes creen que ganara el equipo local");
		}else {
			System.out.println("Nuestros apostantes creen que apostaran");
		}
		
		//2) Media de goles en el partido

		double mediagolesLocal, mediagolesVisitante;
		
		mediagolesLocal=(golesLocal/m.size());
		mediagolesVisitante=(golesVisitante)/m.size();
		
		
		System.out.println("La media de los goles locales de nuestras apuestas es de " + mediagolesLocal);
		System.out.println("La meida de los goles visitantes de nuestras apuestas es de " + mediagolesVisitante+ "\n");
		
		//3) Cual es nuestro mejor apostante. Aquel que ha ganado mas dinero
		double max=0; String clGanador="";
		
		
		for (String clave: m.keySet()) {
			Apuesta ap= ganadores.get(clave);
			//System.out.println ("holacaracola"+ap.getDineroApostado());
			if (ap.getDineroApostado()>max) {
				max=ap.getDineroApostado();
				clGanador=clave;
			}
			System.out.println("El mejor de los ganadores es el siguiente:\n"+clGanador+"\n"+ ganadores.get(clave));

		}
	}
}
