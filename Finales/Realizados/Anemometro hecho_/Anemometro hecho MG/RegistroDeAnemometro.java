import java.lang.String;
/**
 * Write a description of class RegistroDeAnemometro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroDeAnemometro extends Registro
{
   private int anio;
   private int dia;
   private int hora;
   private int minuto;
   private String id;
   private Direccion direccion;
   private int velocidad;
   private TipoRegistro tipo;
    /**
     * Constructor for objects of class RegistroDeAnemometro
     */
    public RegistroDeAnemometro(String id,int anio,int dia,int hora,int minuto, int velocidad, Direccion direccion)
    {
        super(id, anio, dia, hora, minuto);
        if(velocidad<0)
        {
            throw new IllegalArgumentException("la velocidad no puede ser invalida");
        }
        else
        {
            this.velocidad= velocidad;
        }
        if(direccion==null)
        {
             throw new IllegalArgumentException("argumento invalido");
            }
        else
        {
            this.direccion= direccion;
        }
        
        
        tipo= TipoRegistro.ANEMOMETRO;
    }
    /** Setea el ID de este registro. El ID se guarda como una
	 * cadena mayuscula y sin espacios. 
	 * @param id
	 * @throws InvalidArgumentException cuando el ID es nulo o vacio. 
	 */
    public  void setID(String id){
        if(id.trim().toLowerCase()== null || id.trim().toLowerCase().length()==0)
        {
            throw new IllegalArgumentException("argumentos invalidos");
        }
        else
        {
        
         this.id= id.trim().toLowerCase();;
        }
        
    }
    
    /**
     * Devuelve el tipo de registro.
     * @return
     */
    public TipoRegistro getTipo(){
        return tipo;
       }
    public Direccion getDireccion(){
           return direccion;
      }
	   
   public int getVelocidad()
   {
       return velocidad;
    }

    
}
