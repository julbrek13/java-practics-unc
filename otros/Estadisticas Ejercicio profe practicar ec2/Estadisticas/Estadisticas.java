import java.util.ArrayList;
import java.util.HashSet;

/**
 *   Muestra estadisticas de la pandemia
 */
public class Estadisticas
{
    ArrayList <Prueba> tests;

    /**
     * Constructor por defecto, debe inicializar la coleccion.
     */
    public Estadisticas(ArrayList<Prueba> t)
    {
        tests = t;
    }
        
    /**
     * Devuelve un HashSet con los test segun el tipo de contagio tc
     * si recibe rapidas = false NO considera pruebas rapidas (test Serologicos)
     * Debe implementar el enumerado TipoContagio en el proyecto con tres
     * valores posibles IMPORTADO, CONTAC_ESTRECHO, TRANS_COMUNITARIA.
     */
    public HashSet<Prueba> listarPorTipoContagio(Object tc, boolean rapidas)
    {
        return null;
    }

    /**
     * Devuelve un HashSet con los test segun el sexo de la persona testeada
     * si recibe rapidas = false NO considera pruebas rapidas (test Serologicos)
     */
    public HashSet<Prueba> listarPorSexo(Sexo s , boolean rapidas)
    {
        return null;
    }        
    
    /**
     * Devuelve todos los test del tipo PCR
     */
    public HashSet<PCR> listarPCRs()
    {
        return null;
    }
    
    /**
     * Debe devolver una cadena con el siguiente formato:
     * Estadisticas SARS-COV-2 :
     * Tests efectuados: xxxx
     * Positivos: xxxx
     * Negativos: xxxx
     * Tipo transmision (%IMP,%CE,%TC) : (xx%,xx%,xx%) 
     */
    public String toString(){
        return null;
    }
}
