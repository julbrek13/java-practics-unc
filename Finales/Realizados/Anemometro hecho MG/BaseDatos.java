import java.util.*;
/**
 * Esta clase implementa una base de datos de objetos Registro
 * y brinda algunos metodos para obtener datos sobre estos.
 * 
 * @author Gleria Martin
 * @version 1.0
 */
public class BaseDatos implements Historial
{
    private List<Registro> registro;

    /**
     * Un objeto BaseDatos es una coleccion de objetos Registro.
     */
    public BaseDatos()
    {
        registro=new ArrayList<Registro>();
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
	    if(registro.isEmpty()) return null;
	    
	    Registro aux=registro.get(0);
	    for(Registro reg: registro){
    	    if(reg.getFecha().esAnteriorA(aux.getFecha())){
    	        aux=reg;
    	    }    
	    }
	    return aux;
	   
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
	   if(r==null) throw new IllegalArgumentException("Registro inválido");
	  // if(registro.contains(r)) throw new RegistroDuplicadoException("ID de registro invalida, este registro ya existe.");
	   
	    for(Registro reg: registro)
	   {
	       if(r.getID().equals(reg.getID())){
	           throw new RegistroDuplicadoException("Este registro ya existe");
	       }       
	   }
	   
	   registro.add(r);   
	   }
	
	/**
	 * Busca Registros por ID en el historial. Si no hay
	 * registros con el ID solicitado, retorna NULL.
	 * No acepta NULL como argumento (lanza IllegalArgumentException)
	 * @param ID del registro a buscar
	 * @return El registro solicitado.
	 */
	public Registro getRegistroPorId(String id)
	{
	    if(id==null) throw new IllegalArgumentException("Registro inválido");
	    
	   for(Registro reg: registro)
	   {
	       if(id.equals(reg.getID())){
	           return reg;
	       }       
	   }
	   return null;
    }
	     
	/**
	 * Remueve todos los Registros del Historial
	 */
	public void eliminarTodosLosRegistros()
	{
	    registro.clear();
	}
	
	/**
	 * Retorna la cantidad total de registros que hay
	 * cargados en el historial
	 * @return
	 */
	public int getNumeroDeRegistros()
	{
	    return registro.size();
	}
	
	/**
	 * Retorna la cantidad de registros que hay cargados
	 * en el historial por tipo
	 * @param tipo
	 * @return
	 */
	public int getNumeroDeRegistrosPorTipo(TipoRegistro tipo)
	{
	    int contador=0;
	    for(Registro reg: registro){
	        if(reg.getTipo().equals(tipo)) contador++;
	    }
	    
	    return contador;
	}
	
	/**
	 * Retorna un mapa de <String, Registro>, en donde
	 * el String representa el ID del registro
	 * 
	 * @return
	 */
	public Map<String, Registro> getMapaDeRegistrosPorId()
	{
	    Map<String, Registro> mapa= new HashMap<String, Registro>(); 
	    for(Registro reg: registro){
	        mapa.put(reg.getID(),reg);
	       }
	       
	    return mapa;
	}       
}
