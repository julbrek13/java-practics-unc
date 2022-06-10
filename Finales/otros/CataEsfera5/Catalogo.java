import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalogo {
    
    /**
     * Nombre del alumno.
     */
    public static final String ALUMNO = "";
    
    /**
     * Cantidad total de objetos de la clase Catalogo. Se incrementa cada vez
     * que se crea un objeto de esta clase
     */
    public static int contador = 0;
    
    /**
     * Mapa que contiene Cuerpos3D con su respectivo ID
     */
    private HashMap<String, Cuerpo3D> mapaDeCuerpos;
    
    /**
     * Este String representa el identificador de este catálogo. Es de la forma
     * "id_<nro>" donde <nro> corresponde al valor del contador de Catalogos
     *  al momento de la creación de este Contador. 
     */
    private final String idDeCatalogo;
    
    
    /**
     * Implemente el constructor tal que inicialice las variables de instancia
     * y actualice las variables de clase.
     */
    public Catalogo()
    {

    }
    
    
    /**
     * Agrega un Cuerpo3D al mapa de cuerpos de este catalogo.
     * El id debe guardarse en minúsculas y sin espacios (principio o fin del string). 
     * Retorna true si se agregó correctamente, false si el id es null o vacío, o si el 
     * cuerpo3D es null.
     * 
     * @param id 
     * @param cuerpo
     * @return false si id es null o vacío, o si el cuerpo3D es null
     */
    public boolean agregarCuerpo(String id, Cuerpo3D cuerpo)
    {

    }
    
    
    /**
     * Elimina del catalogo el cuerpo con este id.
     * El id debe convertirse a minúsculas y sin espacios (principio o fin del string).
     * @param id
     * @return false si no existe un cuerpo con este id en el catalogo
     */
    public boolean eliminarCuerpo(String id){

    }
    
        
    /**
     * 
     * @return el id de este catalogo
     */
    public String getId()
    {
    }
    
    /**
     * 
     * @return la cantidad de cuerpos de este catalogo 
     */
    public int getCantidadDeCuerposTotal()
    {

    }
    
    /**
     * Devuelve una lista de Cuerpos de este catalogo cuyo material fue pasado
     * como argumento
     * @param m
     * @return lista de cuerpos de material m
     */
    public List<Cuerpo3D> listarCuerposPorMaterial(Material m)
    {

    }
    
    /**
     * Devuelve un String con el siguiente formato:
     * "Catalogo <id del catalogo> con <cantidad total de cuepos 3D> cuerpos.";
     */
    public String toString()
    {

    }
}
