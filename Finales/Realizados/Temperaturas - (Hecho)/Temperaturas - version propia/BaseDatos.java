import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class BaseDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseDatos implements Historial
{
    // instance variables - replace the example below with your own
    private HashMap <String, Registro> registros;
    
    
    /**
     * Constructor for objects of class BaseDatos
     */
    public BaseDatos()
    {
        // initialise instance variables
        registros = new HashMap <String, Registro> ();
    }

    /**
	 * Devuelve el registro con la fecha mas antigua en el Historial, o NULL cuando
	 * el historial est� vac�o
	 * 
	 * @return el registro m�s antiguo del historial 
	 * 
	 */
	public Registro getRegistroMasViejo()
	{
	    Registro reg= registros.get("Reg_0");
	    if (registros.isEmpty()) { return null; }
	    for (Registro r: registros.values())
	    {
	        if (r.getFecha().esAnteriorA(reg.getFecha()))
	           { reg = r;
	           }
	       }
	       return reg;
	      }
	      
	      /**
	 * Agrega un nuevo registro al historial. No acepta registros NULL (lanza IllegalArgumentException)
	 * @param r
	 * @throws RegistroDuplicadoException cuando se intenta agregar m�s de una vez el MISMO registro al historial
	 * 
	 */
	public void agregarRegistro(Registro r) throws RegistroDuplicadoException
	{
	    if (r == null) throw new IllegalArgumentException() ;
	    if (registros.containsValue(r)) throw new RegistroDuplicadoException();
	    else {
	        registros.put(r.getID(), r);
	       }
	   }
	   
	   /**
	 * Busca Registros por ID en el historial. Si no hay registros con el ID solicitado, retorna NULL.
	 * No acepta NULL como argumento (lanza IllegalArgumentException)
	 * @param id
	 * @return
	 */
	public Registro getRegistroPorId(String id)
	{
	    if (id == null) throw new IllegalArgumentException();
	    for (Registro r: registros.values())
	    {
	        if (r.getID() == id) return r;
	       }
	       
	       throw new IllegalArgumentException();
	           
	       
        
    }
    
        /**
	 * Remueve todos los Registros del Historial
	 */
	public void eliminarTodosLosRegistros()
	{
	    registros.clear();
	   }
	   
	   /**
	 * Retorna la cantidad de registros que hay cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros()
	{
	    return registros.size();
	   }
	   
	   
	   /**
	 * Retorna una lista con todos los registros del tipo solicitado existentes en el historial
	 * Si el tipo solicitado es NULL, devuelve una lista vac�a.
	 * @param tipo
	 * @return
	 */
	public List<Registro> getRegistrosPorTipo(TipoRegistro tipo)
	{
	    List <Registro> lista = new ArrayList <Registro> ();
	    if ( tipo == null) return lista;
	    else 
	    {
	        for (Registro r: registros.values())
	        {
	            if (r.getTipo() == tipo)
	            {
	                lista.add(r);
	               }
	           }
	           return lista;
	       }
	   }
}
	        