import java.util.List;

public class Cliente {
	protected String nombre;
	protected Medidor medidor;
	protected List<Lectura>lecturas;
	
	/**
	 * Constructor.1:Inicializa la variable "nombre" del cliente,
	 * Crea la lista de lecturas e inicializa la variable "lecturas"
	 * 
	 * @param nom Nombre del cliente. El nombre debe persistirse en
	 * minusculas y sin espacios al principio o fin de la cadena.
	 */
	public Cliente (String nom){
		//TODO Implementar constructor
	}
	
	/**
	 * Retorna el nombre del cliente
	 * @return
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * 
	 * @return el Medidor asociado al cliente (Null si no tiene)
	 */
	public Medidor getMedidorAsociado(){
		return medidor;
	}
	
	/**
	 * 
	 * @return la lista de Lecturas realizadas sobre el medidor del cliente
	 */
	public List<Lectura> getLecturas(){
		return lecturas;
	}
	

	
	/**
	 * Este metodo:
	 * 1. Crea una nueva lectura con la fecha indicada y el consumo del medidor asociado.
	 * 2. Si la nueva lectura es valida, la agrega a la lista de lecturas del cliente. 
	 * (Puede utilizar los metodos de la clase Utils para validar la lectura)
	 * 
	 * @param f fecha de la lectura a agregar
	 * @throws IllegalStateException cuando el cliente no tiene medidor asociado.
	 * @throws LecturaInconsistenteException cuando la lectura es anterior a la ultima lectura de la lista
	 * o cuando el valor leido es inferior al valor de la ultima lectura
	 * 
	 */
	public void registrarNuevaLectura (Fecha f) throws LecturaInconsistenteException{
		//TODO Implementar metodo
	}
	
	
	/**
	 * Asocia un medidor a este cliente, si es que no tiene ningun medidor asociado. 
	 * Si el cliente ya tiene un medidor asociado, ignora esta nueva asociacion.
	 * @param m el Medidor a asociar
	 * @return true si se pudo asociar el medidor, false si el cliente ya tiene un medidor asociado.
	 */
	public boolean asociarMedidor(Medidor m){
		//TODO Implementar metodo
		return true;
	}
	
	/**
	 * 	Remueve el medidor asociado a este cliente,
	 *  y limpia la lista de lecturas asociadas
	 */
	public void removerMedidor(){
		//TODO Implementar metodo	
	}
	
	
	/**
	 * Obtiene el consumo para un periodo determinado. Si hay varias lecturas dentro del periodo
	 * indicado, retorna el consumo total entre el la primera y la ultima lectura dentro del
	 * periodo.
	 * (Puede utilizar los metodos de la clase Utils para obtener la lista con las lecturas comprendidas
	 * en el periodo especificado, y en base a ellas calcular el consumo)
	 * 
	 * Ej: Si las lecturas del cliente son
	 * Fecha (dia-anio) | Consumo
	 * 20-2015			| 200
	 * 50-2015			| 350
	 * 85-2015			| 470
	 * 120-2015			| 610
	 * 150-2015			| 770
	 * 
	 * Si se solicita el consumo del periodo 30-2015 al 130-2015, las lecturas del periodo seran
	 * Fecha (dia-anio) | Consumo
	 * 50-2015			| 350
	 * 85-2015			| 470
	 * 120-2015			| 610
	 * 
	 * y el consumo del periodo sera 260
	 * 
	 * Si se solicita el consumo del periodo 30-2015 al 40-2015 lanza IllegalStateException
	 * Si se solicita el consumo del periodo 50-2015 al 40-2015 lanza IllegalArgumentException
	 *  
	 * @param desde fecha inicial
	 * @param hasta fecha final
	 * @return el consumo 
	 * @throws IllegalArgumentException si la fecha desde es posterior a la fecha hasta
	 * @throws IllegalStateException si no hay lecturas en el periodo 
	 */
	public int consumoPeriodo (Fecha desde, Fecha hasta){
		//TODO Implementar metodo
		return -1;
	}
	
	/**
	 * Retorna un string con el siguiente formato:
	 * "Cliente: <nombre_del_cliente> - Medidor: SN_<Medidor_SerialNumber>" cuando tiene un medidor asociado
	 * "Cliente: <nombre_del_cliente> - Medidor: N/A" cuando no tienen un medidor asociado
	 * 
	 * ej. "Cliente: juan perez - Medidor: N/A" o
	 * "Cliente: juan perez - Medidor: SN_12"
	 *
	 */
	public String toString() {
		//TODO Implementar metodo
		return null;
	}
}
