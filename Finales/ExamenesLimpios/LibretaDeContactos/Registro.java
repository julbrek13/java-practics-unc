import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Registro {
	private List<Llamada> registro;
	
	public Registro(){
		registro = new ArrayList<Llamada> ();
	}
	
	public List<Llamada> getRegistroCompleto (){
		return registro;
	}
	
	public void agregarLlamada (Llamada llamada){
		registro.add(llamada);
	}
	
	public void limpiarRegistro (){
		registro.clear();
	}
	
	/**
	 * Devuelve una lista con las llamadas cursadas o recibidas del numero
	 * telefonico pasado como par�metro.
	 * Un numero valido contiene 10 digitos (luego de remover espacios
	 * previos o posteriores si los hubiera).
	 * 
	 * @param numero
	 * @return Lista de llamadas 
	 * @throws NumeroInvalidoException cuando el numero es null o con un formato invalido.
	 */
	abstract public List<Llamada> getLlamadasPorNumero (String numero) throws NumeroInvalidoException;
	
	/**
	 * Devuelve una lista con las llamadas salientes o entrantes
	 * 
	 * @param saliente true para obtener llamadas salientes, false para llamadas entrantes
	 * @return Lista de llamadas
	 */
	abstract public List<Llamada> getLlamadasPorDestino (boolean saliente);
	
	/**
	 * Devuelve un entero con la duracion total de las llamadas salientes y
	 * entrantes, en segundos
	 * 
	 * @return duracion total de llamadas
	 */
	abstract public int getDuracionTotalLlamadas ();
	
	/**
	 * Devuelve un mapa <String, EstadisticasNumero> 
	 * con las estadisticas de cada numero en la lista de llamadas. 
	 * 
	 * @param llamadas
	 * @return
	 */
	abstract public Map<String, EstadisticasNumero> getMapaDeEstadisticas (List<Llamada> llamadas);
	
}
