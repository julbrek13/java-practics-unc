import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a description of class RegistroDeLlamadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroDeLlamadas extends Registro
{

    /**
      * Constructor. 
      */ 
     RegistroDeLlamadas () { 
         super() ; 
        }
 /**
     * Devuelve una lista con las llamadas cursadas o recibidas del numero
     * telefonico pasado como par�metro.
     * Un numero valido contiene 10 digitos (luego de remover espacios
     * previos o posteriores si los hubiera).
     * 
     * @param numero
     * @return Lista de llamadas 
     * @throws NumeroInvalidoException cuando el numero es null o con un formato invalido.
     */
    public List<Llamada> getLlamadasPorNumero (String numero) throws NumeroInvalidoException{
        if ( numero.trim().length() != 10 || numero == null ) {
            throw new NumeroInvalidoException ();
        }
        List<Llamada> listaLlamadasPorNumero = new ArrayList<Llamada> ();
        for ( Llamada l : super.getRegistroCompleto() ) { 
            if ( l.getNumero().equals(numero) ){ 
                listaLlamadasPorNumero.add(l) ; 
            }
        } 
        return listaLlamadasPorNumero ;
    }
/**
     * 
     * @param saliente true para obtener llamadas salientes, false para llamadas entrantes
     * @return Lista de llamadas
     */
    public List<Llamada> getLlamadasPorDestino (boolean saliente){
        List<Llamada> listaLlamadasPorDestino = new ArrayList<Llamada> ();
        for ( Llamada l : super.getRegistroCompleto() ) { 
            if ( l.isSaliente() == saliente ){ 
                listaLlamadasPorDestino.add(l) ; 
            }
        } 
        return listaLlamadasPorDestino;
    }
    /**
     * Devuelve un entero con la duracion total de las llamadas salientes y
     * entrantes, en segundos
     * 
     * @return duracion total de llamadas
     */
    public int getDuracionTotalLlamadas () {
         int acumulador = 0 ;
         for ( Llamada l : super.getRegistroCompleto() ){
             acumulador+=l.getDuracionEnSegundos() ;
            } 
            return acumulador ;
        }
    
    /**
     * Devuelve un mapa <String, EstadisticasNumero> 
     * con las estadisticas de cada numero en la lista de llamadas. 
     * 
     * @param llamadas
     * @return
     */
   public Map<String, EstadisticasNumero> getMapaDeEstadisticas (List<Llamada> llamadas){
    HashMap<String,EstadisticasNumero> mapaDeEstadisticas = new HashMap (); 
    Registro r = new RegistroDeLlamadas () ;
    for ( Llamada l : llamadas ) { 
        r.agregarLlamada(l) ; 
    }
    try{
    for ( Llamada l1 : llamadas ) {
        if ( !mapaDeEstadisticas.containsKey(l1.getNumero())){
             EstadisticasNumero estadisticas = new EstadisticasNumero() ; 
             for ( Llamada l : r.getLlamadasPorNumero(l1.getNumero()) ) {
                
                 if ( l.isSaliente() ){
                     estadisticas.incrementarSalientes() ;
                     estadisticas.incremetarDuracionSalientes(l.getDuracionEnSegundos());
                    } else {
                        estadisticas.incrementarEntrantes() ;
                        estadisticas.incrementarDuracionEntrantes(l.getDuracionEnSegundos());
                    }

                }
       mapaDeEstadisticas.put(l1.getNumero(),estadisticas) ; 
            }
        }
    } catch ( NumeroInvalidoException e ) { }
        return mapaDeEstadisticas ; 
    }
}
