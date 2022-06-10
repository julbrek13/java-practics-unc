
public abstract class Registro {
	
	private Fecha fecha;
	protected String id;
	public Registro (String id, int anio, int dia, int hora, int minuto){
		fecha = new Fecha (anio,dia,hora,minuto);
		setID(id);
	}
	
	public Fecha getFecha (){
		return fecha;
	}
	
	public String getID(){
		return id;
	}

	
	/**
	 * Setea el ID de este registro. El ID se guarda como una
	 * cadena mayuscula y sin espacios. 
	 * @param id
	 * @throws InvalidArgumentException cuando el ID es nulo o vacio. 
	 */
	public abstract void setID(String id);
	
	/**
	 * Devuelve el tipo de registro.
	 * @return
	 */
	public abstract TipoRegistro getTipo();
}
