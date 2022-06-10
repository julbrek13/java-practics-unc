
/**
 * Write a description of class Esfera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Esfera extends Cuerpo3D implements Dibujable
{
    // instance variables - replace the example below with your own
     boolean EsVisible;
     private int rad;
    /**
     * Constructor for objects of class Esfera
     */
    public Esfera (Material m, Color c, int radio, boolean visible)
    {
        // initialise instance variables
        
        super(m);
        try {
            pintar (c);
            setRadio(radio);
        }
        catch (IllegalArgumentException e) { throw new IllegalArgumentException (); }
        catch (CombinacionInvalidaException e) { throw new IllegalArgumentException(); }
        EsVisible = visible;     
    }
   
    public void setRadio( int radio) 
    {
        if (radio <=0) throw new IllegalArgumentException("radio invalido");
        else{
              rad = radio;
            }
        }
   
        /** 
         * devuelve el radio de la esfera
         */
        public int getRadio()
        {
            return rad;
        }
        
        /**
	 * Muestra el objeto 3D.
	 * NOTA: Después de llamar a este método, una llamada al método "esVisible()" debería retornar TRUE
	 * 
	 * @return
	 */
	public void mostrar()
	{
	     EsVisible = true;
	   }
	/**
	 * Oculta el objeto 3D
	 * NOTA: Después de llamar a este método, una llamada al método "esVisible()" debería retornar FALSE
	 * @return
	 */
	public void ocultar()
	{
	    EsVisible = false;
	   }
	/**
	 * Muestra la visibilidad del objeto 3D.
	 * @return true si el cuerpo es visible (ha sido mostrado) y false en caso contrario (ha sido ocultado)
	 */
	public boolean esVisible()
	{
	   return EsVisible;
     }
     /**
	 * Devuelve el volumen de este Cuerpo 3D
	 * @return
	 */
	public  int getVolumen()
	{
	    int volumen = (4/3) *PI*rad*rad*rad;
	    return volumen;
	   }
	   
	   /**
	 * Devuelve el tipo del Cuerpo. Por ejemplo para instancias de la clase Cubo retorna 
	 * "cubo", para instancias de la clase Esfera retorna "esfera", para instancias de 
	 * la clase Cilindro retorna "cilindro", etc.
	 * 
	 * @return el tipo de Cuerpo
	 */
	public  String getNombreDeCuerpo()
	{
	    return "esfera";
	   }
	   
	   /**
	    * retorna una cadena con el siguiente formato:
	    * "Esfera de color <COLOR> de <MATERIAL> de radio <radio>"
	    */
	   public String toString() {
	       return "Esfera de color "+ getColor()+" de "+getMaterial()+" de radio "+ getRadio();
	   }
}
