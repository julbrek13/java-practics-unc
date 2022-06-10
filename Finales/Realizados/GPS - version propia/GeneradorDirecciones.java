import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class GeneradorDirecciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneradorDirecciones implements Decodificador
{
    // instance variables - replace the example below with your own
    private List <String> direcciones;
    

    /**
     * Constructor for objects of class GeneradorDirecciones
     */
    public GeneradorDirecciones()
    {
        direcciones = new ArrayList <String> ();
    }

     /**
     * Decodifica un string, procesando la linea (ignorando espacios, mayusculas/minusculas) de 
     * forma tal de generar una dirección del tipo Direccion.
     * Cuando la linea no puede ser decodificada, la direccion devuelta es desconocida.
     * 
     */
    public Direccion decodifica(String linea)
    {
        linea = linea.trim().toLowerCase();
        if (linea == "north")
        {
            return Direccion.NORTE;
        }
        else if (linea == "south")
        {
            return  Direccion.SUR;
        }
        else if ( linea == "west")
        {
            return Direccion.OESTE;
        }
        else if (linea == "east")
        {
           return Direccion.ESTE;
        }
        
        else 
        {
            return Direccion.DESCONOCIDO;
        }
        
    }
}
