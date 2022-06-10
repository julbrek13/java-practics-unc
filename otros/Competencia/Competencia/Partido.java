
public class Partido {
	Equipo e1;
	Equipo e2;
	Resultado r;
	
	
	/**
	 * Constructor con parametros. Representa un partido. Al iniciarse,
	 * el partido está pendiente
	 * 
	 * @param local equipo local
	 * @param visita equipo visitante
	 * 
	 * @throws IllegalArgumentException cuando algun equipo es null o cuando
	 * ambos equipos son el mismo equipo
	 */
	public Partido (Equipo local, Equipo visita){
		//TODO Implementar metodo
	}

	/**
	 * Getter del Equipo local
	 * @return el equipo local
	 */
	public Equipo getEquipoLocal() {
		//TODO Implementar metodo
				return null;	
	}

	/**
	 * Getter del Equipo visitante
	 * @return el equipo visotante
	 */
	public Equipo getEquipoVisitante() {
		//TODO Implementar metodo
				return null;	
	}

	
	/**
	 * Determina si el partido fue disputado. Un partido fue disputado
	 * cuando su resultado no está pendiente.
	 * @return si el partido fue disputado
	 */
	public boolean disputado() {
		//TODO Implementar metodo
				return true;	
	}
	
	
	/**
	 * Devuelve el resultado de este partido
	 * @return el resultado de este partido
	 */
	public Resultado getResultado() {
		//TODO Implementar metodo
				return null;	
	}
	
	
	/**
	 * Setea un resultado para este partido. 
	 * @param resultado El resultado de este partido
	 * @throws IllegalArgumentException si el resultado es inválido (null)
	 */
	public void setResultado(Resultado resultado){
		//TODO Implementar metodo
				
	}
	
	
	/**
	 * Retorna una representación como String del partido con el siguiente 
	 * formato:
	 * "Partido: <equipo_local> vs. <equipo_visitante> [<resultado>]"
	 * 
	 * 
	 * Ej.
	 * "Partido: boca vs. river [EMPATE]"
	 * 
	 */
	public String toString(){
		//TODO Implementar metodo
				return null;					
	}
}
