
/**
 * Write a description of class Cubo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubo extends Cuerpo3D implements Geometria
{
    // instance variables - replace the example below with your own
    private int lado;
   
   
    /**
     * Constructor for objects of class Cubo
     */
    public Cubo( Material m,Color c, int lado)
    {
        // initialise instance variables
        super(m);
        try {
            pintar(c);
            setLado(lado);
        }
            catch (IllegalArgumentException e) { throw new IllegalArgumentException (); }
            catch (CombinacionInvalidaException e) { throw new IllegalArgumentException (); }
            
    }
    
    
    /**
     * para setear el lado del cubo
     * y tal que lance una IllegalArgumentException
     * cuando el lado es negativo con el mensaje "lado invalido".
     */
    public void setLado(int lado)
    {
     if (lado <= 0) throw new IllegalArgumentException("lado invalido");
     else{
         this.lado = lado;
        }
    }
    
    
    /**
	 * Devuelve el tipo del Cuerpo. Por ejemplo para instancias de la clase Cubo retorna 
	 * "cubo", para instancias de la clase Esfera retorna "esfera", para instancias de 
	 * la clase Cilindro retorna "cilindro", etc.
	 * 
	 * @return el tipo de Cuerpo
	 */
	public String getNombreDeCuerpo()
	{
	    return "cubo";
	   }
    /**
	 * Devuelve el volumen de este Cuerpo 3D
	 * @return
	 */
	public int getVolumen()
	{
	    return Volumen();
	   }
    /**
	 * Calcula el volumen del objeto 3D.
	 * @return volumen del cuerpo
	 */
	public int Volumen()
	{
	    int volumen = lado*lado*lado;
	    return volumen;
  }
  
  /**
	 * Calcula la superficie del objeto 3D (suma de todas las caras).
	 * @return superficie del cuerpo
	 */
	public int Superficie()
	{
	    int superficie = lado*lado*6;
	    return superficie;
	   }

	   /**
	    * retorna una cadena con el siguiente formato:
	    * "Cubo de <MATERIAL> color <COLOR> de lado <LADO>, volumen <VOLUMEN> y superficie <SUPERFICIE>"
	    */
     public String toString()
     {
         return "Cubo de "+getMaterial()+" color "+getColor()+" de lado "+lado+","+" volumen"+Volumen()+" y superficie "+Superficie();
        }

}
