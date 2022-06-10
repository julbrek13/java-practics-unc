
/**
 * Write a description of class RegistroAnemometro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroAnemometro extends Registro
{
    // instance variables - replace the example below with your own
   private int velocidad;
   private Direccion direccion;
   private TipoRegistro tipo;
    /**
     * Constructor for objects of class RegistroAnemometro
     */
    public RegistroAnemometro(String id, int anio, int dia, int hora, int minuto,int velocidad, Direccion direccion)
     {
       super (id, anio, dia, hora, minuto);
       
       if (velocidad < 0)
       {
           throw new IllegalArgumentException ();
        }
        
         if ((direccion == Direccion.NA)&&(!(velocidad==0)))
        {
            throw new IllegalArgumentException ();
       }
       
       this.direccion = direccion;
       this.velocidad = velocidad;
       tipo=TipoRegistro.ANEMOMETRO;
    }
       

    /**
	 * Setea el ID de este registro. El ID se guarda como una
	 * cadena mayuscula y sin espacios. 
	 * @param id
	 * @throws InvalidArgumentException cuando el ID es nulo o vacio. 
	 */
	public  void setID(String id)
	{ 
	    
	   if ((id == null))
	   {
	       throw new  IllegalArgumentException();
	   }
	   
	   this.id = id.trim().toUpperCase();
    }
    
    /**
	 * Devuelve el tipo de registro.
	 * @return
	 */
	public  TipoRegistro getTipo()
	{
	    return tipo;
	   }
}
    
    
    

