import java.util.List;


public interface Historial {
	
	/**
	 * Devuelve el registro con la fecha mas antigua en el Historial, o NULL cuando
	 * el historial est� vac�o
	 * 
	 * @return el registro m�s antiguo del historial 
	 * 
	 */
	public Registro getRegistroMasViejo();
	
	/**
	 * Agrega un nuevo registro al historial. No acepta registros NULL (lanza IllegalArgumentException)
	 * @param r
	 * @throws RegistroDuplicadoException cuando se intenta agregar m�s de una vez el MISMO registro al historial
	 * 
	 */
	public void agregarRegistro(Registro r) throws RegistroDuplicadoException;
	
	/**
	 * Busca Registros por ID en el historial. Si no hay registros con el ID solicitado, retorna NULL.
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
	 * Retorna la cantidad de registros que hay cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros();
	
	/**
	 * Retorna una lista con todos los registros del tipo solicitado existentes en el historial
	 * Si el tipo solicitado es NULL, devuelve una lista vac�a.
	 * @param tipo
	 * @return
	 */
	public List<Registro> getRegistrosPorTipo(TipoRegistro tipo);
}
