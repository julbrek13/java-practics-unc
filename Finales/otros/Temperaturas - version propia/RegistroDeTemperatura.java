
/**
 * Write a description of class RegistroDeTemperatura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroDeTemperatura extends Registro
{
    // instance variables - replace the example below with your own
    
    private Temperatura temp;
    private TipoRegistro tipo;
    /**
     * Constructor for objects of class RegistroDeTemperatura
     */
    public RegistroDeTemperatura(int tempAbsoluta, int anio, int dia, int hora, int minuto)
    {
        
        super (anio,dia,hora,minuto);
       
        try
        {
            temp = new Temperatura(tempAbsoluta); }
            catch (TemperaturaInvalidaException e)
            {
                throw new IllegalArgumentException();
            }
                
        tipo = TipoRegistro.TEMPERATURA;
    }

    
    /**
     * Este m�todo retorna el objeto de la clase Temperatura asociado a este Registro
     */
   public Temperatura getTemperatura(){
       return temp;
    }

     public TipoRegistro getTipo(){
         return tipo;
        }
    }
