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
        contador++;
        mapaDeCuerpos = new HashMap<String, Cuerpo3D>();
        idDeCatalogo = "id_"+contador;
       
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
       id = id.trim().toLowerCase();
       if(id == null) return false;
       if(id.length() == 0) return false;
       else{
           mapaDeCuerpos.put(id, cuerpo);
        }
        return true;
    }
    
    
    /**
     * Elimina del catalogo el cuerpo con este id.
     * El id debe convertirse a minúsculas y sin espacios (principio o fin del string).
     * @param id
     * @return false si no existe un cuerpo con este id en el catalogo
     */
    public boolean eliminarCuerpo(String id){
       id = id.trim().toLowerCase();
       if (!mapaDeCuerpos.containsKey(id))
       {
           return false;
        }
        else {
               mapaDeCuerpos.remove(id);
           }
           return true;
    }
    
        
    /**
     * 
     * @return el id de este catalogo
     */
    public String getId()
    {
        return idDeCatalogo;
    }
    
    /**
     * 
     * @return la cantidad de cuerpos de este catalogo 
     */
    public int getCantidadDeCuerposTotal()
    {
       return  mapaDeCuerpos.size();
    }
    
    /**
     * Devuelve una lista de Cuerpos de este catalogo cuyo material fue pasado
     * como argumento
     * @param m
     * @return lista de cuerpos de material m
     */
    public List<Cuerpo3D> listarCuerposPorMaterial(Material m)
    {
        List<Cuerpo3D> listarCuerposPorMaterial = new ArrayList<Cuerpo3D>();
        for (Cuerpo3D c3d: mapaDeCuerpos.values())
        {
            if (c3d.getMaterial() == m)
            {
                listarCuerposPorMaterial.add(c3d);
            }
        }
        return listarCuerposPorMaterial;
    }
    
    /**
     * Devuelve un String con el siguiente formato:
     * "Catalogo <id del catalogo> con <cantidad total de cuepos 3D> cuerpos.";
     */
    public String toString()
    {
      return "Catalogo "+idDeCatalogo+" con "+getCantidadDeCuerposTotal()+ " cuerpos.";
    }
}
