
/**
 * Write a description of class RegistroTemperatura here.
 * 
 * @author    Gonzalo Exequiel Rodriguez Isleño
 * @version     1.0
 */

/**
 * Clase que implementa un Registro de temperatura.
 */

public class RegistroTemperatura  extends Registro 
{    
    private Temperatura temperatura ; 
    private TipoRegistro tipo ;
   /**
    *   Constructor por argumentos de un registro de temperatura
    *   @param temp  Temperatura en grados Kelvin ( > 0 ) 
    *   @param anio  Año del registro. ( >= 1900 ) 
    *   @param dia  Día del registro. ( >=1 y <365 ) 
    *   @param dia  Hora del registro. ( >=0 y <24 ) 
    *   @param minuto  Minuto del registro ( >=0 y <60) 
    *   @throws IllegalArgumentException cuando alguno de sus argumentos es inválido.
    */
    
    public RegistroTemperatura ( int temp, int anio, int dia, int hora, int minuto )
    {
        super( anio, dia, hora, minuto ) ;  
        try{ temperatura = new Temperatura (temp) ; 
        } catch ( TemperaturaInvalidaException e ) { 
        throw  new IllegalArgumentException("Temperatura invalida") ;}       
        tipo = TipoRegistro.TEMPERATURA ;
    }
   
   /**
    *   Obtiene la temperatura guardada en el registro.
    *   @return Objeto Temperatura.
    */
 
   public Temperatura getTemperatura() {
        return temperatura ; 
   } 
   
   /**
    *   Obtiene el tipo del registro. 
    *   @return El tipo del registro.
    */ 
   public TipoRegistro getTipo() {
       return tipo; 
   }
   
   /**
    *   Sobrecarga del método equals.
    *   @return Un booleano indicando si son iguales o no.
    */ 
   
   public boolean equals (Object o) {
        if ( o == null || !(o instanceof RegistroTemperatura) )
        { return false ; }
        RegistroTemperatura r = (RegistroTemperatura) o ; 
        return (    temperatura.equals(r.temperatura) && 
                    tipo == r.tipo && 
                    super.getFecha().equals(r.getFecha()) ) ; 
   }  
}
    