import java.util.* ;

/**
 * Clase que implementa el comportamiento requerido por la interfaz @Historial.
 * 
 * @author    Gonzalo Exequiel Rodriguez Isleño
 * @version     1.0
 */

public class BaseDatos implements Historial
{
    private ArrayList<Registro> datos ;

    /**
     * Constructor por defecto de una base de datos. 
     */ 

    public BaseDatos(){
        datos = new ArrayList<Registro> () ; 
    } 
    /**
     * Devuelve el registro con la fecha m�s antigua en el Historial, o NULL cuando
     * el historial est� vac�o
     * 
     * @return el registro m�s antiguo del historial 
     * 
     */
    public Registro getRegistroMasViejo()
    {
        if ( datos.isEmpty() ) 
        {
            return null ; 
        }
        Registro regAuxiliar = datos.get(0) ; 
        for ( Registro reg : datos ) 
        {
            if ( reg.getFecha().esAnteriorA(regAuxiliar.getFecha()) )
            {
                regAuxiliar = reg ;
            } 
        }          
        return regAuxiliar ;  
    }
    /**
     * Agrega un nuevo registro al historial. No acepta registros NULL (lanza IllegalArgumentException)
     * @param r
     * @throws RegistroDuplicadoException cuando se intenta agregar m�s de una vez el MISMO registro al historial.       
     */
    public void agregarRegistro(Registro r) throws RegistroDuplicadoException { 
        if ( r == null ) {
            throw new IllegalArgumentException ("Registro inválido.") ; 
        } else if ( datos.contains(r) ) {     
                throw new RegistroDuplicadoException() ; 
        } else {      
            datos.add(r) ;
        }
    }
         
    /**
     * Busca Registros por ID en el historial. Si no hay registros con el ID solicitado, retorna NULL.
     * No acepta NULL como argumento (lanza IllegalArgumentException)
     * @param id ID del producto.
     * @return el registro que coíncide con el ID ingresado. 
     * @throws IllegalArgumentException si se pasa @id=null 
     */
    public Registro getRegistroPorId(String id){
       if ( id == null ) {
            throw new IllegalArgumentException( "ID inválido" ) ;
       } else {
             for ( Registro reg : datos ) { 
             if ( reg.getID().equals(id) ) {  
                 return reg ; 
             } 
            }   
        return null ;
       } 
    }     
    /**
     * Remueve todos los Registros del Historial
     */
    public void eliminarTodosLosRegistros(){
        datos.clear() ; 
    } 
    
    /**
     * Retorna la cantidad de registros que hay cargados en el historial
     * @return la cantidad de registros en la base de datos.
     */
    public int getNumeroDeRegistros(){
        return datos.size() ; 
    }
    
    /**
     * Retorna una lista con todos los registros del tipo solicitado existentes en el historial
     * Si el tipo solicitado es NULL, devuelve una lista vac�a.
     * @param tipo tipo de los registros buscados
     * @return lista de registros que coinciden con @tipo.
     */
    public List<Registro> getRegistrosPorTipo(TipoRegistro tipo){
        ArrayList<Registro> listaRegistroAux = new ArrayList<Registro> () ;
        if ( tipo == null ) return listaRegistroAux ; 
        for ( Registro reg : datos ) { 
            if ( reg.getTipo() == tipo ) {
                listaRegistroAux.add(reg) ; 
            }
        }
        return listaRegistroAux ;  
    }           

    /**
     * Sobrecarga del método @equals().
     */ 
    public boolean equals ( Object o ) { 
        if ( o == null || !(o instanceof BaseDatos) ) {
            return false ; 
        } else { 
            BaseDatos bd = (BaseDatos) o ;
            return datos.equals(bd.datos) ; 
        }
    }
}

