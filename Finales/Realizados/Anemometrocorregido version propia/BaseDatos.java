import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
/**
 * Write a description of class BaseDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseDatos implements Historial
{
    // instance variables - replace the example below with your own
    private List <Registro> historial;
    
    private Map <String, Registro > mapa;

    /**
     * Constructor for objects of class BaseDatos
     */
    public BaseDatos()
    {
       historial = new ArrayList <Registro> ();
       
       mapa = new HashMap <String, Registro> ();
    }

    /**
	 * Devuelve el registro con la fecha m�s antigua en
	 * el Historial, o NULL cuando el historial esta vacio
	 * 
	 * @return el registro mas antiguo del historial 
	 * 
	 */
	public Registro getRegistroMasViejo()
	{
         if (historial.isEmpty())
         return null;
         else {return historial.get(0); }
        }
	  
     
        /**
	 * Agrega un nuevo registro al historial. No acepta
	 * registros NULL (lanza IllegalArgumentException)
	 * @param r
	 * @throws RegistroDuplicadoException cuando se intenta
	 * agregar registros con el mismo ID
	 * 
	 */
	public void agregarRegistro(Registro r) throws RegistroDuplicadoException
	{
	    if (r == null)
	     {throw new IllegalArgumentException(); }
	     
	     for (Registro regi : historial )
	     {
	         if (regi.getID() == r.getID())
	         {
	             throw new RegistroDuplicadoException ();
	           }
	       }
	       
	       historial.add(r);
	   }
	  
	
	/**
	 * Busca Registros por ID en el historial. Si no hay
	 * registros con el ID solicitado, retorna NULL.
	 * No acepta NULL como argumento (lanza IllegalArgumentException)
	 * @param id
	 * @return
	 */
	 public Registro getRegistroPorId(String id)
	 {
	      if (id == null )
	    {
	        throw new IllegalArgumentException ();
	       }
	       
	     Registro reg = null;
	     for (Registro regi : historial )
	     {
	         if (regi.getID()== id)
	         {
	                  reg = regi; 
	              return reg; }
	           
	      }
	   
	    
	       
	       return null;
	   }
	   
	   
	   /**
	 * Remueve todos los Registros del Historial
	 */
	public void eliminarTodosLosRegistros()
	{
	  historial.clear ();
     }
     
     
     
     /**
	 * Retorna la cantidad total de registros que hay
	 * cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros()
	{
	    return historial.size();
	   }
	  
	   
	   
	   /**
	 * Retorna la cantidad de registros que hay cargados
	 * en el historial por tipo
	 * @param tipo
	 * @return
	 */
	public int getNumeroDeRegistrosPorTipo(TipoRegistro tipo)
	{
	  int i =0;
	  for (Registro regi: historial )
	  {
	      	if (regi.getTipo().equals(tipo))
	      	{
	      	    i++;
	      	}
	   }
	   return i;
      }
     
      
      /**
	 * Retorna un mapa de <String, Registro>, en donde
	 * el String representa el ID del registro
	 * 
	 * @return
	 */
	public Map<String, Registro> getMapaDeRegistrosPorId()
	{
	    for (Registro regi : historial)
	    {
	        mapa.put(regi.getID() , regi);
	       }
	       return mapa;
	   }
      
}
