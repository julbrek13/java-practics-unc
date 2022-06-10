import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
/**
 * Write a description of class BaseeDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseeDatos implements Historial
{
    private ArrayList<Registro> registros;

    /**
     * Constructor for objects of class BaseeDatos
     */
    public BaseeDatos()
    {
        registros = new ArrayList<Registro>();
       
    }
    /**
     * Devuelve el registro con la fecha m�s antigua en
     * el Historial, o NULL cuando el historial esta vacio
     * 
     * @return el registro mas antiguo del historial 
     * 
     */
    public Registro getRegistroMasViejo(){
        if(registros.isEmpty())
        {
            return null;
        }
        Registro aux= registros.get(0);
        

        
        Iterator<Registro> it= registros.iterator();
        while(it.hasNext())
        {
            Registro reg= it.next();
            if(reg.getFecha().esAnteriorA(aux.getFecha()))
            {
                aux= reg;
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
    public void agregarRegistro(Registro r) throws RegistroDuplicadoException{
        if(r==null)
        {
            throw new IllegalArgumentException("el registro no puede ser nulo");
        }
        Iterator<Registro> it= registros.iterator();
        while(it.hasNext())
        {
            Registro reg= it.next();
        
         if(reg.getID().equals(r.getID()))
        {
            throw new RegistroDuplicadoException(" el id del registro a agregar ya existe");
        }
        else {
            registros.add(r);            
            
        }
        }
       }
    
    /**
     * Busca Registros por ID en el historial. Si no hay
     * registros con el ID solicitado, retorna NULL.
     * No acepta NULL como argumento (lanza IllegalArgumentException)
     * @param id
     * @return
     */
    public Registro getRegistroPorId(String id){
        if(id==null)
        {
            throw new IllegalArgumentException("id invalido");
        }
        Iterator<Registro> it= registros.iterator();        
        Registro registro= null;
        while(it.hasNext())
        {
            Registro reg= it.next();
        
         if(reg.getID().equals(id))
         {
             registro= reg;             
            }     
        
    }
    return registro;

}
    /**
     * Remueve todos los Registros del Historial
     */
    public void eliminarTodosLosRegistros(){
        registros.clear();
    }
    
    /**
     * Retorna la cantidad total de registros que hay
     * cargados en el historial
     * @return
     */
    public int getNumeroDeRegistros(){
       return registros.size();
    
    }
    
    /**
     * Retorna la cantidad de registros que hay cargados
     * en el historial por tipo
     * @param tipo
     * @return
     */
    public int getNumeroDeRegistrosPorTipo(TipoRegistro tipo){
        int cantRegistros=0;
         Iterator<Registro> it= registros.iterator();
        while(it.hasNext())
        {
            Registro reg= it.next();
            if(reg.getTipo()== tipo)
            {
                cantRegistros ++;             
        
       }
    }
    return cantRegistros;
}
    
    /**
     * Retorna un mapa de <String, Registro>, en donde
     * el String representa el ID del registro
     * 
     * @return
     */
    public HashMap<String, Registro> getMapaDeRegistrosPorId(){
        HashMap<String, Registro> mapaDeRegistro= new HashMap<String, Registro>();
        for(Registro reg: registros)
        {
            mapaDeRegistro.put(reg.getID(), reg);
        }
        return mapaDeRegistro;
    }           
}



