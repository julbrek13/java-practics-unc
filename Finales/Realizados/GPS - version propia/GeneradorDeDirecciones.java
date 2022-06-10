import java.util.ArrayList;
/**
 * Write a description of class GeneradorDeDirecciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneradorDeDirecciones implements Decodificador

{
    private ArrayList<String> direcciones;
    private String linea;
    public GeneradorDeDirecciones()
    {
        direcciones= new ArrayList<String>();
       
    }
    public Direccion decodifica(String linea){
        
        this.linea= linea.trim().toLowerCase();
        
    }
    

    
}
