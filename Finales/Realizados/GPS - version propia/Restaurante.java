
/**
 * Write a description of class Restaurante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restaurante extends PuntoInteres
{
    // instance variables - replace the example below with your own
    private String id;
    private Coordenada coordenada;
    private Tipo tipo;
    /**
     * Constructor for objects of class Restaurante
     */
    public Restaurante(Coordenada c, String id)
    {
        // initialise instance variables
        super (c, id);
        tipo = Tipo.RESTAURANTE;
    }
    
    public  Tipo getTipo()
    {
        return tipo;
    }
   
}
