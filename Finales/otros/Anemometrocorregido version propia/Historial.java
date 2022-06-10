import java.util.List;
import java.util.Map;


public interface Historial {
	
	/**
	 * Devuelve el registro con la fecha m�s antigua en
	 * el Historial, o NULL cuando el historial esta vacio
	 * 
	 * @return el registro mas antiguo del historial 
	 * 
	 */
	public Registro getRegistroMasViejo();
	
	/**
	 * Agrega un nuevo registro al historial. No acepta
	 * registros NULL (lanza IllegalArgumentException)
	 * @param r
	 * @throws RegistroDuplicadoException cuando se intenta
	 * agregar registros con el mismo ID
	 * 
	 */
	public void agregarRegistro(Registro r) throws RegistroDuplicadoException;
	
	/**
	 * Busca Registros por ID en el historial. Si no hay
	 * registros con el ID solicitado, retorna NULL.
	 * No acepta NULL como argumento (lanza IllegalArgumentException)
	 * @param id
	 * @return
	 */
	public Registro getRegistroPorId(String id);
	
	
	/**
	 * Remueve todos los Registros del Historial
	 */
	public void eliminarTodosLosRegistros();
	
	/**
	 * Retorna la cantidad total de registros que hay
	 * cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros();
	
	/**
	 * Retorna la cantidad de registros que hay cargados
	 * en el historial por tipo
	 * @param tipo
	 * @return
	 */
	public int getNumeroDeRegistrosPorTipo(TipoRegistro tipo);
	
	/**
	 * Retorna un mapa de <String, Registro>, en donde
	 * el String representa el ID del registro
	 * 
	 * @return
	 */
	public Map<String, Registro> getMapaDeRegistrosPorId();
}
