import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Torneo {
	String nombre;
	List<Equipo> equipos; 
	List<Partido> partidos;
	
	/**
	 * Constructor con parametros.
	 * @param nombre El nombre del torneo
	 */
	public Torneo (String nombre){
		//TODO implementar metodo
	}
	
	/**
	 * Retorna la cantidad máxima de equipos que podrían disputar
	 * el torneo
	 * @return int con el numero maximo de equipos permitidos
	 */
	abstract public int getNumeroMaximoDeEquipos();
	
	/**
	 * 
	 * @return el nombre del torneo
	 */
	public String getNombre(){
		//TODO implementar metodo
		return null;
	}
	
	/**
	 * Inicializa el torneo. Remueve todos los equipos y partidos del torneo 
	 */
	public void iniciarTorneo(){
		//TODO implementar metodo
	}
	
	/**
	 * Agrega un equipo al torneo solo si no se supera el numero maximo de equipos permitido
	 * @param e el equipo a agregar
	 * @return true si se pudo agregar el equipo, false en caso contrario
	 */
	public boolean addEquipo(Equipo e){
		//TODO implementar metodo
				return false;
	}
	
	/**
	 * Agrega un partido al torneo. Solo se pueden agregar partidos de equipos que pertenezcan al torneo
	 * @param p el partido a agregar
	 * @throws IllegalArgumentException si alguno de los equipos del partido no pertenece al torneo.
	 */
	public void addPartido (Partido p){	
		//TODO implementar metodo
	}
	
	/**
	 * Retorna la cantidad de partidos DISPUTADOS
	 * @return la cantidad de partidos disputados del torneo.
	 */
	public int partidosDisputados(){
		//TODO implementar metodo
		return -1;
	}
	
	/**
	 * Retorna la cantidad de equipos en el torneo
	 * @return la cantidad de equipos
	 */
	public int cantidadDeEquipos(){
		//TODO implementar metodo
				return -1;
	}
	

	/**
	 * Retorna la cantidad de partidos TOTALES en el torneo
	 * @return la cantidad de partidos
	 */
	public int cantidadDePartidos(){
		//TODO implementar metodo
				return -1;
	}
	
	/**
	 * Retorna el torneo como String con el siguiente formato
	 * "Torneo: <Nombre_del_troneo> (<cantidad_de_equipos> equipos) - [<equipo1>][<equipo2>][<equipo3>]"
	 * Ej. 
	 * "Torneo: Amistad (4 equipos) - [BOCA][RIVER][TALLERES][BELGRANO]"
	 * 
	 * @return el String con los equipos
	 */
	public String toString(){
		//TODO Implementar metodo
				return null;
	}
	
	
	/**
	 * Retorna un mapa de <Equipos, Desempenio> representando el desempeño
	 * de cada equipo en este torneo.
	 * 
	 * Utilice una implementación de Desempenio que otorgue 
	 * 2 puntos por victoria, 1 por empate y 0 por derrota
	 *
	 * Ej.
	 * Para un torneo con equipos e1,e2,e3,e4 y 
	 * partidos 
	 * 	p1 = e1 vs. e2  [LOCAL]
	 * 	p2 = e3 vs. e4  [EMPATE]
	 *  p3 = e2 vs. e3  [VISITANTE]
	 *  p3 = e4 vs. e1  [PENDIENTE]
	 *  
	 *  las posiciones deberían ser
	 *  e1 -> 2 puntos, 1 partido jugado, 1 victoria
	 *  e2 -> 0 puntos, 2 partidos jugados, 2 derrotas
	 *  e3 -> 3 puntos, 2 partidos jugados, 1 victoria, 1 empate 
 	 *  e4 -> 1 punto, 1 partido jugado, 1 empate 
	 *  
	 * @return el mapa
	 */
	public Map<Equipo,Desempenio> getPosiciones(){
		//TODO Implementar metodo
		HashMap<Equipo,Desempenio> mapa = new HashMap<Equipo,Desempenio>();
		return null;
	}
	
			
}	


