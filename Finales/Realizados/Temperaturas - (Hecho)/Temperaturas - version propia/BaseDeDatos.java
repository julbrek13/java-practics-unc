import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.String;

/**
 * Write a description of class BaseDeDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseDeDatos implements Historial
{
    
   private ArrayList<Registro> registros;

    /**
     * Constructor for objects of class BaseDeDatos
     */
    public BaseDeDatos()
    {
       registros= new ArrayList<Registro>();
    }
/**
	 * Devuelve el registro con la fecha mas antigua en el Historial, o NULL cuando
	 * el historial est� vac�o
	 * 
	 * @return el registro m�s antiguo del historial 
	 * 
	 */
	public Registro getRegistroMasViejo(){
	    Registro regi= registros.get(0);
	    if( !registros.isEmpty())
	    {
	    Iterator<Registro> it= registros.iterator();
	    while(it.hasNext())
	    {
	        Registro reg= it.next();
	        if(reg.getFecha().esAnteriorA(regi.getFecha()))
	        {
	            regi= reg;
	            
	       }
	    
	   }
	   
	   }
	   

	    return regi;
	   
	   }
	/**
	 * Agrega un nuevo registro al historial. No acepta registros NULL (lanza IllegalArgumentException)
	 * @param r
	 * @throws RegistroDuplicadoException cuando se intenta agregar m�s de una vez el MISMO registro al historial
	 * 
	 */
	public void agregarRegistro(Registro r) throws RegistroDuplicadoException{
	    if(r==null)
	    {
	        throw new IllegalArgumentException("registro invalido");
	       }
	       Iterator<Registro> it= registros.iterator();
	    while(it.hasNext())
	    {
	        Registro reg= it.next();
	        if(reg.equals(r))
	        {
	            throw new RegistroDuplicadoException();
	           }
	        else{
	            registros.add(r);
	           }
	    
	   }
	   
}
	
	/**
	 * Busca Registros por ID en el historial. Si no hay registros con el ID solicitado, retorna NULL.
	 * No acepta NULL como argumento (lanza IllegalArgumentException)
	 * @param id
	 * @return
	 */
	public Registro getRegistroPorId(String id){
	    if(id.length() == 0)
	    {
	        throw new IllegalArgumentException("id invalido");
	       }
	
	Iterator<Registro> it= registros.iterator();
	Registro registroNuevo=null;
	while(it.hasNext())
	    {
	        Registro reg= it.next();
	        if(reg.getID().equals(id))
	        {
	            registroNuevo= reg;
	    
	   }
}
return registroNuevo;
}
		/**
	 * Remueve todos los Registros del Historial
	 */
	public void eliminarTodosLosRegistros(){
	    registros.clear();
	   }
	
	/**
	 * Retorna la cantidad de registros que hay cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros(){
	    return registros.size();
	   }
	
	/**
	 * Retorna una lista con todos los registros del tipo solicitado existentes en el historial
	 * Si el tipo solicitado es NULL, devuelve una lista vac�a.
	 * @param tipo
	 * @return
	 */
	public ArrayList<Registro> getRegistrosPorTipo(TipoRegistro tipo){
	    ArrayList<Registro> registross= new ArrayList<Registro>();
	    if(tipo== null)
	    {
	        return registross;
	       }
	    
	     Iterator<Registro> it= registros.iterator();
	    while(it.hasNext())
	    {
	        Registro reg= it.next();
	        if(reg.getTipo()== tipo)
	        {
	            registross.add(reg);
	           }
	        
	    
	    
	   }
       return registross;
}
}