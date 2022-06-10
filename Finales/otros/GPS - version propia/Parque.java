
/**
 * Write a description of class Parque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parque extends PuntoInteres
{
    // instance variables - replace the example below with your own
     private String id;
    private Coordenada coordenada;
    private Tipo tipo;
    
    /**
     * Constructor for objects of class Parque
     */
    public Parque(Coordenada c, String id)
    {
         super (c, id);
         tipo = Tipo.PARQUE;
    }      
   
 public  Tipo getTipo()
 {
     return tipo;
    }
}
