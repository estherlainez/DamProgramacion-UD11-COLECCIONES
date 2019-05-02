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
		int ganadorLocal=0,ganadorVisitante=0,empate=0;
		for(String clave: m.keySet()) {
			Resultado rpro=(m.get(clave)).getR();
			if(rpro.getLocal()>rpro.getVisitante()) {
				ganadorLocal ++;
			} else if(rpro.getLocal()<rpro.getVisitante()) {
				ganadorVisitante ++;
			}
			
		}
		

		if(ganadorLocal<ganadorVisitante) {
			System.out.println("Nuestros apostantes creen que ganara el equipo visitante");
		} else if(ganadorLocal>ganadorVisitante) {
			System.out.println("Nuestros apostantes creen que ganara el equipo local");
		}
		
		//2) Calcular la media de goles apostados
		
		int golesLocales, golesVisitantes;
		int sumaL=0,sumaV=0,mediaApostante=0,mediaL = 0,mediaV=0,totalMedia=0,totalGoles = 0;
		
		for(String clave: m.keySet()) {
			Resultado rpro=(m.get(clave)).getR();
			golesLocales=rpro.getLocal();
			golesVisitantes=rpro.getVisitante();
			
			sumaL= sumaL+ golesLocales;
			sumaV= sumaV+ golesVisitantes;
			
			mediaApostante=m.size();
			mediaL=sumaL/mediaApostante;
			mediaV=sumaV/mediaApostante;
			
			totalGoles=sumaL+sumaV;
			totalMedia=totalGoles/mediaApostante;
		}
		
		System.out.println("La suma de los goles locales de nuestras apuestas suma " + sumaL);
		System.out.println("La suma de los goles visitantes de nuestras apuestas suma " + sumaV+ "\n");
		
		System.out.println("Nuestros apostantes apuestan una media de goles para el equipo Local de  " + mediaL);
		System.out.println("Nuestros apostantes apuestan una media de goles para el equipo Visitante de  " + mediaV + "\n");
		
		System.out.println("Nuestros apostantes apuestan un total de Goles  " + totalGoles+ " entre los dos equipos");
		System.out.println("Nuestros apostantes apuestan una media de Goles de  " + totalMedia + " para los dos equipos\n");
		
		
	}
}
